package com.footprint.common.auth.filter;

import com.footprint.common.auth.token.TypedToken;
import com.footprint.common.config.shiro.UserImpl;
import com.footprint.filter.CaptchaFormAuthenticationFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunb-c on 2016/7/27.
 */
public class MigrationFilter extends CaptchaFormAuthenticationFilter {

    /**
     * Logger for this class
     */
    private static final Logger logger = LogManager.getLogger(MigrationFilter.class.getName());

    private Map<String, String> urlMap = new HashMap<>(10);

    public MigrationFilter(CacheManager cacheManager) {
        super(cacheManager);
        urlMap = new HashMap<>(5);
    }


    @Override
    protected TypedToken createToken(ServletRequest request, ServletResponse response) {

        String username = getUsername(request);
        String password = getPassword(request);
        String captcha = getCaptcha(request);
        boolean rememberMe = isRememberMe(request);
        String host = getHost(request);
        String enterpriseName = getEnterpriseName(request);
        String enterpriseLpName = getEnterpriseLpName(request);
        // 组织机构代码证如果有重复，就让他选交易商id
        String traderId = getTraderId(request);


        logger.info("创建token：username:{},rememberMe:{},enterpriseName:{},enterpriseLpName:{},traderId:{}"
                , () -> username
                , () -> rememberMe
                , () -> enterpriseName
                , () -> enterpriseLpName
                , () -> traderId
        );
        return new TypedToken(username, password, rememberMe, captcha, host, enterpriseName, enterpriseLpName, traderId);
    }

    private String getTraderId(ServletRequest request) {
        return WebUtils.getCleanParam(request, "traderId");
    }

    @Override
    public boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        Subject subject = getSubject(request, response);
        if (subject != null && subject.isAuthenticated()) {
            UserImpl user = (UserImpl) subject.getPrincipal();
            if (user.isHasOrgError()
                    && !httpRequest.getRequestURI().endsWith("common/orgnNumCompletion")
                    && !httpRequest.getRequestURI().endsWith("SelfManagement/jump")
                    && !httpRequest.getRequestURI().endsWith("SelfManagement/selfJump")
                    && !httpRequest.getRequestURI().endsWith("/selfJump.jsp")
                    ) {
                logger.debug("用户组织机构代码证为空。不能继续处理。{}", () -> httpRequest.getRequestURI());
                httpResponse.sendRedirect(httpRequest.getContextPath() + "/common/orgnNumCompletion");
                return false;
            }
        }
        return super.onPreHandle(request, response, mappedValue);
    }

    @Override
    protected void redirectToLogin(ServletRequest request, ServletResponse response) throws IOException {

        String uri = super.getPathWithinApplication(request);

        for (Map.Entry<String, String> entry : urlMap.entrySet()) {
            boolean multiUrlMatch = multiUrlMatch(entry.getValue(), uri);
            if (multiUrlMatch) {
                String redirectUrl = entry.getKey();
                logger.info("需要权限。根据映射配置，跳转到{}.", () -> redirectUrl);
                WebUtils.issueRedirect(request, response, redirectUrl);
                return;
            }
        }
        logger.info("需要权限。使用默认跳转.");
        super.redirectToLogin(request, response);
    }

    private boolean multiUrlMatch(String patterns, String uri) {

        String[] pathPatterns = patterns.split(",");
        for (String pathPattern : pathPatterns) {
            if (pathsMatch(pathPattern, uri)) {
                logger.debug("匹配路径成功。pattern:{},uri:{}", () -> pathPattern, () -> uri);
                return true;
            }
        }
        return false;
    }

    @Override
    protected boolean isLoginRequest(ServletRequest request, ServletResponse response) {
        boolean b = super.isLoginRequest(request, response);
        return b || isMappedLoginUrl(request);
    }

    private boolean isMappedLoginUrl(ServletRequest request) {
        for (String key : urlMap.keySet()) {
            if (pathsMatch(key, request)) {
                return true;
            }
        }
        return false;
    }

    private String getEnterpriseLpName(ServletRequest request) {
        return WebUtils.getCleanParam(request, "enterpriseLpName");
    }

    private String getEnterpriseName(ServletRequest request) {
        return WebUtils.getCleanParam(request, "enterpriseName");
    }

    public void setUrlMap(Map<String, String> urlMap) {
        this.urlMap = urlMap;
        //for (Map.Entry<String, String> entry : urlMap.entrySet()) {
        //
        //}
    }
}

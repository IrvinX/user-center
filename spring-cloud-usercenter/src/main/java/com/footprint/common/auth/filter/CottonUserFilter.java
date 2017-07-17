package com.footprint.common.auth.filter;

import com.footprint.common.config.shiro.UserImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.UserFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by sunb-c on 2016/8/31.
 * 用户的组织机构代码证如果没有的话，不能进入系统。
 * 系统现在默认“user”就可以登录，所以这个地方也得加上这个逻辑
 * 和auth这个filter处理是一样的,代码有重复。
 * 需要在注入到ShiroFilterFactoryBean里边
 * */
public class CottonUserFilter  extends UserFilter {

    /**
     * Logger for this class
     */
    private static final Logger logger = LogManager.getLogger(CottonUserFilter.class.getName());
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
}

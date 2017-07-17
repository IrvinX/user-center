package com.footprint.common.auth.credentials;

import com.footprint.common.auth.token.TypedToken;
import com.footprint.common.config.shiro.UserImpl;
import com.footprint.common.util.MD5Util;
import com.footprint.credentials.RetryLimitHashedCredentialsMatcher;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * Created by sunb-c on 2016/7/25.
 */
public class CottonMatcher extends RetryLimitHashedCredentialsMatcher {

    /**
     * Logger for this class
     */
    private static final Logger logger = LogManager.getLogger(CottonMatcher.class.getName());

    public CottonMatcher(CacheManager cacheManager) {
        super(cacheManager);
    }


    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        return this.doMatch(token, info);
    }

    @Override
    protected boolean doMatch(AuthenticationToken token, AuthenticationInfo info) {

        logger.info("~~~~方法开始~~~~ {}.{}", () -> "CottonMatcher", () -> "doMatch");

        PrincipalCollection ss = info.getPrincipals();
        Object ob = ss.getPrimaryPrincipal();

        if (ob instanceof UserImpl) {
            UserImpl user = (UserImpl) ss.getPrimaryPrincipal();

            TypedToken ctoken = (TypedToken) token;


            boolean passwordMatch;

            if (user.getPasswordType() == 1) {
                logger.info(() -> "使用e棉网登录算法。");
                Object tokenHashedCredentials = hashProvidedCredentials(token, info);
                Object accountCredentials = getCredentials(info);
                passwordMatch = equals(tokenHashedCredentials, accountCredentials);
            } else {
                logger.info(() -> "使用旧系统登录算法。");
                Object tokenHashedCredentials = MD5Util.getMD5(user.getUserName(), String.valueOf(ctoken.getPassword()));
                Object accountCredentials = user.getOldPassword();
                if (accountCredentials == null) {
                    logger.warn(() -> "没用找到旧系统算法的凭证。");
                    passwordMatch = false;
                } else {
                    passwordMatch = equals(tokenHashedCredentials, accountCredentials);
                }
            }
            // TODO: 测试用，所有都通过
            //passwordMatch = true;
            // 额外信息检查
            if (passwordMatch && tooSimple(ctoken)) {
                extInfoEquals(ctoken, user);
            }
            return passwordMatch;
        }
        return false;
    }

    private void extInfoEquals(TypedToken ctoken, UserImpl user) {

        logger.info(() -> "检查额外信息.");
        if (StringUtils.isBlank(ctoken.getEnterpriseFullName()) && StringUtils.isBlank(ctoken.getEnterpriseLpName())) {
            logger.debug("没有公司名称和法人信息。");
//            throw new PasswordNotSafeException();
        }

        if (!StringUtils.equalsIgnoreCase(user.getEnterpriseName(), ctoken.getEnterpriseFullName())) {
            logger.debug("检查额外信息失败(企业名称).数据库：{}, 用户:{}", () -> user.getEnterpriseName(), () -> ctoken.getEnterpriseFullName());
//            throw new ExtInfoCheckException();
        }
        if (!StringUtils.equalsIgnoreCase(user.getEnterpriseLpName(), ctoken.getEnterpriseLpName())) {
            logger.debug("检查额外信息失败(企业法人).数据库{},用户:{}", () -> user.getEnterpriseLpName(), () -> ctoken.getEnterpriseLpName());
//            throw new ExtInfoCheckException();
        }
        logger.info(() -> "检查额外信息. OK");
    }

    private boolean tooSimple(TypedToken token) {
        char[] password = token.getPassword();
        if (StringUtils.equalsIgnoreCase("123", String.valueOf(password))) {
            return true;
        }
        return false;
    }


}


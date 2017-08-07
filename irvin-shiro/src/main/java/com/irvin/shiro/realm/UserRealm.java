package com.irvin.shiro.realm;

import com.irvin.shiro.entity.AuthUser;
import com.irvin.shiro.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.crazycake.shiro.SerializableSimpleByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm {

    private static final Logger logger = LoggerFactory.getLogger(UserRealm.class);

    private static final String OR_OPERATOR = " or ";
    private static final String AND_OPERATOR = " and ";
    private static final String NOT_OPERATOR = "not ";

    @Autowired
    private UserService userService;

    public void setService(UserService userService) {
        this.userService = userService;
    }

    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        AuthUser user = (AuthUser) principals.getPrimaryPrincipal();

        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.setRoles(userService.findRoles(user.getId()));
        logger.info("登录成功，用户 {} 的角色是 {}", user.getAccount(), StringUtils.join(authorizationInfo.getRoles()));
        authorizationInfo.setStringPermissions(userService.findPermissions(user.getId()));

        return authorizationInfo;
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        AuthUser user = userService.findByPrincipal(token.getPrincipal());

        if (user == null) {
            throw new UnknownAccountException();// 没找到帐号
        }

//        if (user.isLocked()) {
//            throw new LockedAccountException();
//        }

        // 交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user,
                user.getPassword(), // 密码
                new SerializableSimpleByteSource(user.getSalt()),
                getName() // realm name
        );

        return authenticationInfo;
    }

    @Override
    public boolean isPermitted(PrincipalCollection principals, String permission) {
        if (permission.contains(OR_OPERATOR)) {
            String[] permissions = permission.split(OR_OPERATOR);
            for (String orPermission : permissions) {
                if (isPermittedWithNotOperator(principals, orPermission)) {
                    return true;
                }
            }
            return false;
        } else if (permission.contains(AND_OPERATOR)) {
            String[] permissions = permission.split(AND_OPERATOR);
            for (String orPermission : permissions) {
                if (!isPermittedWithNotOperator(principals, orPermission)) {
                    return false;
                }
            }
            return true;
        } else {
            return isPermittedWithNotOperator(principals, permission);
        }
    }

    private boolean isPermittedWithNotOperator(PrincipalCollection principals, String permission) {
        if (permission.startsWith(NOT_OPERATOR)) {
            return !super.isPermitted(principals, permission.substring(NOT_OPERATOR.length()));
        } else {
            return super.isPermitted(principals, permission);
        }
    }

    @Override
    protected Object getAuthorizationCacheKey(PrincipalCollection principals) {
        AuthUser user = (AuthUser) principals.getPrimaryPrincipal();
        return user.getId();
    }

    /**
     * 还有一个重写的方法，参数是Token
     * 当使用token里边的登录名没有查找到对应的authencation信息时，才会走这个方法。
     */
    @Override
    protected Object getAuthenticationCacheKey(PrincipalCollection principals) {
        AuthUser user = (AuthUser) principals.getPrimaryPrincipal();
        return user.getId();
    }
}

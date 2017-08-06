package com.dbt.config.shiro;

import com.dbt.bean.User;
import com.dbt.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by cdyoue on 2016/10/21.
 */
public class ShiroRealm extends AuthorizingRealm{
    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    //认证.登录
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken utoken=(UsernamePasswordToken) token;//获取用户输入的token
        String username = utoken.getUsername();
        User user = userService.getByAccount(username);
        return new SimpleAuthenticationInfo(user, user.getPassword(),this.getClass().getName());//放入shiro.调用CredentialsMatcher检验密码
    }
    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        logger.info("doGetAuthorizationInfo+"+principalCollection.toString());
        User user = userService.getByAccount((String) principalCollection.getPrimaryPrincipal());


        //把principals放session中 key=userId value=principals
        SecurityUtils.getSubject().getSession().setAttribute(String.valueOf(user.getId()),SecurityUtils.getSubject().getPrincipals());

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //赋予角色
//        for(Role userRole:user.getRoles()){
//            info.addRole(userRole.getName());
//        } TODO
        //赋予权限
//        for(Permission permission:permissionService.getByUserId(user.getId())){
////            if(StringUtils.isNotBlank(permission.getPermCode()))
//            info.addStringPermission(permission.getName());
//        } TODO

        //设置登录次数、时间
//        userService.updateUserLogin(user);
        return info;
    }

}
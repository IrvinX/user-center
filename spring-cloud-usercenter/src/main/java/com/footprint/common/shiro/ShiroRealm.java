package com.footprint.common.shiro;

import com.footprint.api.UserApiService;
import com.footprint.common.model.DUcUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

/**
 * Created by cdyoue on 2016/10/21.
 */

public class ShiroRealm extends AuthorizingRealm {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserApiService userApiService;
//    @Autowired
//    private PermissionDao permissionService;

	/**
	 * 权限认证，为当前登录的Subject授予角色和权限
	 * 经测试：本例中该方法的调用时机为需授权资源被访问时
	 * 经测试：并且每次访问需授权资源时都会执行该方法中的逻辑，这表明本例中默认并未启用AuthorizationCache
	 * 经测试：如果连续访问同一个URL（比如刷新），该方法不会被重复调用，Shiro有一个时间间隔（也就是cache时间，在ehcache-shiro.xml中配置），超过这个时间间隔再刷新页面，该方法会被执行
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		logger.info("##################执行Shiro权限认证##################");
		logger.info("doGetAuthorizationInfo+" + principalCollection.toString());
		//获取当前登录输入的用户名，等价于(String) principalCollection.fromRealm(getName()).iterator().next();
		DUcUser dUcUser = userApiService.findUserByAccount((String) principalCollection.getPrimaryPrincipal());

		Set<String> roles = userApiService.findUserRolesByAccount((String) principalCollection.getPrimaryPrincipal());

		Set<String> permissions = userApiService.findUserPermissionsByAccount((String) principalCollection.getPrimaryPrincipal());


		//把principals放session中 key=userId value=principals
		SecurityUtils.getSubject().getSession().setAttribute(String.valueOf(dUcUser.getId()), SecurityUtils.getSubject().getPrincipals());

		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		//赋予角色
		for (String role : roles) {
			info.addRole(role);
		}
		//赋予权限
		for (String permission : permissions) {
			info.addStringPermission(permission);
		}

		//设置登录次数、时间
//        userService.updateUserLogin(user);
		return info;
	}

	/**
	 * 登录认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
		logger.info("doGetAuthenticationInfo +" + authenticationToken.toString());

		UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
		String userName = token.getUsername();
		logger.info(userName + token.getPassword());

		DUcUser dUcUser = userApiService.findUserByAccount(token.getUsername());
		if (dUcUser != null) {
//            byte[] salt = Encodes.decodeHex(user.getSalt());
//            ShiroUser shiroUser=new ShiroUser(user.getId(), user.getLoginName(), user.getName());
			//设置用户session
			Session session = SecurityUtils.getSubject().getSession();
			session.setAttribute("user", dUcUser);
			return new SimpleAuthenticationInfo(userName, dUcUser.getPassword(), getName());
		} else {
			return null;
		}
//        return null;
	}

}

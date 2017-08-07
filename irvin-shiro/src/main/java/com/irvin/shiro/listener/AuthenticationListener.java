package com.irvin.shiro.listener;

import com.irvin.shiro.entity.AuthUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by sunb-c on 2016/10/21.
 */
public class AuthenticationListener implements org.apache.shiro.authc.AuthenticationListener {


	private static final Logger logger = LoggerFactory.getLogger(AuthenticationListener.class);

	@Override
	public void onSuccess(AuthenticationToken token, AuthenticationInfo info) {
		long l = SecurityUtils.getSubject().getSession().getTimeout();
		logger.debug("用户{}登录成功。session timeout时间:{}", token.getPrincipal(), l);
	}

	@Override
	public void onFailure(AuthenticationToken token, AuthenticationException ae) {
		logger.warn("用户{}登录失败。原因：{}", token.getPrincipal(), ae.getMessage());
	}

	@Override
	public void onLogout(PrincipalCollection principals) {
		AuthUser user = (AuthUser) principals.getPrimaryPrincipal();
		logger.info("用户登出。principal:{}", user.getAccount());
	}
}

package com.footprint.listener;

import com.footprint.entity.IUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gaofang on 2017/7/10.
 */
public class AuthenticationListener implements org.apache.shiro.authc.AuthenticationListener {

	private static final Logger logger = LoggerFactory.getLogger(AuthenticationListener.class.getName());

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
		IUser user = (IUser) principals.getPrimaryPrincipal();
		logger.info("用户登出。principal:{}" + user.getUserName());
	}
}

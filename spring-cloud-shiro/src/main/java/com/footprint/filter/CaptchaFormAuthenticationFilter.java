package com.footprint.filter;

import com.footprint.exception.IncorrectCaptchaException;
import com.footprint.token.CaptchaUsernamePasswordToken;
import com.google.code.kaptcha.Constants;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.concurrent.atomic.AtomicInteger;


public class CaptchaFormAuthenticationFilter extends FormAuthenticationFilter {

	public static final String DEFAULT_CAPTCHA_PARAM = "captcha";

	private String captchaParam = DEFAULT_CAPTCHA_PARAM;


	private Cache<String, AtomicInteger> passwordRetryCache;


	public CaptchaFormAuthenticationFilter() {
	}

	public CaptchaFormAuthenticationFilter(CacheManager cacheManager) {
		passwordRetryCache = cacheManager.getCache("passwordRetryCache");
	}


	// 创建 Token
	protected CaptchaUsernamePasswordToken createToken(ServletRequest request, ServletResponse response) {

		String username = getUsername(request);
		String password = getPassword(request);
		String captcha = getCaptcha(request);
		boolean rememberMe = isRememberMe(request);
		String host = getHost(request);

		return new CaptchaUsernamePasswordToken(username, password, rememberMe, host, captcha);
	}


	// 验证码校验
	protected void doCaptchaValidate(HttpServletRequest request, CaptchaUsernamePasswordToken token) {

		String captcha = (String) request.getSession()
				.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);

		if (captcha != null && !captcha.equalsIgnoreCase(token.getCaptcha())) {
			throw new IncorrectCaptchaException("验证码错误！");
		}
	}

	// 认证
	protected boolean executeLogin(ServletRequest request, ServletResponse response) throws Exception {

		CaptchaUsernamePasswordToken token = createToken(request, response);
		try {

			HttpServletRequest httpRequest = (HttpServletRequest) request;
			HttpSession session = httpRequest.getSession();

			boolean hasCaptcha = true;
			if (session.getAttribute("hasCaptcha") != null) {
				hasCaptcha = (boolean) session.getAttribute("hasCaptcha");
			}

			if (hasCaptcha) {
				doCaptchaValidate((HttpServletRequest) request, token);
			}
			Subject subject = getSubject(request, response);
			subject.login(token);

			session.removeAttribute(Constants.KAPTCHA_SESSION_KEY);
			session.removeAttribute("hasCaptcha");

			return onLoginSuccess(token, subject, request, response);
		} catch (AuthenticationException e1) {
			return onLoginFailure(token, e1, request, response);
		}
	}

	protected String getCaptcha(ServletRequest request) {
		return WebUtils.getCleanParam(request, getCaptchaParam());
	}


	public String getCaptchaParam() {
		return captchaParam;
	}

}

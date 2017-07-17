package com.footprint.common.config.shiro;

import com.footprint.common.auth.credentials.CottonMatcher;
import com.footprint.filter.CaptchaFormAuthenticationFilter;
import com.footprint.realm.UserRealm;
import com.footprint.redis.RedisCacheManager;
import com.footprint.redis.RedisManager;
import com.footprint.redis.RedisSessionDAO;
import com.footprint.service.UserService;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.apache.shiro.session.mgt.eis.JavaUuidSessionIdGenerator;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.DelegatingFilterProxy;

import javax.servlet.Filter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author gaoyu
 */

@Configuration
public class ShiroConfig {

	@Autowired
	private UserService userService;

	@Autowired
	private ShiroPropertiesHolder holder;

	/**
	 * 缓存管理器 使用Ehcache实现
	 *
	 * @return
	 */
	@Bean(name = "cacheManager")
	public RedisCacheManager getCacheManager() {
		RedisCacheManager redisCacheManager = new RedisCacheManager();
		redisCacheManager.setRedisManager(getRedisManager());
		return redisCacheManager;
	}

	/**
	 * shiro redisManager
	 *
	 * @return
	 */
	@Bean(name = "redisManager")
	public RedisManager getRedisManager() {

		RedisManager redisManager = new RedisManager();
		redisManager.setHost(holder.getRedisHost());
		redisManager.setPort(holder.getRedisPort());
		redisManager.setExpire(holder.getRedisExpire());
		redisManager.setDatabase(holder.getRedisDatabase());
		return redisManager;
	}

	/**
	 * 会话DAO
	 *
	 * @return
	 */
//	@Bean(name = "sessionDAO")
	public RedisSessionDAO getRedisSessionDAO() {
		RedisSessionDAO redisSessionDAO = new RedisSessionDAO();
		redisSessionDAO.setRedisManager(getRedisManager());
		redisSessionDAO.setSessionIdGenerator(new JavaUuidSessionIdGenerator());
		return redisSessionDAO;
	}

	/**
	 * 凭证匹配器
	 *
	 * @return
	 */
	@Bean(name = "credentialsMatcher")
	public CottonMatcher getCottonMatcher() {

		CottonMatcher retryLimitHashedCredentialsMatcher = new CottonMatcher(getCacheManager());
		retryLimitHashedCredentialsMatcher.setHashAlgorithmName(holder.getMatcherHashAlgorithmName());
		retryLimitHashedCredentialsMatcher.setHashIterations(holder.getMatcherHashIteration());
		retryLimitHashedCredentialsMatcher.setStoredCredentialsHexEncoded(holder.isMatcherStoredCredentialsHexEncoded());
		retryLimitHashedCredentialsMatcher.setAllowRetry(holder.getMatcherAllowRetry());
		return retryLimitHashedCredentialsMatcher;
	}
//	public RetryLimitHashedCredentialsMatcher getRetryLimitHashedCredentialsMatcher() {
//
//		RetryLimitHashedCredentialsMatcher retryLimitHashedCredentialsMatcher = new RetryLimitHashedCredentialsMatcher(getCacheManager());
//		retryLimitHashedCredentialsMatcher.setHashAlgorithmName(holder.getMatcherHashAlgorithmName());
//		retryLimitHashedCredentialsMatcher.setHashIterations(holder.getMatcherHashIteration());
//		retryLimitHashedCredentialsMatcher.setStoredCredentialsHexEncoded(holder.isMatcherStoredCredentialsHexEncoded());
//		retryLimitHashedCredentialsMatcher.setAllowRetry(holder.getMatcherAllowRetry());
//		return retryLimitHashedCredentialsMatcher;
//	}

	/**
	 * Realm实现
	 *
	 * @return
	 */
	@Bean(name = "userRealm")
	public UserRealm getUserRealm() {

		UserRealm userRealm = new UserRealm();
		userRealm.setCredentialsMatcher(getCottonMatcher());
		userRealm.setCachingEnabled(holder.isRealmCachingEnabled());
		userRealm.setAuthenticationCachingEnabled(holder.isRealmAuthenticationCachingEnabled());
		userRealm.setAuthorizationCachingEnabled(holder.isRealmAuthorizationCachingEnabled());
		userRealm.setAuthenticationCacheName(holder.getRealmAuthenticationCacheName());
		userRealm.setAuthorizationCacheName(holder.getRealmAuthorizationCacheName());
		userRealm.setService(userService);
		return userRealm;
	}

	/**
	 * 会话Cookie模板
	 *
	 * @return
	 */
	@Bean(name = "sessionIdCookie")
	public SimpleCookie getSessionIdCookie() {

		SimpleCookie simpleCookie = new SimpleCookie(holder.getCookieSessionName());
		simpleCookie.setHttpOnly(holder.isCookieSessionHttpOnly());
		simpleCookie.setMaxAge(holder.getCookieSessionMaxAge());
		return simpleCookie;
	}

	/**
	 * 会话Cookie模板
	 *
	 * @return
	 */
	@Bean(name = "rememberMeCookie")
	public SimpleCookie getRememberMeCookie() {

		SimpleCookie simpleCookie = new SimpleCookie(holder.getCookieRememberName());
		simpleCookie.setHttpOnly(holder.isCookieRememberHttpOnly());
		simpleCookie.setMaxAge(holder.getCookieRememberMaxAge());
		return simpleCookie;
	}

	/**
	 * rememberMe管理器 xiaohongaichigua
	 *
	 * @return
	 */
	@Bean(name = "rememberMeManager")
	public CookieRememberMeManager getRememberMeManager() {
		CookieRememberMeManager cookieRememberMeManager = new CookieRememberMeManager();
		cookieRememberMeManager
				.setCipherKey("#{T(org.apache.shiro.codec.Base64).decode('eGlhb2hvbmdhaWNoaWd1YQ==')}"
						.getBytes());
		cookieRememberMeManager.setCookie(getRememberMeCookie());
		return cookieRememberMeManager;
	}


	/**
	 * 会话管理器
	 *
	 * @return
	 */
	@Bean(name = "sessionManager")
	public DefaultWebSessionManager getSessionManager() {
		DefaultWebSessionManager defaultWebSessionManager = new DefaultWebSessionManager();
		defaultWebSessionManager.setGlobalSessionTimeout(holder.getSessionGlobeTimeout());
		defaultWebSessionManager.setDeleteInvalidSessions(holder.isSessionDeleteInvalid());
		defaultWebSessionManager.setSessionDAO(getRedisSessionDAO());
		defaultWebSessionManager.setSessionIdCookieEnabled(holder.isSessionIdCookieEnabled());
		defaultWebSessionManager.setSessionIdCookie(getSessionIdCookie());
		return defaultWebSessionManager;
	}

	/**
	 * 安全管理器
	 *
	 * @return
	 */
	@Bean(name = "securityManager")
	public DefaultWebSecurityManager getSecurityManager() {
		DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
		defaultWebSecurityManager.setRealm(getUserRealm());
		defaultWebSecurityManager.setCacheManager(getCacheManager());
		defaultWebSecurityManager.setSessionManager(getSessionManager());
		defaultWebSecurityManager.setRememberMeManager(getRememberMeManager());
		// TODO
		// defaultWebSecurityManager.setAuthenticator(null);
		return defaultWebSecurityManager;
	}

	/*;*
	 * 相当于调用SecurityUtils.setSecurityManager(securityManager)
	 */
	@Bean
	protected MethodInvokingFactoryBean setMethodInvokingFactoryBean() {
		MethodInvokingFactoryBean methodInvokingFactoryBean = new MethodInvokingFactoryBean();
		methodInvokingFactoryBean
				.setStaticMethod("org.apache.shiro.SecurityUtils.setSecurityManager");
		Object[] object = new Object[1];
		object[0] = getSecurityManager();
		methodInvokingFactoryBean.setArguments(object);
		return methodInvokingFactoryBean;
	}

	/**
	 * 基于Form表单的身份验证过滤器
	 *
	 * @return
	 */
//	@Bean(name = "captchaFormAuthenticationFilter")
	public CaptchaFormAuthenticationFilter getCaptchaFormAuthenticationFilter() {
		CaptchaFormAuthenticationFilter captchaFormAuthenticationFilter = new CaptchaFormAuthenticationFilter();
		captchaFormAuthenticationFilter.setUsernameParam("username");
		captchaFormAuthenticationFilter.setPasswordParam("password");
		captchaFormAuthenticationFilter.setRememberMeParam("rememberMe");
		captchaFormAuthenticationFilter.setLoginUrl(holder.getLoginUrl());
		return captchaFormAuthenticationFilter;
	}

	@Bean(name = "captchaProducer")
	public DefaultKaptcha getKaptchaBean() {
		DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
		Properties properties = new Properties();
		properties.setProperty("kaptcha.border", "yes");
		properties.setProperty("kaptcha.border.color", "105,179,90");
		properties.setProperty("kaptcha.textproducer.font.color", "blue");
		properties.setProperty("kaptcha.image.width", "185");
		properties.setProperty("kaptcha.obscurificator.impl",
				"com.google.code.kaptcha.impl.FishEyeGimpy");
		properties.setProperty("kaptcha.session.key", "code");
		properties.setProperty("kaptcha.textproducer.char.length", "4");
		// properties.setProperty("kaptcha.textproducer.font.names",
		// "宋体,楷体,微软雅黑");
		Config config = new Config(properties);
		defaultKaptcha.setConfig(config);
		return defaultKaptcha;
	}

	/**
	 * Shiro的Web过滤器
	 *
	 * @return
	 */
	@Bean(name = "shiroFilter")
	public ShiroFilterFactoryBean getShiroFilter() {
		ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
		shiroFilterFactoryBean.setSecurityManager(getSecurityManager());
		shiroFilterFactoryBean.setLoginUrl("/login");
		shiroFilterFactoryBean.setSuccessUrl("/successRedirect");
		shiroFilterFactoryBean.setUnauthorizedUrl("/authorizationError");
		Map<String, Filter> filters = new HashMap<>();
		filters.put("authc", getCaptchaFormAuthenticationFilter());
		shiroFilterFactoryBean.setFilters(filters);

		Map<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
//		filterChainDefinitionMap.put("/user", "authc");
//		filterChainDefinitionMap.put("/", "anon");
//		filterChainDefinitionMap.put("/img/**", "anon");
//		filterChainDefinitionMap.put("/js/**", "anon");
//		filterChainDefinitionMap.put("/fonts/**", "anon");
//		filterChainDefinitionMap.put("/*.json", "anon");
//		filterChainDefinitionMap.put("/css/**", "anon");
//		filterChainDefinitionMap.put("/home", "anon");
//		filterChainDefinitionMap.put("/ninghaidemo", "anon");
//		filterChainDefinitionMap.put("/html/mobile/**", "anon");
//		filterChainDefinitionMap.put("/health", "anon");
//		filterChainDefinitionMap.put("/info", "anon");
//		filterChainDefinitionMap.put("/favicon.ico", "anon");
		filterChainDefinitionMap.put("/login", "authc");
//		filterChainDefinitionMap.put("/resource", "authc");
//		filterChainDefinitionMap.put("/desktop", "authc");
//		filterChainDefinitionMap.put("/desktop", "authc");
//		filterChainDefinitionMap.put("/statisticalAnalysisActivity", "anon");
//		filterChainDefinitionMap.put("/test/index", "roles[test]");
//		filterChainDefinitionMap.put("/**", "authc");

//		filterChainDefinitionMap.put("/**", "anon");// TODO (delete) for test

		shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
		return shiroFilterFactoryBean;
	}


//	@Bean(name = "lifecycleBeanPostProcessor")
//	public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
//	    return new LifecycleBeanPostProcessor();
//	}

	/**
	 * ShiroFilter
	 *
	 * @return
	 */
	@Bean
	public FilterRegistrationBean shiroFilterRegistration() {
		System.out.println("shiroFilterRegistration**************");
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new DelegatingFilterProxy("shiroFilter"));
		registration.addUrlPatterns("/*");
		registration.addInitParameter("targetFilterLifecycle", "true");
		registration.setName("shiroFilter");
		registration.setOrder(1);
		return registration;
	}

	//@Bean(name = "shiroFilter")
	//public ShiroFilterFactoryBean shiroFilter() {
	//    System.out.println("shiroFilter**************");
	//    ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
	//    bean.setSecurityManager(getSecurityManager());
	//    return bean;
	//}

	/**
	 * CharacterEncodingFilter
	 *
	 * @return
	 */
	@Bean
	public FilterRegistrationBean CharacterEncodingFilterRegistration() {

		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new DelegatingFilterProxy(
				"CharacterEncodingFilter"));
		registration.addUrlPatterns("/*");
		registration.addInitParameter("encoding", "utf-8");
		registration.setName("CharacterEncodingFilter");
		registration.setOrder(2);
		return registration;
	}

	@Bean(name = "CharacterEncodingFilter")
	public ShiroFilterFactoryBean CharacterEncodingFilter() {
		ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
		bean.setSecurityManager(getSecurityManager());
		return bean;
	}
}

package com.footprint.common.config.shiro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by sunb on 17-4-6.
 */
@Service
@Scope("singleton")
public class ShiroPropertiesHolder {

	@Value("${spring.redis.host}")
	private String redisHost;
	@Value("${spring.redis.port}")
	private int redisPort;
	@Value("${spring.redis.database}")
	private int redisDatabase;
	@Value("${spring.redis.timeout}")
	private int redisTimeout;

	@Value("${shiro.redis.expire}")
	private int redisExpire;
	@Value("${shiro.matcher.hashAlgorithmName}")
	private String matcherHashAlgorithmName;
	@Value("${shiro.matcher.hashIteration}")
	private int matcherHashIteration;
	@Value("${shiro.matcher.storedCredentialsHexEncoded}")
	private boolean matcherStoredCredentialsHexEncoded;
	@Value("${shiro.matcher.allowRetry}")
	private int matcherAllowRetry;
	@Value("${shiro.realm.cachingEnabled}")
	private boolean realmCachingEnabled;
	@Value("${shiro.realm.authenticationCachingEnabled}")
	private boolean realmAuthenticationCachingEnabled;
	@Value("${shiro.realm.authorizationCachingEnabled}")
	private boolean realmAuthorizationCachingEnabled;
	@Value("${shiro.realm.authenticationCacheName}")
	private String realmAuthenticationCacheName;
	@Value("${shiro.realm.authorizationCacheName}")
	private String realmAuthorizationCacheName;
	@Value("${shiro.cookie.session.name}")
	private String cookieSessionName;
	@Value("${shiro.cookie.session.httpOnly}")
	private boolean cookieSessionHttpOnly;
	@Value("${shiro.cookie.session.maxAge}")
	private int cookieSessionMaxAge;
	@Value("${shiro.cookie.remember.name}")
	private String cookieRememberName;
	@Value("${shiro.cookie.remember.httpOnly}")
	private boolean cookieRememberHttpOnly;
	@Value("${shiro.cookie.remember.maxAge}")
	private int cookieRememberMaxAge;
	@Value("${shiro.session.globeTimeout}")
	private int sessionGlobeTimeout;
	@Value("${shiro.session.deleteInvalid}")
	private boolean sessionDeleteInvalid;
	@Value("${shiro.session.idCookieEnabled}")
	private boolean sessionIdCookieEnabled;

	// 系统默认welcome页面
	private String welcomeUrl = "/home";

	private String loginUrl = "/login";

	public ShiroPropertiesHolder() {
	}

	public String getRedisHost() {
		return redisHost;
	}

	public void setRedisHost(String redisHost) {
		this.redisHost = redisHost;
	}

	public int getRedisPort() {
		return redisPort;
	}

	public void setRedisPort(int redisPort) {
		this.redisPort = redisPort;
	}

	public int getRedisExpire() {
		return redisExpire;
	}

	public void setRedisExpire(int redisExpire) {
		this.redisExpire = redisExpire;
	}

	public int getRedisDatabase() {
		return redisDatabase;
	}

	public void setRedisDatabase(int redisDatabase) {
		this.redisDatabase = redisDatabase;
	}

	public int getRedisTimeout() {
		return redisTimeout;
	}

	public void setRedisTimeout(int redisTimeout) {
		this.redisTimeout = redisTimeout;
	}

	public String getMatcherHashAlgorithmName() {
		return matcherHashAlgorithmName;
	}

	public void setMatcherHashAlgorithmName(String matcherHashAlgorithmName) {
		this.matcherHashAlgorithmName = matcherHashAlgorithmName;
	}

	public int getMatcherHashIteration() {
		return matcherHashIteration;
	}

	public void setMatcherHashIteration(int matcherHashIteration) {
		this.matcherHashIteration = matcherHashIteration;
	}

	public boolean isMatcherStoredCredentialsHexEncoded() {
		return matcherStoredCredentialsHexEncoded;
	}

	public void setMatcherStoredCredentialsHexEncoded(boolean matcherStoredCredentialsHexEncoded) {
		this.matcherStoredCredentialsHexEncoded = matcherStoredCredentialsHexEncoded;
	}

	public int getMatcherAllowRetry() {
		return matcherAllowRetry;
	}

	public void setMatcherAllowRetry(int matcherAllowRetry) {
		this.matcherAllowRetry = matcherAllowRetry;
	}

	public boolean isRealmCachingEnabled() {
		return realmCachingEnabled;
	}

	public void setRealmCachingEnabled(boolean realmCachingEnabled) {
		this.realmCachingEnabled = realmCachingEnabled;
	}

	public boolean isRealmAuthenticationCachingEnabled() {
		return realmAuthenticationCachingEnabled;
	}

	public void setRealmAuthenticationCachingEnabled(boolean realmAuthenticationCachingEnabled) {
		this.realmAuthenticationCachingEnabled = realmAuthenticationCachingEnabled;
	}

	public boolean isRealmAuthorizationCachingEnabled() {
		return realmAuthorizationCachingEnabled;
	}

	public void setRealmAuthorizationCachingEnabled(boolean realmAuthorizationCachingEnabled) {
		this.realmAuthorizationCachingEnabled = realmAuthorizationCachingEnabled;
	}

	public String getRealmAuthenticationCacheName() {
		return realmAuthenticationCacheName;
	}

	public void setRealmAuthenticationCacheName(String realmAuthenticationCacheName) {
		this.realmAuthenticationCacheName = realmAuthenticationCacheName;
	}

	public String getRealmAuthorizationCacheName() {
		return realmAuthorizationCacheName;
	}

	public void setRealmAuthorizationCacheName(String realmAuthorizationCacheName) {
		this.realmAuthorizationCacheName = realmAuthorizationCacheName;
	}

	public String getCookieSessionName() {
		return cookieSessionName;
	}

	public void setCookieSessionName(String cookieSessionName) {
		this.cookieSessionName = cookieSessionName;
	}

	public boolean isCookieSessionHttpOnly() {
		return cookieSessionHttpOnly;
	}

	public void setCookieSessionHttpOnly(boolean cookieSessionHttpOnly) {
		this.cookieSessionHttpOnly = cookieSessionHttpOnly;
	}

	public int getCookieSessionMaxAge() {
		return cookieSessionMaxAge;
	}

	public void setCookieSessionMaxAge(int cookieSessionMaxAge) {
		this.cookieSessionMaxAge = cookieSessionMaxAge;
	}

	public String getCookieRememberName() {
		return cookieRememberName;
	}

	public void setCookieRememberName(String cookieRememberName) {
		this.cookieRememberName = cookieRememberName;
	}

	public boolean isCookieRememberHttpOnly() {
		return cookieRememberHttpOnly;
	}

	public void setCookieRememberHttpOnly(boolean cookieRememberHttpOnly) {
		this.cookieRememberHttpOnly = cookieRememberHttpOnly;
	}

	public int getCookieRememberMaxAge() {
		return cookieRememberMaxAge;
	}

	public void setCookieRememberMaxAge(int cookieRememberMaxAge) {
		this.cookieRememberMaxAge = cookieRememberMaxAge;
	}

	public int getSessionGlobeTimeout() {
		return sessionGlobeTimeout;
	}

	public void setSessionGlobeTimeout(int sessionGlobeTimeout) {
		this.sessionGlobeTimeout = sessionGlobeTimeout;
	}

	public boolean isSessionDeleteInvalid() {
		return sessionDeleteInvalid;
	}

	public void setSessionDeleteInvalid(boolean sessionDeleteInvalid) {
		this.sessionDeleteInvalid = sessionDeleteInvalid;
	}

	public boolean isSessionIdCookieEnabled() {
		return sessionIdCookieEnabled;
	}

	public void setSessionIdCookieEnabled(boolean sessionIdCookieEnabled) {
		this.sessionIdCookieEnabled = sessionIdCookieEnabled;
	}

	public String getLoginUrl() {
		return loginUrl;
	}

	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}

	public String getWelcomeUrl() {
		return welcomeUrl;
	}

	public void setWelcomeUrl(String welcomeUrl) {
		this.welcomeUrl = welcomeUrl;
	}

}

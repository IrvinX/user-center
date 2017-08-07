package com.irvin.shiro.entity;

public interface AuthUser {

	/**
	 * id
	 */
	String getId();

	/**
	 * account
	 */
	String getAccount();

	/**
	 * password
	 */
	String getPassword();

	/**
	 * salt
	 */
	String getSalt();
}

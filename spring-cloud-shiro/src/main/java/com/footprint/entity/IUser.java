package com.footprint.entity;

/**
 * Created by sunb-c on 2016/7/2.
 */
public interface IUser {

	/**
	 * 用户登录名
	 *
	 * @return
	 */
	String getUserName();

	/**
	 * 取得密码（密文）
	 *
	 * @return
	 */
	String getPassword();


	/**
	 * 默认没有锁
	 *
	 * @return
	 */
	default boolean isLocked() {
		return false;
	}

	/**
	 * 取得一个用户唯一的标识。也可以使用登录名
	 *
	 * @return
	 */
	String unique();

	/**
	 * 取得盐
	 *
	 * @return
	 */
	String getCredentialsSalt();
}

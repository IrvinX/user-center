package com.footprint.entity;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 3168546196666075330L;

	private String username;
	private String password;
	private String salt;

	private boolean rememberMe = false;
	private String validCode;

	private Boolean locked = Boolean.FALSE;

	public User() {
	}
	

	public User(String username, String password, String salt) {
		super();
		this.username = username;
		this.password = password;
		this.salt = salt;
	}
	
	
	public String getCredentialsSalt(){
		return username + salt;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public boolean isRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(boolean rememberMe) {
		this.rememberMe = rememberMe;
	}

	public String getValidCode() {
		return validCode;
	}

	public void setValidCode(String validCode) {
		this.validCode = validCode;
	}

	public Boolean getLocked() {
		return locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}


	@Override
	public String toString() {
		return String.format("User [username=%s, password=%s, salt=%s, rememberMe=%s, validCode=%s, locked=%s]",
				username, password, salt, rememberMe, validCode, locked);
	}

	
}

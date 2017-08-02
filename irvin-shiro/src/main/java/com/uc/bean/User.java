package com.uc.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;

/**
 * Created by irvin on 2017/7/23.
 */
public class User implements Serializable {
	private static final long serialVersionUID = -2334953113239303539L;
	private Integer id;
	private String account;
	private String username;

	@JsonIgnore
	private String password;
	private String email;
	private String telephone;
	private String mobilePhone;
	private String wechatId;
	private String skill;
	private Integer departmentId;
	private Integer loginCount;

	private List<Role> roles;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getWechatId() {
		return wechatId;
	}
	public void setWechatId(String wechatId) {
		this.wechatId = wechatId;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public Integer getLoginCount() {
		return loginCount;
	}
	public void setLoginCount(Integer loginCount) {
		this.loginCount = loginCount;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "User{" +
			"id=" + id +
			", account=" + account +
			", username=" + username +
			", password=" + password +
			", email=" + email +
			", telephone=" + telephone +
			", mobilePhone=" + mobilePhone +
			", wechatId=" + wechatId +
			", skill=" + skill +
			", departmentId=" + departmentId +
			", loginCount=" + loginCount +
			'}';
		}
}
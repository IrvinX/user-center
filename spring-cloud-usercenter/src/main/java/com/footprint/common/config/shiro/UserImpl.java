package com.footprint.common.config.shiro;


import com.footprint.entity.IUser;

import java.io.Serializable;

/**
 * Created by sunb-c on 2016/7/2.
 */
public class UserImpl implements IUser, Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -6214135245693743631L;

	// =======================>>>>>>
	private String id;

	private String mobilePhone;
	private String salt;
	private String userName;
	private String password;
	private String oldPassword;
	private boolean needResetPwd;

	private boolean locked = false;

	// passwordType :新旧密码
	//1:旧密码、2:新密码
	private short passwordType = 2;

	//  用户类型::1:交易商、2:企业用户、3:绿卡棉供应商、4:运输企业、11:手机注册用户、12:API用户、90:平台用户
	private short userType = 0;
	// =======================<<<<<<...... 用户相关信息

	// =======================>>>>>>
	private String enterpriseId;
	private String compOrgnNum; //组织机构代码证
	private String enterpriseName; //企业名称
	private String enterpriseLpName; //企业法人名称
	// =======================<<<<<<...... 企业相关信息

	private boolean hasOrgError = false;

	public UserImpl() {
	}

	public UserImpl(String id) {
		this.id = id;
	}

	public UserImpl(String id, String mobilePhone, String salt, String userName, String password, String oldPassword, boolean needResetPwd, boolean locked, short passwordType, short userType, String enterpriseId, String compOrgnNum, String enterpriseName, String enterpriseLpName, boolean hasOrgError) {
		this.id = id;
		this.mobilePhone = mobilePhone;
		this.salt = salt;
		this.userName = userName;
		this.password = password;
		this.oldPassword = oldPassword;
		this.needResetPwd = needResetPwd;
		this.locked = locked;
		this.passwordType = passwordType;
		this.userType = userType;
		this.enterpriseId = enterpriseId;
		this.compOrgnNum = compOrgnNum;
		this.enterpriseName = enterpriseName;
		this.enterpriseLpName = enterpriseLpName;
		this.hasOrgError = hasOrgError;
	}

	/**
	 * 用户登录名
	 *
	 * @return
	 */
	@Override
	public String getUserName() {
		return userName;
	}

	@Override
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String unique() {
		return id;
	}

	public String getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public short getPasswordType() {
		return passwordType;
	}

	public void setPasswordType(short passwordType) {
		this.passwordType = passwordType;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	@Override
	public String getCredentialsSalt() {
		return userName + salt;
	}

	/**
	 * 用户类型::1:交易商、2:企业用户、3:绿卡棉供应商、4:运输企业、11:手机注册用户、12:API用户、90:平台用户
	 *
	 * @return
	 */
	public short getUserType() {
		return userType;
	}

	/**
	 * 用户类型::1:交易商、2:企业用户、3:绿卡棉供应商、4:运输企业、11:手机注册用户、12:API用户、90:平台用户
	 *
	 * @param userType
	 */
	public void setUserType(short userType) {
		this.userType = userType;
	}

	/**
	 * 组织机构代码证
	 *
	 * @return
	 */
	public String getCompOrgnNum() {
		return compOrgnNum;
	}

	public void setCompOrgnNum(String compOrgnNum) {
		this.compOrgnNum = compOrgnNum;
	}


	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getEnterpriseLpName() {
		return enterpriseLpName;
	}

	public void setEnterpriseLpName(String enterpriseLpName) {
		this.enterpriseLpName = enterpriseLpName;
	}

	public boolean isHasOrgError() {
		return hasOrgError;
	}

	public void setHasOrgError(boolean hasOrgError) {
		this.hasOrgError = hasOrgError;
	}

	public boolean isNeedResetPwd() {
		return needResetPwd;
	}

	public void setNeedResetPwd(boolean needResetPwd) {
		this.needResetPwd = needResetPwd;
	}

	@Override
	public int hashCode() {
		//对象是否相同,直接看unique
		return unique().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return this.unique().equals(obj);
	}

	@Override
	public boolean isLocked() {
		return locked;
	}

	public void setLocked() {
		this.locked = true;
	}


	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
}




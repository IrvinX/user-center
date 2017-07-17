package com.footprint.common.auth.token;

import com.footprint.token.CaptchaUsernamePasswordToken;
import org.apache.commons.lang3.StringUtils;

/**
 * 验证码基础上加了 用户类型（loginType），企业法人名称，企业名称
 * <p>
 * Created by sunb-c on 2016/7/27.
 */
public class TypedToken extends CaptchaUsernamePasswordToken {

	/** 序列化 */
	private static final long serialVersionUID = 1L;

	// 企业名称(全称）
	private String enterpriseFullName;
	// 企业法人姓名
	private String enterpriseLpName;
	// 交易商id
	private String traderId;

	public TypedToken(String username, String password, boolean rememberMe, String captcha, String host,
			String enterpriseName, String enterpriseLpName, String traderId) {
		super(username, password, rememberMe, host, captcha);
		this.enterpriseFullName = enterpriseName;
		this.enterpriseLpName = enterpriseLpName;
		this.traderId = traderId;
	}

	@Override
	public Object getPrincipal() {
		return new CottonPrincipal(getUsername(), getTraderId());
	}

	public TypedToken(String userName, String password) {
		super(userName, password);
	}

	public String getEnterpriseFullName() {
		return enterpriseFullName;
	}

	public void setEnterpriseFullName(String enterpriseFullName) {
		this.enterpriseFullName = enterpriseFullName;
	}

	public String getEnterpriseLpName() {
		return enterpriseLpName;
	}

	public void setEnterpriseLpName(String enterpriseLpName) {
		this.enterpriseLpName = enterpriseLpName;
	}

	public String getTraderId() {
		return traderId;
	}

	public void setTraderId(String traderId) {
		this.traderId = traderId;
	}

	public class CottonPrincipal {
		String username;
		String traderId;

		CottonPrincipal(String username, String traderId) {
			this.username = username;
			this.traderId = traderId;
		}

		public String getTokenKey() {
			return username + StringUtils.trimToEmpty(traderId);
		}

		public String getUsername() {
			return username;
		}

		public String getTraderId() {
			return traderId;
		}
	}
}

package com.footprint.service;

import com.alibaba.fastjson.JSON;
import com.footprint.api.*;
import com.footprint.common.constant.ErrorCodeConstant;
import com.footprint.common.constant.UpmsConstant;
import com.footprint.common.dao.*;
import com.footprint.common.dto.BaseResult;
import com.footprint.common.dto.ResultConstant;
import com.footprint.common.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by gaofang on 2017/6/20.
 *
 * @author gaofang
 *         <p>
 *         注册服务<br>
 *         包括用户注册以及企业注册
 */
@Service
@Transactional
public class SignInApiServiceImpl implements SignInApiService {

	private static Logger logger = LoggerFactory.getLogger(SignInApiServiceImpl.class);

	@Autowired
	UserApiService userApiService;
	@Autowired
	PersonApiService personApiService;
	@Autowired
	EnterpriseApiService enterpriseApiService;
	@Autowired
	DealerApiService dealerApiService;
	@Autowired
	WFApiService wfApiService;
	@Autowired
	DUcUserOauthMapper dUcUserOauthMapper;//用户认证方式
	@Autowired
	DUcUserRoleMapper dUcUserRoleMapper;//用户-角色关联
	@Autowired
	DUcOrgPersonMapper dUcOrgPersonMapper;//组织人员
	@Autowired
	DUcOrgUserMapper dUcOrgUserMapper;//组织用户
	@Autowired
	DUcAccountTypeRoleMapper dUcAccountTypeRoleMapper;//账户类型-角色
	@Autowired
	DUcOrgMapper dUcOrgMapper;//组织
	@Autowired
	DUcEntpTypeMapMapper dUcEntpTypeMapMapper;//企业-企业账户类型映射

	@Override
	public BaseResult checkMobileUsable(String mobile) {
		logger.info("SignInApiServiceImpl	==>	checkPhoneExists");
		logger.info("params	==>	mobile:" + mobile);
		/**
		 * 筛选用户认证方式表(D_UC_USER_OAUTH)中, 认证方式为手机注册,且手机号为 phoneNo 的数据
		 * 同时,该用户状态为非删除状态
		 */
		/*
		 	1. 筛选用户认证方式表(D_UC_USER_OAUTH)中, 认证方式为手机注册,且手机号为 phoneNo 的数据
		  */
		try {
			DUcUserOauthExample dUcUserOauthExample = new DUcUserOauthExample();
			dUcUserOauthExample.createCriteria()
					.andOauthTypeEqualTo(UpmsConstant.USER_OAUTH_TYPE_TEL)
					.andThirdIdEqualTo(mobile);
			List<DUcUserOauth> dUcUserOauths = dUcUserOauthMapper.selectByExample(dUcUserOauthExample);
			// 若 dUcUserOauths 为空,则说明该手机号未被占用
			if (null == dUcUserOauths || 0 == dUcUserOauths.size())
				return new BaseResult(ResultConstant.SUCCESS, true);

			/*
				2. 取到的数据中,通过userId,判断状态属否为删除状态
			  */

			for (DUcUserOauth dUcUserOauth : dUcUserOauths) {
				DUcUserExample dUcUserExample = new DUcUserExample();
				dUcUserExample.createCriteria()
						.andIdEqualTo(dUcUserOauth.getUserId()).
						andUserStatusNotEqualTo(UpmsConstant.USER_STATUS_DELETE);
				int dUcUser = userApiService.countByExample(dUcUserExample);
				/**
				 * 查询结果数量不为0,不可用
				 */
				if (0 != dUcUser)
					return new BaseResult(ResultConstant.SUCCESS, false);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}
		return new BaseResult(ResultConstant.SUCCESS, true);
	}

	@Override
	public BaseResult signIn(Map<String, Object> info) {
		logger.info("SignInApiServiceImpl	==>	signIn");
		logger.info("params	==>	userInfo:" + JSON.toJSONString(info));

		/**
		 * 判断注册用户类型
		 * 		手机用户
		 * 		普通企业用户
		 *		交易商
		 */
		try {
			if (null == info.get("userType")) {
				logger.info("参数错误! userType 为空");
				return new BaseResult(ErrorCodeConstant.INVALID_PARAM, "参数错误! userType 为空");
			}
			short userType = Short.valueOf(info.get("userType").toString());

			String userId = UUID.randomUUID().toString().replace("-", "");
			logger.info("生成用户ID:" + userId);

			int rtn = 0;
			switch (userType) {
				// 手机用户
				case UpmsConstant.USER_TYPE_TEL:
					logger.info("注册用户类型为: 手机用户");
					rtn = telUserSignIn(info, userId, null);
					if (0 == rtn)
						throw new SQLException();
					return new BaseResult(ResultConstant.SUCCESS);

				// 普通企业用户
				case UpmsConstant.USER_TYPE_ENTP:
					logger.info("注册用户类型为: 普通企业用户");
					String entpId = UUID.randomUUID().toString().replace("-", "");
					logger.info("生成企业ID:" + entpId);
					rtn = entpSignIn(info, userId, entpId);
					if (0 == rtn)
						throw new SQLException();
					return new BaseResult(ResultConstant.SUCCESS);

				// 交易商
				case UpmsConstant.USER_TYPE_DEALER:
					logger.info("注册用户类型为: 交易商");
					String dealerId = UUID.randomUUID().toString().replace("-", "");
					logger.info("生成企业ID:" + dealerId);
					rtn = dealerSignIn(info, userId, dealerId);
					if (0 == rtn)
						throw new SQLException();
					return new BaseResult(ResultConstant.SUCCESS);

				default:
					break;
			}
			logger.info("注册结果: " + (1 == rtn ? "注册成功" : "注册失败"));
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}
		return new BaseResult(ResultConstant.SUCCESS);
	}

	/**
	 * 交易商注册
	 *
	 * @return
	 */
	private int dealerSignIn(Map<String, Object> info, String userId, String entpId) {
		logger.info("SignInApiServiceImpl	==>	dealerSignIn");

		/**
		 * 1. 交易商信息操作<br>
		 *     审批流程统一在方法 entpSignIn 中调用流程服务进行处理
		 */
		if (null == info.get("dealerInfo")) {
			logger.info("参数错误! dealerInfo 为空");
			return 0;
		}
		DUcDealer dUcDealer = JSON.toJavaObject(JSON.parseObject(JSON.toJSONString(info.get("dealerInfo"))), DUcDealer.class);
		dUcDealer.setId(entpId);
		dUcDealer.setCreatetime(new Date());
		dUcDealer.setCreateuser(userId);
		int dealerRtn = dealerApiService.insert(dUcDealer);
		logger.info("操作交易商表结果:" + (1 == dealerRtn ? "成功" : "失败"));

		/**
		 * 2.企业-企业账户类型映射
		 */
		DUcEntpTypeMap dUcEntpTypeMap = new DUcEntpTypeMap();
		dUcEntpTypeMap.setId(UUID.randomUUID().toString().replace("-", ""));
		dUcEntpTypeMap.setEntpId(entpId);
		dUcEntpTypeMap.setEntpType(UpmsConstant.ENTP_ACCOUNT_TYPE_DEALER);//普通企业
		dUcEntpTypeMap.setCreatetime(new Date());
		dUcEntpTypeMap.setCreateuser(userId);
		dUcEntpTypeMapMapper.insert(dUcEntpTypeMap);

		/**
		 * 3. 企业操作
		 */
		logger.info("开始企业注册操作");
		entpSignIn(info, userId, entpId);
		logger.info("企业注册操作结束...");
		return 1;
	}

	/**
	 * 普通企业用户注册
	 *
	 * @return
	 */
	private int entpSignIn(Map<String, Object> info, String userId, String entpId) {
		logger.info("SignInApiServiceImpl	==>	entpSignIn");

		if (null == info.get("entpInfo")) {
			logger.info("参数错误! entpInfo 为空");
			return 0;
		}
		/**
		 * 1. 组织信息操作
		 */
		DUcOrg dUcOrg = new DUcOrg(
				entpId,//id
				null,
				UpmsConstant.ORG_TYPE_NORMAL,//默认普通企业
				UpmsConstant.ORG_VIRTUAL_FLAG_ENTITY,//默认实体
				null, null,
				null, null,
				new Date(),//Createtime
				userId,//Createuser
				null, null);
//		dUcOrg.setId(entpId);
//		dUcOrg.setOrgType(UpmsConstant.ORG_TYPE_NORMAL);//默认普通企业
//		dUcOrg.setVirtualFlg(UpmsConstant.ORG_VIRTUAL_FLAG_ENTITY);//默认实体
//		dUcOrg.setCreatetime(new Date());
//		dUcOrg.setCreateuser(userId);
		int orgRtn = dUcOrgMapper.insert(dUcOrg);
		logger.info("操作组织表结果:" + (1 == orgRtn ? "成功" : "失败"));

		/**
		 * 2. 企业信息操作
		 */
		DUcEnterprise dUcEnterprise = JSON.toJavaObject(JSON.parseObject(JSON.toJSONString(info.get("entpInfo"))), DUcEnterprise.class);
		dUcEnterprise.setId(entpId);
		dUcEnterprise.setEntpStatus(UpmsConstant.ENPT_STATUS_NORMAL);//默认状态为正常
		dUcEnterprise.setCreateuser(userId);
		dUcEnterprise.setCreatetime(new Date());
		int entpRtn = enterpriseApiService.insert(dUcEnterprise);
		logger.info("操作企业表结果:" + (1 == entpRtn ? "成功" : "失败"));

		/**
		 * 3.企业-企业账户类型映射
		 */
		DUcEntpTypeMap dUcEntpTypeMap = new DUcEntpTypeMap();
		dUcEntpTypeMap.setId(UUID.randomUUID().toString().replace("-", ""));
		dUcEntpTypeMap.setEntpId(entpId);
		dUcEntpTypeMap.setEntpType(UpmsConstant.ENTP_ACCOUNT_TYPE_NORMAL);//普通企业
		dUcEntpTypeMap.setCreatetime(new Date());
		dUcEntpTypeMap.setCreateuser(userId);
		dUcEntpTypeMapMapper.insert(dUcEntpTypeMap);

		/**
		 * 4. 企业注册审批流程
		 */
		short userType = Short.valueOf(info.get("userType").toString());
		if (UpmsConstant.USER_TYPE_ENTP == userType) {
			// 普通企业用户
			wfApiService.signInWF(dUcEnterprise);
		} else if (UpmsConstant.USER_TYPE_DEALER == userType) {
			DUcDealer dUcDealer = JSON.toJavaObject(JSON.parseObject(JSON.toJSONString(info.get("dealerInfo"))), DUcDealer.class);
			dUcDealer.setId(entpId);
			dUcDealer.setCreatetime(new Date());
			dUcDealer.setCreateuser(userId);
			// 交易商用户
			wfApiService.signInWF(dUcEnterprise, dUcDealer);
		}

		/**
		 * 5. 用户注册操作
		 */
		logger.info("用户注册操作");
		telUserSignIn(info, userId, entpId);
		logger.info("用户注册操作结束...");
		return 1;
	}

	/**
	 * 手机用户注册
	 *
	 * @return
	 */
	private int telUserSignIn(Map<String, Object> info, String userId, String entpId) {
		logger.info("SignInApiServiceImpl	==>	telUserSignIn");
		logger.info("开始用户注册操作");

		if (null == info.get("userInfo")) {
			logger.info("参数错误! userInfo 为空");
			return 0;
		}

		/**
		 * 1. 取用户信息
		 */
		Map<String, Object> userInfo = (Map<String, Object>) info.get("userInfo");

		String userName = null == userInfo.get("userName") ? "" : userInfo.get("userName").toString();
		String realName = null == userInfo.get("realName") ? "" : userInfo.get("realName").toString();
		String password = null == userInfo.get("password") ? "" : userInfo.get("password").toString();
		String mobile = null == userInfo.get("mobile") ? "" : userInfo.get("mobile").toString();

		// 常用固定电话/电子邮箱/传真/联系人身份证url 只有在null!=entpId时才有值
		String tel = "";
		String email = "";
		String fax = "";
		String idUrl = "";
		if (null != entpId) {
			// 1.常用固定电话
			tel = null == userInfo.get("tel") ? "" : userInfo.get("tel").toString();
			// 2.电子邮箱
			email = null == userInfo.get("email") ? "" : userInfo.get("email").toString();
			// 3.传真
			fax = null == userInfo.get("fax") ? "" : userInfo.get("fax").toString();
			// 4.联系人身份证url
			idUrl = null == userInfo.get("idUrl") ? "" : userInfo.get("idUrl").toString();
		}
		/**
		 * 2. 操作人员表
		 */
		logger.info("操作人员表...");
		DUcPerson dUcPerson = new DUcPerson();
		// 生成人员ID
		String personId = UUID.randomUUID().toString().replace("-", "");
		logger.info("操作人员表	==>	生成人员ID:" + personId);

		dUcPerson.setId(personId);
		dUcPerson.setName(realName);
		dUcPerson.setMobile(mobile);
		dUcPerson.setCreatetime(new Date());
		dUcPerson.setPersonStatus(UpmsConstant.USER_STATUS_NORMAL);// 状态默认置为正常
		dUcPerson.setTel(tel);
		dUcPerson.setMail(email);
		dUcPerson.setFax(fax);
		dUcPerson.setIdentityUrl(idUrl);
		dUcPerson.setCreatetime(new Date());
		dUcPerson.setCreateuser(userId);

		int personRtn = personApiService.insert(dUcPerson);
		logger.info("操作人员表结果:" + (1 == personRtn ? "成功" : "失败"));

		/**
		 * 3. 操作用户表
		 */
		logger.info("操作用户表...");
		DUcUser dUcUser = new DUcUser();

		dUcUser.setId(userId);
		dUcUser.setPersonId(personId);
		dUcUser.setPassword(password);
		dUcUser.setUserNm(userName);
		dUcUser.setForceChangePwd((short) 0);//默认不需要修改密码
		dUcUser.setUserStatus(UpmsConstant.USER_STATUS_NORMAL);// 状态默认置为正常
		dUcUser.setUserType(Short.valueOf(info.get("userType").toString()));
		dUcUser.setPerfectUserInfo((short) 0);//默认不需要完善信息
		dUcUser.setNewOldPwd((short) 1);//默认新密码
		dUcUser.setCreatedate(new Date());
		dUcUser.setCreateuserid(userId);
		int userRtn = userApiService.insertUser(dUcUser);
		logger.info("操作用户表结果:" + (1 == userRtn ? "成功" : "失败"));

		/**
		 * 4. 操作用户-角色关联表
		 */
		logger.info("操作用户-角色关联表...");
		/*
			4.1 角色
				注册时,不区分手机用户/普通企业用户/交易商, 角色统一为"手机用户",
				当普通企业用户或交易商注册的审核流程通过后,再变更其角色
		 */
		short userType = UpmsConstant.USER_TYPE_TEL;
		DUcAccountTypeRoleExample dUcAccountTypeRoleExample = new DUcAccountTypeRoleExample();
		dUcAccountTypeRoleExample.createCriteria().andAccountTypeEqualTo(userType);
		List<DUcAccountTypeRole> dUcAccountTypeRoles = dUcAccountTypeRoleMapper.selectByExample(dUcAccountTypeRoleExample);

		/*
			4.2 用户-角色关联表插值
		 */
		if (null != dUcAccountTypeRoles) {
			for (DUcAccountTypeRole dUcAccountTypeRole : dUcAccountTypeRoles) {
				DUcUserRole dUcUserRole = new DUcUserRole();
				String userRoleId = UUID.randomUUID().toString().replace("-", "");
				logger.info("生成用户-角色关联表ID:" + userRoleId);
				dUcUserRole.setUserId(userId);
				dUcUserRole.setRoleId(dUcAccountTypeRole.getRoleId());
				dUcUserRole.setCreatetime(new Date());
				dUcUserRole.setCreateuser(userId);
				int userRoleRtn = dUcUserRoleMapper.insert(dUcUserRole);
				logger.info("结果:" + (1 == userRoleRtn ? "成功" : "失败"));
			}
		}
		logger.info("操作用户-角色关联表结果结束...");

		/**
		 * 5. 操作认证方式表
		 */
		logger.info("操作认证方式表...");
		DUcUserOauth dUcUserOauth = new DUcUserOauth();
		String dUcUserOauthId = UUID.randomUUID().toString().replace("-", "");
		logger.info("操作认证方式表	==>	生成认证方式ID:" + dUcUserOauthId);
		dUcUserOauth.setId(dUcUserOauthId);
		dUcUserOauth.setUserId(userId);
		dUcUserOauth.setCreatetime(new Date());
		dUcUserOauth.setCreateuser(userId);

		// TODO 临时默认手机认证
		dUcUserOauth.setOauthType(UpmsConstant.USER_OAUTH_TYPE_TEL);
		dUcUserOauth.setThirdId(mobile);

		dUcUserOauth.setCreatetime(new Date());
		int userOauthRtn = dUcUserOauthMapper.insert(dUcUserOauth);
		logger.info("操作认证方式表结果:" + (1 == userOauthRtn ? "成功" : "失败"));

		/**
		 * 6. 若 entpId 不为空<br>
		 *     还需操作 组织人员/组织用户 表
		 */
		if (null != entpId) {
			logger.info("添加 组织人员/组织用户 关联信息");

			/*
				6.1 添加组织人员
			 */
			logger.info("操作组织人员表...");
			String orgPersonId = UUID.randomUUID().toString().replace("-", "");
			logger.info("操作组织人员表	==>	生成组织人员表主键ID:" + orgPersonId);
			DUcOrgPerson dUcOrgPerson = new DUcOrgPerson();
			dUcOrgPerson.setId(orgPersonId);
			dUcOrgPerson.setOrgId(entpId);
			dUcOrgPerson.setPersonId(personId);
			dUcOrgPerson.setEntpPersonType(UpmsConstant.ENTP_PERSON_TYPE_ENTPCONT);//默认置为企业联系人
			dUcOrgPerson.setPersonStatus(UpmsConstant.USER_STATUS_NORMAL);// 状态默认置为正常
			dUcOrgPerson.setTel(tel);
			dUcOrgPerson.setMobile(mobile);
			dUcOrgPerson.setMail(email);
			dUcOrgPerson.setCreatetime(new Date());
			dUcOrgPerson.setCreateuser(userId);
			int orgPersonRtn = dUcOrgPersonMapper.insert(dUcOrgPerson);
			logger.info("操作组织人员表结果:" + (1 == orgPersonRtn ? "成功" : "失败"));
			/*
				6.2 添加组织用户
			 */
			logger.info("操作组织用户表...");
			String orgUserId = UUID.randomUUID().toString().replace("-", "");
			logger.info("操作组织用户表	==>	生成组织用户表主键ID:" + orgUserId);
			DUcOrgUser dUcOrgUser = new DUcOrgUser();
			dUcOrgUser.setId(orgUserId);
			dUcOrgUser.setOrgId(entpId);
			dUcOrgUser.setUserId(userId);
			dUcOrgUser.setStatus(UpmsConstant.USER_STATUS_NORMAL);// 状态默认置为正常
			dUcOrgUser.setCreatetime(new Date());
			dUcOrgUser.setCreateuser(userId);

			int orgUserRtn = dUcOrgUserMapper.insert(dUcOrgUser);
			logger.info("操作组织用户表结果:" + (1 == orgUserRtn ? "成功" : "失败"));

			logger.info("用户注册操作成功...");
			return 1;
		}

		logger.info("用户注册操作成功...");
		return 1;
	}

}

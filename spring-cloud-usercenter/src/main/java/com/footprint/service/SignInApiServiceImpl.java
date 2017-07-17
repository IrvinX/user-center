package com.footprint.service;

import com.alibaba.fastjson.JSON;
import com.footprint.api.*;
import com.footprint.common.constant.ErrorCodeConstant;
import com.footprint.common.constant.UpmsConstant;
import com.footprint.common.dao.*;
import com.footprint.common.dto.BaseResult;
import com.footprint.common.dto.ResultConstant;
import com.footprint.common.merkletree.service.MerkleService;
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
 * <p>
 * try catch 异常处理后期处理
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
	DUcOrgBankAccountMapper dUcOrgBankAccountMapper;// 组织银行账户
	@Autowired
	MerkleService merkleService;

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
		dUcDealer.setFirmStatus(UpmsConstant.ENPT_STATUS_NORMAL);//默认企业状态正常
		BaseResult dealerRtn = dealerApiService.insert(dUcDealer);
		logger.info("操作交易商表结果:" + ("0".equals(dealerRtn.getCode()) ? "成功" : "失败"));

		/**
		 * 2.企业-企业账户类型映射
		 */
		DUcEntpTypeMap dUcEntpTypeMap = new DUcEntpTypeMap(
				UUID.randomUUID().toString().replace("-", ""),//id
				entpId,                               //entpId
				UpmsConstant.ENTP_ACCOUNT_TYPE_DEALER,//entpType 交易商
				new Date(),                           //createtime
				userId,                               //createuser
				null,                     //updatetime
				null);                    //updateuser
		BaseResult entpTypeMapRtn = enterpriseApiService.insertDUcEntpTypeMap(dUcEntpTypeMap);
		logger.info("企业-企业账户类型映射表结果:" + ("0".equals(entpTypeMapRtn.getCode()) ? "成功" : "失败"));

		/**
		 * 3.组织银行账户操作
		 */
		Map<String, Object> bankInfo = (Map<String, Object>) info.get("dealerInfo");
		DUcOrgBankAccount dUcOrgBankAccount = new DUcOrgBankAccount(
				UUID.randomUUID().toString().replace("-", ""),//id
				null,//verid
				entpId,//orgId
				UpmsConstant.BANK_TYPE_TAX,//bankType 增值税票银行
				bankInfo.get("bankName").toString(),   // bankName
				bankInfo.get("bankAccount").toString(),// bankAccount
				null,//bankCode
				null,//cmName
				null,//bankTel
				null,//bankMobile
				new Date(),//createtime
				userId,//createuser
				null,//updatetime
				null//updateuser
		);
		BaseResult bankAccountRtn = enterpriseApiService.insertDUcOrgBankAccount(dUcOrgBankAccount);
		logger.info("操作组织银行账户结果:" + ("0".equals(bankAccountRtn.getCode()) ? "成功" : "失败"));

		/**
		 * 4. 企业操作
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
				null,//verid
				UpmsConstant.ORG_TYPE_NORMAL,//orgType 默认普通企业
				UpmsConstant.ORG_VIRTUAL_FLAG_ENTITY,//virtualFlg 默认实体
				null,//orgName
				null,//orgShortName
				null,//orgNameEng
				null,//orgShortNameEng
				new Date(),//createtime
				userId,//createuser
				null,//updatetime
				null //updateuser
		);
		BaseResult orgRtn = enterpriseApiService.insertDUcOrg(dUcOrg);
		logger.info("操作组织表结果:" + ("0".equals(orgRtn.getCode()) ? "成功" : "失败"));

		/**
		 * 2. 企业信息操作
		 */
		DUcEnterprise dUcEnterprise = JSON.toJavaObject(JSON.parseObject(JSON.toJSONString(info.get("entpInfo"))), DUcEnterprise.class);
		dUcEnterprise.setId(entpId);
		dUcEnterprise.setEntpStatus(UpmsConstant.ENPT_STATUS_NORMAL);//默认状态为正常
		dUcEnterprise.setCreateuser(userId);
		dUcEnterprise.setCreatetime(new Date());
		BaseResult entpRtn = enterpriseApiService.insert(dUcEnterprise);
		logger.info("操作企业表结果:" + ("0".equals(entpRtn.getCode()) ? "成功" : "失败"));

		/**
		 * 3.企业-企业账户类型映射
		 */
		DUcEntpTypeMap dUcEntpTypeMap = new DUcEntpTypeMap(
				UUID.randomUUID().toString().replace("-", ""),//id
				entpId,                               //entpId
				UpmsConstant.ENTP_ACCOUNT_TYPE_NORMAL,//entpType 普通企业
				new Date(),                           //createtime
				userId,                               //createuser
				null,                     //updatetime
				null);                    //updateuser
		BaseResult entpTypeMapRtn = enterpriseApiService.insertDUcEntpTypeMap(dUcEntpTypeMap);
		logger.info("企业-企业账户类型映射表结果:" + ("0".equals(entpTypeMapRtn.getCode()) ? "成功" : "失败"));

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
		// 生成人员ID
		String personId = UUID.randomUUID().toString().replace("-", "");
		logger.info("操作人员表	==>	生成人员ID:" + personId);
		DUcPerson dUcPerson = new DUcPerson(
				personId,//id
				null,//verid
				realName,//name
				null,//sex
				null,//birthday
				null,//identityType
				null,//identityId
				idUrl,//identityUrl
				null,//photoUrl
				tel,//tel
				mobile,//mobile
				fax,//fax
				email,//mail
				null,//province
				null,//city
				null,//district
				null,//address
				UpmsConstant.USER_STATUS_NORMAL,//personStatus 状态默认置为正常
				null,//memo
				new Date(),//createtime
				userId,//createuser
				null,//updatetime
				null //updateuser
		);
		BaseResult personRtn = personApiService.insert(dUcPerson);
		logger.info("操作人员表结果:" + ("0".equals(personRtn.getCode()) ? "成功" : "失败"));

		/**
		 * 3. 操作用户表
		 */
		logger.info("操作用户表...");
		DUcUser dUcUser = new DUcUser(
				userId,//id
				null,//verid
				personId,//personId
				null,//salt
				userName,//userNm
				password,//password
				(short) 0,//forceChangePwd 默认不需要修改密码
				null,//entpSuperAdmin
				UpmsConstant.USER_STATUS_NORMAL,//userStatus 状态默认置为正常
				Short.valueOf(info.get("userType").toString()),//userType
				null,//enableKey
				null,//keycode
				null,//userOrigin
				(short) 0,//perfectUserInfo 默认不需要完善信息
				(short) 1,//newOldPwd 默认新密码
				null,//expiryDateStt
				null,//expiryDateEnd
				null,//accountQuestion
				null,//questionAnswer
				new Date(),//createdate
				userId,//createuserid
				null,//updatedate
				null //updateuserid
		);
		BaseResult userRtn = userApiService.insertUser(dUcUser);
		logger.info("操作用户表结果:" + ("0".equals(userRtn.getCode()) ? "成功" : "失败"));

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
				String userRoleId = UUID.randomUUID().toString().replace("-", "");
				logger.info("生成用户-角色关联表ID:" + userRoleId);
				DUcUserRole dUcUserRole = new DUcUserRole(
						userRoleId,//id
						null,//verid
						userId,//userId
						null,//orgId
						dUcAccountTypeRole.getRoleId(),//roleId
						new Date(),//createtime
						userId,//createuser
						null,//updatetime
						null //updateuser
				);
				BaseResult userRoleRtn = userApiService.insertDUcUserRole(dUcUserRole);
				logger.info("结果:" + ("0".equals(userRoleRtn.getCode()) ? "成功" : "失败"));
			}
		}
		logger.info("操作用户-角色关联表结果结束...");

		/**
		 * 5. 操作认证方式表
		 */
		logger.info("操作认证方式表...");
		String dUcUserOauthId = UUID.randomUUID().toString().replace("-", "");
		logger.info("操作认证方式表	==>	生成认证方式ID:" + dUcUserOauthId);
		DUcUserOauth dUcUserOauth = new DUcUserOauth(
				dUcUserOauthId,//id
				null,//verid
				userId,//userId
				UpmsConstant.USER_OAUTH_TYPE_TEL,//oauthType TODO 临时默认手机认证
				mobile,//thirdId
				new Date(),//createtime
				userId,//createuser
				null,//updatetime
				null//updateuser
		);
		BaseResult userOauthRtn = userApiService.insertDUcUserOauth(dUcUserOauth);
		logger.info("操作认证方式表结果:" + ("0".equals(userOauthRtn.getCode()) ? "成功" : "失败"));

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
			DUcOrgPerson dUcOrgPerson = new DUcOrgPerson(
					orgPersonId,//id
					null,//verid
					entpId,//orgId
					personId,//personId
					UpmsConstant.ENTP_PERSON_TYPE_ENTPCONT,//entpPersonType 默认置为企业联系人
					tel,//tel
					mobile,//mobile
					email,//mail
					null,//position
					UpmsConstant.USER_STATUS_NORMAL,//personStatus 状态默认置为正常
					null,//memo
					null,//expiryDateStt
					null,//expiryDateEnd
					new Date(),//createtime
					userId,//createuser
					null,//updatetime
					null //updateuser
			);
			BaseResult orgPersonRtn = personApiService.insertDUcOrgPerson(dUcOrgPerson);
			logger.info("操作组织人员表结果:" + ("0".equals(orgPersonRtn.getCode()) ? "成功" : "失败"));
			/*
				6.2 添加组织用户
			 */
			logger.info("操作组织用户表...");
			String orgUserId = UUID.randomUUID().toString().replace("-", "");
			logger.info("操作组织用户表	==>	生成组织用户表主键ID:" + orgUserId);
			DUcOrgUser dUcOrgUser = new DUcOrgUser(
					orgUserId,//id
					null,//verid
					entpId,//orgId
					userId,//userId
					UpmsConstant.USER_STATUS_NORMAL,//status 状态默认置为正常
					null,//expiryDateStt
					null,//expiryDateEnd
					new Date(),//createtime
					userId,//createuser
					null,//updatetime
					null //updateuser
			);
			BaseResult orgUserRtn = userApiService.insertDUcOrgUser(dUcOrgUser);
			logger.info("操作组织用户表结果:" + ("0".equals(orgUserRtn.getCode()) ? "成功" : "失败"));

			logger.info("用户注册操作成功...");
			return 1;
		}

		logger.info("用户注册操作成功...");
		return 1;
	}

}

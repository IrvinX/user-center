package com.footprint.service;

import com.alibaba.fastjson.JSON;
import com.footprint.api.DealerApiService;
import com.footprint.api.EnterpriseApiService;
import com.footprint.api.WFApiService;
import com.footprint.common.constant.UpmsConstant;
import com.footprint.common.dao.*;
import com.footprint.common.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * Created by gaofang on 2017/6/30.
 *
 * @author gaofang
 *         <p>
 *         流程审批服务
 */
@Service
@Transactional
public class WFApiServiceImpl implements WFApiService {

	private static Logger logger = LoggerFactory.getLogger(WFApiServiceImpl.class);

	@Autowired
	EnterpriseApiService enterpriseApiService;
	@Autowired
	DealerApiService dealerApiService;
	@Autowired
	DUcWfMapper dUcWfMapper;
	@Autowired
	DUcEntpAuditMapper dUcEntpAuditMapper;
	@Autowired
	DUcEnterpriseAuditInfoMapper dUcEnterpriseAuditInfoMapper;
	@Autowired
	DUcDealerAuditInfoMapper dUcDealerAuditInfoMapper;
	@Autowired
	DUcEntpTypeMapMapper dUcEntpTypeMapMapper;//企业-企业账户类型映射

	@Override
	public int signInWF(DUcEnterprise dUcEnterprise) {
		logger.info("WFApiServiceImpl	==>	signInWF");
		logger.info("params	==>	dUcEnterprise:" + JSON.toJSONString(dUcEnterprise));

		/**
		 * 1. 审核流程表中创建一条审核流程
		 */
		logger.info("创建审核流程...");
		String wfId = createWF(UpmsConstant.ACCOUNT_CHANGE_TYPE_TEL2ENTP);//手机用户到普通企业用户

		/**
		 * 2. 审核节点表中创建一条当前节点审核数据
		 */
		logger.info("创建审核节点...");
		String auditId = createAuditNode(wfId, UpmsConstant.AUDIT_STAGE_SECOND);// 普通企业,直接由总部审核

		/**
		 * 3. 创建企业审核信息
		 */
		logger.info("创建企业审核信息...");
		int entpInfoRtn = generateDUcEnterpriseAuditInfo(UpmsConstant.ENTP_ACCOUNT_TYPE_NORMAL, auditId, dUcEnterprise);

		return entpInfoRtn;
	}

	@Override
	public int signInWF(DUcEnterprise dUcEnterprise, DUcDealer dUcDealer) {
		logger.info("WFApiServiceImpl	==>	signInWF");
		logger.info("params	==>	dUcEnterprise:" + JSON.toJSONString(dUcEnterprise));
		logger.info("params	==>	dUcDealer:" + JSON.toJSONString(dUcDealer));

		/**
		 * 1. 审核流程表中创建一条审核流程
		 */
		logger.info("创建审核流程...");
		String wfId = createWF(UpmsConstant.ACCOUNT_CHANGE_TYPE_TEL2DEALER);//手机用户到交易商

		/**
		 * 2. 审核节点表中创建一条当前节点审核数据
		 */
		logger.info("创建审核节点...");
		String auditId = createAuditNode(wfId, UpmsConstant.AUDIT_STAGE_FIRST);// 交易商,先由办事处审核

		/**
		 * 3. 创建企业审核信息
		 */
		logger.info("创建企业审核信息...");
		int entpInfoRtn = generateDUcEnterpriseAuditInfo(UpmsConstant.ENTP_ACCOUNT_TYPE_DEALER, auditId, dUcEnterprise);

		/**
		 * 4. 创建交易商审核信息
		 */
		logger.info("创建交易商审核信息...");
		int dealerInfoRtn = generateDUcDealerAuditInfo(auditId, dUcDealer);

		return entpInfoRtn * dealerInfoRtn;
	}

	@Override
	public List<Map<String, Object>> getPendings(short auditStage) {
		logger.info("WFApiServiceImpl	==>	getPendings");
		logger.info("params	==>	auditStage:" + auditStage);

		List<Map<String, Object>> rtn = new ArrayList<>();
		/**
		 * 1. 获取所有符合要求的节点id
		 */
		DUcEntpAuditExample dUcEntpAuditExample = new DUcEntpAuditExample();
		// 状态为待审核
		dUcEntpAuditExample.createCriteria()
				.andAuditStageEqualTo(auditStage).
				andAuditStatusEqualTo(UpmsConstant.AUDIT_STATUS_PENDING);
		List<DUcEntpAudit> dUcEntpAudits = dUcEntpAuditMapper.selectByExample(dUcEntpAuditExample);

		/**
		 * 2. 通过节点id取所有审核信息
		 */
		for (DUcEntpAudit dUcEntpAudit : dUcEntpAudits) {
			rtn.add(getAuditNode(dUcEntpAudit.getId()));
		}

		return rtn;
	}

	@Override
	public Map<String, Object> getAuditNode(String id) {
		logger.info("WFApiServiceImpl	==>	getAuditNode");
		logger.info("params	==>	id:" + id);

		Map<String, Object> rtn = new HashMap<>();

		/**
		 * 1. 查企业审核信息表
		 */
		DUcEnterpriseAuditInfoExample dUcEnterpriseAuditInfoExample = new DUcEnterpriseAuditInfoExample();
		dUcEnterpriseAuditInfoExample.createCriteria().andAuditIdEqualTo(id);
		List<DUcEnterpriseAuditInfo> dUcEnterpriseAuditInfos = dUcEnterpriseAuditInfoMapper.selectByExample(dUcEnterpriseAuditInfoExample);
		if (null != dUcEnterpriseAuditInfos && dUcEnterpriseAuditInfos.size() > 0) {
			rtn.put("entp", dUcEnterpriseAuditInfos.get(0));
		}

		/**
		 * 2. 查交易商审核信息表
		 */
		DUcDealerAuditInfoExample dUcDealerAuditInfoExample = new DUcDealerAuditInfoExample();
		dUcDealerAuditInfoExample.createCriteria().andAuditIdEqualTo(id);
		List<DUcDealerAuditInfo> dUcDealerAuditInfos = dUcDealerAuditInfoMapper.selectByExample(dUcDealerAuditInfoExample);
		if (null != dUcDealerAuditInfos && dUcDealerAuditInfos.size() > 0) {
			rtn.put("dealer", dUcDealerAuditInfos.get(0));
		}
		return rtn;
	}

	@Override
	public int audit(String id, Map<String, Object> auditInfo) {
		logger.info("WFApiServiceImpl	==>	audit");
		logger.info("params	==>	id:" + id);
		logger.info("params	==>	auditInfo:" + JSON.toJSONString(auditInfo));

		/**
		 * 1. 设置当前节点状态
		 *    auditStatus/auditMemo/auditMan
		 */
		logger.info("设置当前节点状态...");
		DUcEntpAudit dUcEntpAudit = dUcEntpAuditMapper.selectByPrimaryKey(id);
		dUcEntpAudit.setAuditStatus((Short) auditInfo.get("auditStatus"));
		dUcEntpAudit.setAuditDate(new Date());
		dUcEntpAudit.setAuditMemo(null == auditInfo.get("auditMemo") ? "" : auditInfo.get("auditMemo").toString());
		dUcEntpAudit.setAuditMan(null == auditInfo.get("auditMan") ? "" : auditInfo.get("auditMan").toString());
		dUcEntpAuditMapper.insert(dUcEntpAudit);
		logger.info("设置当前节点状态完成...");
		/**
		 * 2.判断:
		 */
		int rtn = 0;
		/*
		 	若总部审核且状态通过,修改流程状态为结束
		  */

		switch (dUcEntpAudit.getAuditStage()) {
			//办事处审核
			case UpmsConstant.AUDIT_STAGE_FIRST:
				short auditStage = dUcEntpAudit.getAuditStage();
				//通过,创建新节点,进入下一节点
				//驳回,创建新节点,仍处在当前节点
				if (UpmsConstant.AUDIT_STATUS_PASS == dUcEntpAudit.getAuditStatus()) {
					logger.info("通过,创建新节点,进入下一节点...");
					auditStage = UpmsConstant.AUDIT_STAGE_SECOND;
				}

				/**
				 * 创建新节点
				 */
				String newAuditId = createAuditNode(dUcEntpAudit.getWfId(), auditStage);
				/**
				 * 将新节点id赋给审核信息
				 */
				rtn = changeAuditNode(dUcEntpAudit.getId(), newAuditId);
				break;

			//总部审核
			case UpmsConstant.AUDIT_STAGE_SECOND:
				//通过,流程结束
				if (UpmsConstant.AUDIT_STATUS_PASS == dUcEntpAudit.getAuditStatus()) {
					logger.info("通过,流程结束...");
					DUcWf dUcWf = dUcWfMapper.selectByPrimaryKey(dUcEntpAudit.getWfId());
					dUcWf.setWfStatus(UpmsConstant.PROCESS_STATUS_END);//流程结束状态
					rtn = dUcWfMapper.insert(dUcWf);
				}
				//驳回,创建新节点,仍处在当前节点
				else if (UpmsConstant.AUDIT_STATUS_REJECT == dUcEntpAudit.getAuditStatus()) {
					logger.info("驳回,创建新节点,仍处在当前节点...");
					short stage = dUcEntpAudit.getAuditStage();
					/**
					 * 创建新节点
					 */
					String auditId = createAuditNode(dUcEntpAudit.getWfId(), stage);
					/**
					 * 将新节点id赋给审核信息
					 */
					rtn = changeAuditNode(dUcEntpAudit.getId(), auditId);
				}
				break;

			default:
				break;
		}
		return rtn;
	}

	/**
	 * 变更审核信息节点id
	 *
	 * @param oldId
	 * @param newId
	 * @return
	 */
	private int changeAuditNode(String oldId, String newId) {
		// 企业
		Map<String, Object> auditInfos = getAuditNode(oldId);
		if (null == auditInfos)
			return 0;
		if (null != auditInfos.get("entp")) {
			logger.info("更新企业节点id");
			DUcEnterpriseAuditInfo dUcEnterpriseAuditInfo = (DUcEnterpriseAuditInfo) auditInfos.get("entp");
			dUcEnterpriseAuditInfo.setAuditId(newId);
			dUcEnterpriseAuditInfoMapper.insert(dUcEnterpriseAuditInfo);
		}
		// 交易商
		if (null != auditInfos.get("dealer")) {
			logger.info("更新交易商节点id");
			DUcDealerAuditInfo dUcDealerAuditInfo = (DUcDealerAuditInfo) auditInfos.get("dealer");
			dUcDealerAuditInfo.setAuditId(newId);
			dUcDealerAuditInfoMapper.insert(dUcDealerAuditInfo);
		}
		return 1;
	}

	/**
	 * 创建审核流程
	 *
	 * @return 返回流程id
	 */
	private String createWF(short changeType) {
		String wfId = UUID.randomUUID().toString().replace("-", "");
		logger.info("生成流程ID:" + wfId);
		DUcWf dUcWf = new DUcWf();
		dUcWf.setId(wfId);
		dUcWf.setChangeType(changeType);
		dUcWf.setWfStatus(UpmsConstant.PROCESS_STATUS_ACTIVE);//流程状态为进行中
		dUcWf.setCreatetime(new Date());
		int wfRtn = dUcWfMapper.insert(dUcWf);
		logger.info("审核流程创建结果:" + (1 == wfRtn ? "成功" : "失败"));
		return wfId;
	}

	/**
	 * 创建审核节点
	 *
	 * @param wfId
	 * @param auditStage
	 * @return 返回审核节点id
	 */
	private String createAuditNode(String wfId, short auditStage) {
		String auditId = UUID.randomUUID().toString().replace("-", "");
		logger.info("生成节点ID:" + auditId);
		DUcEntpAudit dUcEntpAudit = new DUcEntpAudit();
		dUcEntpAudit.setId(auditId);
		dUcEntpAudit.setWfId(wfId);
		dUcEntpAudit.setAuditStage(auditStage);
//		dUcEntpAudit.setAuditType(); 审核类型保留
		dUcEntpAudit.setAuditStatus(UpmsConstant.AUDIT_STATUS_PENDING);
		dUcEntpAudit.setCreatetime(new Date());
		int auditRtn = dUcEntpAuditMapper.insert(dUcEntpAudit);
		logger.info("审核节点创建结果:" + (1 == auditRtn ? "成功" : "失败"));
		return auditId;
	}

	/**
	 * 生成并保存企业审核信息
	 *
	 * @param dUcEnterprise
	 * @return
	 */
	private int generateDUcEnterpriseAuditInfo(short type, String auditId, DUcEnterprise dUcEnterprise) {
		DUcEnterpriseAuditInfo dUcEnterpriseAuditInfo = new DUcEnterpriseAuditInfo();

		String entpInfoId = UUID.randomUUID().toString().replace("-", "");
		logger.info("生成企业审核信息ID:" + entpInfoId);
		dUcEnterpriseAuditInfo.setId(entpInfoId);
		dUcEnterpriseAuditInfo.setAuditId(auditId);
		dUcEnterpriseAuditInfo.setEntpId(dUcEnterprise.getId());
		/**
		 * 1. 设置修改字段值
		 */
		dUcEnterpriseAuditInfo.setFullname(dUcEnterprise.getFullname());
		dUcEnterpriseAuditInfo.setShortname(dUcEnterprise.getShortname());
		dUcEnterpriseAuditInfo.setFullnamePinyin(dUcEnterprise.getFullnamePinyin());
		dUcEnterpriseAuditInfo.setLpName(dUcEnterprise.getLpName());
		dUcEnterpriseAuditInfo.setIdentityTyep(dUcEnterprise.getIdentityType());
		dUcEnterpriseAuditInfo.setIdentityId(dUcEnterprise.getIdentityId());
		dUcEnterpriseAuditInfo.setIdentityUrl(dUcEnterprise.getIdentityUrl());
		dUcEnterpriseAuditInfo.setOrgType(dUcEnterprise.getOrgType());
		dUcEnterpriseAuditInfo.setCompOrgnNum(dUcEnterprise.getCompOrgnNum());
		dUcEnterpriseAuditInfo.setCompType(type);
		dUcEnterpriseAuditInfo.setCompProvince(dUcEnterprise.getCompProvince());
		dUcEnterpriseAuditInfo.setCompCity(dUcEnterprise.getCompCity());
		dUcEnterpriseAuditInfo.setCompDistrict(dUcEnterprise.getCompDistrict());
		dUcEnterpriseAuditInfo.setCompAddr(dUcEnterprise.getCompAddr());
		dUcEnterpriseAuditInfo.setBusinessLicenseUrl(dUcEnterprise.getBusinessLicenseUrl());
		dUcEnterpriseAuditInfo.setCreatetime(new Date());

		/**
		 * 2. 查询当前在用企业信息
		 */
		DUcEnterprise current = enterpriseApiService.findEnterprise(dUcEnterprise.getId());

		if (null != current) {
			/**
			 * 3. 设置当前在用企业信息字段值
			 */
			dUcEnterpriseAuditInfo.setFullnameOld(current.getFullname());
			dUcEnterpriseAuditInfo.setShortnameOld(current.getShortname());
			dUcEnterpriseAuditInfo.setFullnamePinyinOld(current.getFullnamePinyin());
			dUcEnterpriseAuditInfo.setLpNameOld(current.getLpName());
			dUcEnterpriseAuditInfo.setIdentityTyepOld(current.getIdentityType());
			dUcEnterpriseAuditInfo.setIdentityIdOld(current.getIdentityId());
			dUcEnterpriseAuditInfo.setIdentityUrlOld(current.getIdentityUrl());
			dUcEnterpriseAuditInfo.setOrgTypeOld(current.getOrgType());
			dUcEnterpriseAuditInfo.setCompOrgnNum(current.getCompOrgnNum());
			// 多种类类型暂不考虑,就按一种类型来
			short oldType;

			DUcEntpTypeMapExample dUcEntpTypeMapExample = new DUcEntpTypeMapExample();
			dUcEntpTypeMapExample.createCriteria().andEntpIdEqualTo(dUcEnterprise.getId());
			List<DUcEntpTypeMap> dUcEntpTypeMaps = dUcEntpTypeMapMapper.selectByExample(dUcEntpTypeMapExample);
			if (null == dUcEntpTypeMaps || 0 == dUcEntpTypeMaps.size()) {
				oldType = UpmsConstant.USER_TYPE_TEL;//企业账户类型不存在,即为手机用户
			} else {
				oldType = dUcEntpTypeMaps.get(0).getEntpType();
			}
			dUcEnterpriseAuditInfo.setCompTypeOld(oldType);
			dUcEnterpriseAuditInfo.setCompProvinceOld(current.getCompProvince());
			dUcEnterpriseAuditInfo.setCompCityOld(current.getCompCity());
			dUcEnterpriseAuditInfo.setCompDistrictOld(current.getCompDistrict());
			dUcEnterpriseAuditInfo.setCompAddrOld(current.getCompAddr());
			dUcEnterpriseAuditInfo.setBusinessLicenseUrlOld(current.getBusinessLicenseUrl());
		}
		/**
		 * 4. 保存
		 */
		int entpInfoRtn = dUcEnterpriseAuditInfoMapper.insert(dUcEnterpriseAuditInfo);
		logger.info("企业审核信息创建结果:" + (1 == entpInfoRtn ? "成功" : "失败"));
		return entpInfoRtn;
	}

	/**
	 * 生成交易商审核信息
	 *
	 * @param dUcDealer
	 * @return
	 */
	private int generateDUcDealerAuditInfo(String auditId, DUcDealer dUcDealer) {
		DUcDealerAuditInfo dUcDealerAuditInfo = new DUcDealerAuditInfo();

		String dealerInfoId = UUID.randomUUID().toString().replace("-", "");
		logger.info("生成交易商审核信息ID:" + dealerInfoId);
		dUcDealerAuditInfo.setId(dealerInfoId);
		dUcDealerAuditInfo.setAuditId(auditId);
		dUcDealerAuditInfo.setDealerId(dUcDealer.getId());
		dUcDealerAuditInfo.setCreatetime(new Date());

		/**
		 * 1. 设置修改字段值
		 */
		dUcDealerAuditInfo.setFirmType(dUcDealer.getFirmType());
		dUcDealerAuditInfo.setAccountType(dUcDealer.getAccountType());
		dUcDealerAuditInfo.setEntpType(dUcDealer.getEntpType());
		dUcDealerAuditInfo.setMarketAgr(dUcDealer.getMarketAgr());
		dUcDealerAuditInfo.setFirmCode(dUcDealer.getFirmCode());
		dUcDealerAuditInfo.setFirmShortName(dUcDealer.getFirmShortName());
		dUcDealerAuditInfo.setJoinDate(dUcDealer.getJoinDate());
		dUcDealerAuditInfo.setVatInvoiceEntpType(dUcDealer.getVatInvoiceEntpType());
		dUcDealerAuditInfo.setQualFeeUrl(dUcDealer.getQualFeeUrl());
		dUcDealerAuditInfo.setCustomRegion(dUcDealer.getCustomRegion());

		/**
		 * 2. 查询当前在用企业信息
		 */
		DUcDealer current = dealerApiService.selectByPrimaryKey(dUcDealer.getId());

		if (null != current) {
			/**
			 * 3. 设置当前在用企业信息字段值
			 */
			dUcDealerAuditInfo.setFirmTypeOld(current.getFirmType());
			dUcDealerAuditInfo.setAccountTypeOld(current.getAccountType());
			dUcDealerAuditInfo.setEntpTypeOld(current.getEntpType());
			dUcDealerAuditInfo.setMarketAgrOld(current.getMarketAgr());
			dUcDealerAuditInfo.setFirmCodeOld(current.getFirmCode());
			dUcDealerAuditInfo.setFirmShortNameOld(current.getFirmShortName());
			dUcDealerAuditInfo.setJoinDateOld(current.getJoinDate());
			dUcDealerAuditInfo.setVatInvoiceEntpTypeOld(current.getVatInvoiceEntpType());
			dUcDealerAuditInfo.setQualFeeUrlOld(current.getQualFeeUrl());
			dUcDealerAuditInfo.setCustomRegionOld(current.getCustomRegion());
		}

		/**
		 * 4. 保存
		 */
		int dealerInfoRtn = dUcDealerAuditInfoMapper.insert(dUcDealerAuditInfo);
		logger.info("交易商审核信息创建结果:" + (1 == dealerInfoRtn ? "成功" : "失败"));

		return dealerInfoRtn;
	}
}

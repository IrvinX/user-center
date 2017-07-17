package com.footprint.service;

import com.alibaba.fastjson.JSON;
import com.footprint.api.DealerApiService;
import com.footprint.api.EnterpriseApiService;
import com.footprint.api.WFApiService;
import com.footprint.common.constant.UpmsConstant;
import com.footprint.common.dao.*;
import com.footprint.common.dto.BaseResult;
import com.footprint.common.dto.ResultConstant;
import com.footprint.common.merkletree.InsObj;
import com.footprint.common.merkletree.Merkle;
import com.footprint.common.merkletree.repository.MerkleRepository;
import com.footprint.common.merkletree.service.MerkleService;
import com.footprint.common.model.*;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
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
	@Autowired
	MerkleService merkleService;
	@Autowired
	CommonMapper commonMapper;
	@Autowired
	MerkleRepository merkleRepository;

	@Override
	public int signInWF(DUcEnterprise dUcEnterprise) {
		logger.info("WFApiServiceImpl	==>	signInWF");
		logger.info("params	==>	dUcEnterprise:" + JSON.toJSONString(dUcEnterprise));

		/**
		 * 1. 审核流程表中创建一条审核流程
		 */
		logger.info("创建审核流程...");
		String wfId = createWF(UpmsConstant.ACCOUNT_CHANGE_TYPE_TEL2ENTP, UpmsConstant.AUDIT_SRC_REGISTER);//手机用户到普通企业用户,审核来源为新注册类型

		/**
		 * 2. 审核节点表中创建一条当前节点审核数据
		 */
		logger.info("创建审核节点...");
		String auditId = createAuditNode(wfId, UpmsConstant.AUDIT_STAGE_SECOND);// 普通企业,直接由总部审核

		/**
		 * 3. 创建企业审核信息
		 */
		logger.info("创建企业审核信息...");
		int entpInfoRtn = generateDUcEnterpriseAuditInfo(UpmsConstant.ENTP_ACCOUNT_TYPE_NORMAL, auditId, dUcEnterprise, UpmsConstant.AUDIT_SRC_REGISTER);

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
		String wfId = createWF(UpmsConstant.ACCOUNT_CHANGE_TYPE_TEL2DEALER, UpmsConstant.AUDIT_SRC_REGISTER);//手机用户到交易商,审核来源为新注册类型

		/**
		 * 2. 审核节点表中创建一条当前节点审核数据
		 */
		logger.info("创建审核节点...");
		String auditId = createAuditNode(wfId, UpmsConstant.AUDIT_STAGE_FIRST);// 交易商,先由办事处审核

		/**
		 * 3. 创建企业审核信息
		 */
		logger.info("创建企业审核信息...");
		int entpInfoRtn = generateDUcEnterpriseAuditInfo(UpmsConstant.ENTP_ACCOUNT_TYPE_DEALER, auditId, dUcEnterprise, UpmsConstant.AUDIT_SRC_REGISTER);

		/**
		 * 4. 创建交易商审核信息
		 */
		logger.info("创建交易商审核信息...");
		int dealerInfoRtn = generateDUcDealerAuditInfo(auditId, dUcDealer, UpmsConstant.AUDIT_SRC_REGISTER);

		return entpInfoRtn * dealerInfoRtn;
	}

	/**
	 * 审核流程新建并启动(启动流程)
	 *
	 * @param dUcEnterprise
	 * @param dUcDealer
	 * @param changeType
	 * @param auditSrc
	 * @param auditStge
	 * @return
	 */
	@Override
	public int createAndStartWF(DUcEnterprise dUcEnterprise, DUcDealer dUcDealer, short changeType, short auditSrc, short auditStge) {
		logger.info("WFApiServiceImpl	==>	createAndStartWF");
		logger.info("params	==>	dUcEnterprise:" + JSON.toJSONString(dUcEnterprise));
		logger.info("params	==>	dUcDealer:" + JSON.toJSONString(dUcDealer));

		/**
		 * 1. 审核流程表中创建一条审核流程
		 */
		logger.info("创建审核流程...");
		String wfId = createWF(changeType, auditSrc);

		/**
		 * 2. 审核节点表中创建一条当前节点审核数据
		 */
		logger.info("创建审核节点...");
		String auditId = createAuditNode(wfId, auditStge);

		/**
		 * 3. 创建企业审核信息
		 */
		if (null != dUcEnterprise) {
			logger.info("创建企业审核信息...");
			generateDUcEnterpriseAuditInfo(UpmsConstant.ENTP_ACCOUNT_TYPE_DEALER, auditId, dUcEnterprise, auditSrc);
		}

		/**
		 * 4. 创建交易商审核信息
		 */
		if (null != dUcDealer) {
			logger.info("创建交易商审核信息...");
			generateDUcDealerAuditInfo(auditId, dUcDealer, changeType);
		}

		return 0;
	}

	/**
	 * 审核流程新建并启动(启动流程)
	 *
	 * @param dUcEnterprise
	 * @param changeType
	 * @param auditSrc
	 * @param auditStge
	 * @return
	 */
	@Override
	public int createAndStartWF(DUcEnterprise dUcEnterprise, short changeType, short auditSrc, short auditStge) {
		logger.info("WFApiServiceImpl	==>	createAndStartWF");
		logger.info("params	==>	dUcEnterprise:" + JSON.toJSONString(dUcEnterprise));

		/**
		 * 1. 审核流程表中创建一条审核流程
		 */
		logger.info("创建审核流程...");
		String wfId = createWF(changeType, auditSrc);

		/**
		 * 2. 审核节点表中创建一条当前节点审核数据
		 */
		logger.info("创建审核节点...");
		String auditId = createAuditNode(wfId, auditStge);

		/**
		 * 3. 创建企业审核信息
		 */
		if (null != dUcEnterprise) {
			logger.info("创建企业审核信息...");
			generateDUcEnterpriseAuditInfo(UpmsConstant.ENTP_ACCOUNT_TYPE_NORMAL, auditId, dUcEnterprise, auditSrc);
		}


		return 0;
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
	public BaseResult audit(Map<String, Object> auditInfo) {
		logger.info("WFApiServiceImpl	==>	audit");
		logger.info("params	==>	auditInfo:" + JSON.toJSONString(auditInfo));

		try {
			/**
			 * 1. 设置当前节点状态
			 *    auditStatus/auditMemo/auditMan
			 */
			logger.info("更新当前节点状态...");
			DUcEntpAudit dUcEntpAudit = dUcEntpAuditMapper.selectByPrimaryKey(auditInfo.get("id").toString());
			if (null == dUcEntpAudit)
				return new BaseResult(ResultConstant.FAILED, "审批节点不存在!");
			dUcEntpAudit.setAuditStatus(Short.valueOf(auditInfo.get("auditStatus").toString()));
			dUcEntpAudit.setAuditDate(new Date());
			dUcEntpAudit.setAuditMemo(null == auditInfo.get("auditMemo") ? "" : auditInfo.get("auditMemo").toString());
			dUcEntpAudit.setAuditMan(null == auditInfo.get("auditMan") ? "" : auditInfo.get("auditMan").toString());
			dUcEntpAuditMapper.updateByPrimaryKey(dUcEntpAudit);
			logger.info("更新当前节点状态完成...");

			logger.info("merkleService	==>	save...");
			merkleService.save(new ArrayList<Merkle>() {{
				add(new Merkle(dUcEntpAudit.getId(), new InsObj(DUcEntpAudit.class.getName(), JSON.toJSONString(dUcEntpAudit))));
			}});
			logger.info("merkleService	==>	complete");

			/**
			 * 2. 设置交易商编码
			 */
			//取交易商审核信息
			DUcDealerAuditInfoExample dUcDealerAuditInfoExample = new DUcDealerAuditInfoExample();
			dUcDealerAuditInfoExample.createCriteria().andAuditIdEqualTo(auditInfo.get("id").toString());
			List<DUcDealerAuditInfo> dUcDealerAuditInfos = dUcDealerAuditInfoMapper.selectByExample(dUcDealerAuditInfoExample);
			if (null != dUcDealerAuditInfos || 0 < dUcDealerAuditInfos.size()) {
				String entpId = dUcDealerAuditInfos.get(0).getDealerId();
				Merkle merkle = merkleRepository.findOne(entpId + "_dealer");
				InsObj insObj = (InsObj) merkle.getValue();
				DUcDealer dUcDealer = JSON.toJavaObject(JSON.parseObject(insObj.getJson()), DUcDealer.class);
				dUcDealer.setFirmCode(auditInfo.get("firmCode").toString());
				dealerApiService.update(dUcDealer);
			}


			/**
			 * 3.判断:
			 */
			/*
				若总部审核且状态通过,修改流程状态为结束
			 */
			switch (dUcEntpAudit.getAuditStage()) {
				//办事处审核
				case UpmsConstant.AUDIT_STAGE_FIRST:
					agency(dUcEntpAudit);
					break;

				//总部审核
				case UpmsConstant.AUDIT_STAGE_SECOND:
					headquarters(dUcEntpAudit);
					break;

				default:
					break;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}

		BaseResult baseResult = new BaseResult(ResultConstant.SUCCESS);
		return baseResult;
	}

	/**
	 * 总部审核
	 *
	 * @param dUcEntpAudit
	 */
	private void headquarters(DUcEntpAudit dUcEntpAudit) {
		//通过,流程结束,同步数据
		if (UpmsConstant.AUDIT_STATUS_PASS == dUcEntpAudit.getAuditStatus()) {
			logger.info("通过,流程结束...");
			logger.info("开始同步数据...");
			// 同步审核通过数据
			/**
			 * (若流程为新注册,不需要合并)
			 */
			DUcWf dUcWf = dUcWfMapper.selectByPrimaryKey(dUcEntpAudit.getWfId());
			if (UpmsConstant.AUDIT_SRC_REGISTER != dUcWf.getAuditSrc()) {
				//同步审核数据
				synchroAuditData(dUcEntpAudit.getId());
			}

			/**
			 * 根据账户转换类型,添加企业-企业类型表关联数据
			 */
			DUcEnterpriseAuditInfoExample dUcEnterpriseAuditInfoExample = new DUcEnterpriseAuditInfoExample();
			dUcEnterpriseAuditInfoExample.createCriteria().andAuditIdEqualTo(dUcEntpAudit.getId());
			List<DUcEnterpriseAuditInfo> dUcEnterpriseAuditInfos = dUcEnterpriseAuditInfoMapper.selectByExample(dUcEnterpriseAuditInfoExample);
			String entpId = "";
			String userId = "";
			if (null != dUcEnterpriseAuditInfos || 0 < dUcEnterpriseAuditInfos.size()) {
				entpId = dUcEnterpriseAuditInfos.get(0).getEntpId();
				userId = dUcEnterpriseAuditInfos.get(0).getCreateuser();
			}
			switch (dUcWf.getChangeType()) {
				case UpmsConstant.ACCOUNT_CHANGE_TYPE_TEL2ENTP:
					logger.info("添加 企业-企业账户类型映射开始...");
					insertDUcEntpTypeMap(entpId, UpmsConstant.ENTP_ACCOUNT_TYPE_NORMAL, userId);
					logger.info("添加 企业-企业账户类型映射结束...");
					break;

				case UpmsConstant.ACCOUNT_CHANGE_TYPE_TEL2DEALER:
					logger.info("添加 企业-企业账户类型映射开始...");
					insertDUcEntpTypeMap(entpId, UpmsConstant.ENTP_ACCOUNT_TYPE_NORMAL, userId);
					insertDUcEntpTypeMap(entpId, UpmsConstant.ENTP_ACCOUNT_TYPE_DEALER, userId);
					logger.info("添加 企业-企业账户类型映射结束...");
					break;

				case UpmsConstant.ACCOUNT_CHANGE_TYPE_ENTP2DEALER:
					logger.info("添加 企业-企业账户类型映射开始...");
					insertDUcEntpTypeMap(entpId, UpmsConstant.ENTP_ACCOUNT_TYPE_DEALER, userId);
					logger.info("添加 企业-企业账户类型映射结束...");
					break;

				default:
					break;
			}

			/**
			 * 更新用户类型
			 */
			// todo

		}
		//驳回,流程结束
		else if (UpmsConstant.AUDIT_STATUS_REJECT == dUcEntpAudit.getAuditStatus()) {
			logger.info("驳回,流程结束...");
		}

		DUcWf dUcWf = dUcWfMapper.selectByPrimaryKey(dUcEntpAudit.getWfId());
		dUcWf.setWfStatus(UpmsConstant.PROCESS_STATUS_END);//流程结束状态
		dUcWfMapper.updateByPrimaryKey(dUcWf);
		logger.info("merkleService	==>	save...");
		merkleService.save(new ArrayList<Merkle>() {{
			add(new Merkle(dUcWf.getId(), new InsObj(DUcWf.class.getName(), JSON.toJSONString(dUcWf))));
		}});
		logger.info("merkleService	==>	complete");
	}

	/**
	 * 添加企业-企业类型
	 *
	 * @param entpId
	 * @param entpAccountTypeNormal
	 * @param userId
	 */
	private void insertDUcEntpTypeMap(String entpId, short entpAccountTypeNormal, String userId) {
		logger.info("insertDUcEntpTypeMap start..");
		DUcEntpTypeMap dUcEntpTypeMap = new DUcEntpTypeMap(
				UUID.randomUUID().toString().replace("-", ""),//id
				entpId,                               //entpId
				entpAccountTypeNormal,                //entpType
				new Date(),                           //createtime
				userId,                               //createuser
				null,                     //updatetime
				null);                    //updateuser
		enterpriseApiService.insertDUcEntpTypeMap(dUcEntpTypeMap);
		logger.info("insertDUcEntpTypeMap complete..");
	}


	/**
	 * 同步审核通过数据
	 *
	 * @param id
	 */
	private void synchroAuditData(String id) {
		logger.info("synchroAuditData...");
		/**
		 * 1.1 取企业审核信息
		 */
		DUcEnterpriseAuditInfoExample dUcEnterpriseAuditInfoExample = new DUcEnterpriseAuditInfoExample();
		dUcEnterpriseAuditInfoExample.createCriteria().andAuditIdEqualTo(id);
		List<DUcEnterpriseAuditInfo> dUcEnterpriseAuditInfos = dUcEnterpriseAuditInfoMapper.selectByExample(dUcEnterpriseAuditInfoExample);
		if (null != dUcEnterpriseAuditInfos || 0 < dUcEnterpriseAuditInfos.size()) {
			DUcEnterpriseAuditInfo dUcEnterpriseAuditInfo = dUcEnterpriseAuditInfos.get(0);
			/**
			 * 1.2 取企业信息
			 */
			DUcEnterprise dUcEnterprise = enterpriseApiService.findEnterprise(dUcEnterpriseAuditInfo.getEntpId());

			/**
			 * 1.3 合并企业信息
			 */
			dUcEnterprise.setFullname(dUcEnterpriseAuditInfo.getFullname());
			dUcEnterprise.setShortname(dUcEnterpriseAuditInfo.getShortname());
			dUcEnterprise.setFullnamePinyin(dUcEnterpriseAuditInfo.getFullnamePinyin());
			dUcEnterprise.setLpName(dUcEnterpriseAuditInfo.getLpName());
			dUcEnterprise.setIdentityType(dUcEnterpriseAuditInfo.getIdentityType());
			dUcEnterprise.setIdentityId(dUcEnterpriseAuditInfo.getIdentityId());
			dUcEnterprise.setIdentityUrl(dUcEnterpriseAuditInfo.getIdentityUrl());
			dUcEnterprise.setIdentityUrl(dUcEnterpriseAuditInfo.getIdentityUrl());
			dUcEnterprise.setOrgType(dUcEnterpriseAuditInfo.getOrgType());
			dUcEnterprise.setCompOrgnNum(dUcEnterpriseAuditInfo.getCompOrgnNum());
			dUcEnterprise.setCompProvince(dUcEnterpriseAuditInfo.getCompProvince());
			dUcEnterprise.setCompCity(dUcEnterpriseAuditInfo.getCompCity());
			dUcEnterprise.setCompDistrict(dUcEnterpriseAuditInfo.getCompDistrict());
			dUcEnterprise.setCompAddr(dUcEnterpriseAuditInfo.getCompAddr());
			dUcEnterprise.setBusinessLicenseUrl(dUcEnterpriseAuditInfo.getBusinessLicenseUrl());
			dUcEnterprise.setUpdatetime(new Date());
			dUcEnterprise.setUpdateuser(dUcEnterpriseAuditInfo.getCreateuser());
			enterpriseApiService.insert(dUcEnterprise);
		}

		/**
		 * 2.1 取交易商审核信息(若流程为新注册,不需要合并)
		 */
		DUcDealerAuditInfoExample dUcDealerAuditInfoExample = new DUcDealerAuditInfoExample();
		dUcDealerAuditInfoExample.createCriteria().andAuditIdEqualTo(id);
		List<DUcDealerAuditInfo> dUcDealerAuditInfos = dUcDealerAuditInfoMapper.selectByExample(dUcDealerAuditInfoExample);
		if (null != dUcDealerAuditInfos || 0 < dUcDealerAuditInfos.size()) {
			DUcDealerAuditInfo dUcDealerAuditInfo = dUcDealerAuditInfos.get(0);

			/**
			 * 2.2 取交易商信息
			 */
			DUcDealer dUcDealer = dealerApiService.selectByPrimaryKey(dUcDealerAuditInfo.getDealerId());

			/**
			 * 2.3 合并交易商信息
			 */
			dUcDealer.setFirmType(dUcDealerAuditInfo.getFirmType());
			dUcDealer.setAccountPaymentType(dUcDealerAuditInfo.getAccountPaymentType());
			dUcDealer.setMarketAgr(dUcDealerAuditInfo.getMarketAgr());
			dUcDealer.setFirmCode(dUcDealerAuditInfo.getFirmCode());
			dUcDealer.setFirmShortName(dUcDealerAuditInfo.getFirmShortName());
			dUcDealer.setJoinDate(dUcDealerAuditInfo.getJoinDate());
			dUcDealer.setVatInvoiceEntpType(dUcDealerAuditInfo.getVatInvoiceEntpType());
			dUcDealer.setQualFeeUrl(dUcDealerAuditInfo.getQualFeeUrl());
			dUcDealer.setCustomRegion(dUcDealerAuditInfo.getCustomRegion());
			dUcDealer.setUpdatetime(new Date());
			dUcDealer.setUpdateuser(dUcDealerAuditInfo.getCreateuser());

			dealerApiService.insert(dUcDealer);
		}
	}

	/**
	 * 办事处审核
	 *
	 * @param dUcEntpAudit
	 */
	private void agency(DUcEntpAudit dUcEntpAudit) {
		//通过,创建新节点,进入下一节点
		//驳回,流程结束
		if (UpmsConstant.AUDIT_STATUS_PASS == dUcEntpAudit.getAuditStatus()) {
			logger.info("通过,创建新节点,进入下一节点...");
			short auditStage = UpmsConstant.AUDIT_STAGE_SECOND;
			/**
			 * 创建新节点
			 */
			String newAuditId = createAuditNode(dUcEntpAudit.getWfId(), auditStage);
			/**
			 * 将新节点id赋给审核信息
			 */
			changeAuditNode(dUcEntpAudit.getId(), newAuditId);
		} else if (UpmsConstant.AUDIT_STATUS_REJECT == dUcEntpAudit.getAuditStatus()) {
			logger.info("驳回,流程结束...");
			DUcWf dUcWf = dUcWfMapper.selectByPrimaryKey(dUcEntpAudit.getWfId());
			dUcWf.setWfStatus(UpmsConstant.PROCESS_STATUS_END);//流程结束状态
			dUcWfMapper.insert(dUcWf);
			logger.info("merkleService	==>	save...");
			merkleService.save(new ArrayList<Merkle>() {{
				add(new Merkle(dUcWf.getId(), new InsObj(DUcWf.class.getName(), JSON.toJSONString(dUcWf))));
			}});
			logger.info("merkleService	==>	complete");
		}
	}

	@Override
	public BaseResult getPendingJobs(Map<String, Object> conditions) {
		logger.info("WFApiServiceImpl	==>	getPendingJobs");
		logger.info("params	==>	conditions:" + JSON.toJSONString(conditions));
		/**
		 * 1. 获取企业账户类型
		 * ps:企业账户类型可为多种,暂时只显示种,
		 * 		若只是普通企业,只显示普通企业类型
		 * 		若为多种,显示任意一个非普通企业的类型
		 * 2. 取客户服务区
		 * 3. 取来源
		 * 4. 企业信息
		 */
		Map<String, Object> rtn = new HashMap<>();
		try {
			PageHelper.startPage(Integer.valueOf(conditions.get("pageNo").toString()), Integer.valueOf(conditions.get("pageSize").toString()));
			List<Map<String, Object>> data = commonMapper.getPendingJobs(conditions);
			rtn.put("rowCount", ((Page) data).getTotal());
			rtn.put("data", data);
		} catch (Exception e) {
			e.printStackTrace();
			BaseResult baseResult = new BaseResult(ResultConstant.FAILED, e.getMessage());
			return baseResult;
		}

		BaseResult baseResult = new BaseResult(ResultConstant.SUCCESS, rtn);
		return baseResult;
	}

	/**
	 * 审核批量通过
	 *
	 * @param auditIds 参数为审核id list
	 * @return
	 */
	@Override
	public BaseResult auditBatch(List<String> auditIds, short auditStatus) {
		logger.info("WFApiServiceImpl	==>	auditBatch");
		logger.info("params	==>	auditIds:" + JSON.toJSONString(auditIds));
		logger.info("params	==>	auditStatus:" + auditStatus);
		try {
			for (String auditId : auditIds) {
				Map<String, Object> auditInfo = new HashMap<String, Object>() {
					{
						put("id", auditId);
						put("auditStatus", auditStatus);
//						put("auditMemo", "审批意见");//给默认值
//					put("auditMan","审核人");//审核人
					}
				};
				audit(auditInfo);
			}
		} catch (Exception e) {
			e.printStackTrace();
			BaseResult baseResult = new BaseResult(ResultConstant.FAILED, e.getMessage());
			return baseResult;
		}

		return new BaseResult(ResultConstant.SUCCESS);
	}

	/**
	 * 通过审批节点ID查询企业审核信息
	 *
	 * @param auditId 审批节点ID
	 * @return
	 */
	@Override
	public BaseResult findAuditInfo(String auditId) {
		logger.info("WFApiServiceImpl	==>	findAuditInfo");
		logger.info("params	==>	auditId:" + auditId);
		Map<String, Object> rtn = new HashMap<>();
		try {
			String entpId = "";
			/**
			 * 1. 查企业审核信息
			 */
			DUcEnterpriseAuditInfoExample dUcEnterpriseAuditInfoExample = new DUcEnterpriseAuditInfoExample();
			dUcEnterpriseAuditInfoExample.createCriteria().andAuditIdEqualTo(auditId);
			List<DUcEnterpriseAuditInfo> dUcEnterpriseAuditInfos = dUcEnterpriseAuditInfoMapper.selectByExample(dUcEnterpriseAuditInfoExample);
			if (null != dUcEnterpriseAuditInfos && 0 < dUcEnterpriseAuditInfos.size()) {
				rtn.put("dUcEnterpriseAuditInfo", dUcEnterpriseAuditInfos.get(0));
				entpId = dUcEnterpriseAuditInfos.get(0).getEntpId();
			}
			/**
			 * 2. 查交易商审核信息
			 */
			DUcDealerAuditInfoExample dUcDealerAuditInfoExample = new DUcDealerAuditInfoExample();
			dUcDealerAuditInfoExample.createCriteria().andAuditIdEqualTo(auditId);
			List<DUcDealerAuditInfo> dUcDealerAuditInfos = dUcDealerAuditInfoMapper.selectByExample(dUcDealerAuditInfoExample);
			if (null != dUcDealerAuditInfos && 0 < dUcDealerAuditInfos.size()) {
				rtn.put("dUcDealerAuditInfo", dUcDealerAuditInfos.get(0));
				entpId = dUcDealerAuditInfos.get(0).getDealerId();
			}
			/**
			 * 3. 查联系人信息
			 */
			Map<String, Object> conditions = new HashMap<>();
			conditions.put("entpId", entpId);
			conditions.put("entpPersonType", (short) 1);
			List<Map<String, Object>> contacts = commonMapper.getContacts(conditions);
			if (null != contacts)
				rtn.put("contacts", contacts);

		} catch (Exception e) {
			e.printStackTrace();
			BaseResult baseResult = new BaseResult(ResultConstant.FAILED, e.getMessage());
			return baseResult;
		}
		return new BaseResult(ResultConstant.SUCCESS, rtn);
	}

	/**
	 * 获取对应审批状态的数据
	 *
	 * @return
	 */
	@Override
	public BaseResult getInfoByAuditStatus(Map<String, Object> conditions) {
		logger.info("WFApiServiceImpl	==>	getInfoByAuditStatus");
		logger.info("params	==>	conditions:" + JSON.toJSONString(conditions));
		Map<String, Object> rtn = new HashMap<>();

		try {
			PageHelper.startPage(Integer.valueOf(conditions.get("pageNo").toString()), Integer.valueOf(conditions.get("pageSize").toString()));
			List<Map<String, Object>> data = commonMapper.getInfoByAuditStatus(conditions);
			rtn.put("rowCount", ((Page) data).getTotal());
			rtn.put("data", data);
		} catch (Exception e) {
			e.printStackTrace();
			BaseResult baseResult = new BaseResult(ResultConstant.FAILED, e.getMessage());
			return baseResult;
		}
		return new BaseResult(ResultConstant.SUCCESS, rtn);
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
			dUcEnterpriseAuditInfoMapper.updateByPrimaryKey(dUcEnterpriseAuditInfo);
			logger.info("merkleService	==>	save...");
			merkleService.save(new ArrayList<Merkle>() {{
				add(new Merkle(dUcEnterpriseAuditInfo.getId(), new InsObj(DUcEnterpriseAuditInfo.class.getName(), JSON.toJSONString(dUcEnterpriseAuditInfo))));
			}});
			logger.info("merkleService	==>	complete");
		}
		// 交易商
		if (null != auditInfos.get("dealer")) {
			logger.info("更新交易商节点id");
			DUcDealerAuditInfo dUcDealerAuditInfo = (DUcDealerAuditInfo) auditInfos.get("dealer");
			dUcDealerAuditInfo.setAuditId(newId);
			dUcDealerAuditInfoMapper.updateByPrimaryKey(dUcDealerAuditInfo);
			logger.info("merkleService	==>	save...");
			merkleService.save(new ArrayList<Merkle>() {{
				add(new Merkle(dUcDealerAuditInfo.getId(), new InsObj(DUcDealerAuditInfo.class.getName(), JSON.toJSONString(dUcDealerAuditInfo))));
			}});
			logger.info("merkleService	==>	complete");
		}
		return 1;
	}

	/**
	 * 创建审核流程
	 *
	 * @return 返回流程id
	 */
	private String createWF(short changeType, short auditSrc) {
		String wfId = UUID.randomUUID().toString().replace("-", "");
		logger.info("生成流程ID:" + wfId);
		DUcWf dUcWf = new DUcWf();
		dUcWf.setId(wfId);
		dUcWf.setChangeType(changeType);
		dUcWf.setAuditSrc(auditSrc);
		dUcWf.setWfStatus(UpmsConstant.PROCESS_STATUS_ACTIVE);//流程状态为进行中
		dUcWf.setCreatetime(new Date());
		int wfRtn = dUcWfMapper.insert(dUcWf);
		logger.info("merkleService	==>	save...");
		merkleService.save(new ArrayList<Merkle>() {{
			add(new Merkle(dUcWf.getId(), new InsObj(DUcWf.class.getName(), JSON.toJSONString(dUcWf))));
		}});
		logger.info("merkleService	==>	complete");
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
		logger.info("merkleService	==>	save...");
		merkleService.save(new ArrayList<Merkle>() {{
			add(new Merkle(dUcEntpAudit.getId(), new InsObj(DUcEntpAudit.class.getName(), JSON.toJSONString(dUcEntpAudit))));
		}});
		logger.info("merkleService	==>	complete");
		logger.info("审核节点创建结果:" + (1 == auditRtn ? "成功" : "失败"));
		return auditId;
	}

	/**
	 * 生成并保存企业审核信息
	 *
	 * @param dUcEnterprise
	 * @return
	 */
	private int generateDUcEnterpriseAuditInfo(short type, String auditId, DUcEnterprise dUcEnterprise, short auditSrc) {
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
		dUcEnterpriseAuditInfo.setIdentityType(dUcEnterprise.getIdentityType());
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
		if (UpmsConstant.AUDIT_SRC_REGISTER != auditSrc) {
			DUcEnterprise current = enterpriseApiService.findEnterprise(dUcEnterprise.getId());

			if (null != current) {
				/**
				 * 3. 设置当前在用企业信息字段值
				 */
				dUcEnterpriseAuditInfo.setFullnameOld(current.getFullname());
				dUcEnterpriseAuditInfo.setShortnameOld(current.getShortname());
				dUcEnterpriseAuditInfo.setFullnamePinyinOld(current.getFullnamePinyin());
				dUcEnterpriseAuditInfo.setLpNameOld(current.getLpName());
				dUcEnterpriseAuditInfo.setIdentityTypeOld(current.getIdentityType());
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
		}
		/**
		 * 4. 保存
		 */
		int entpInfoRtn = dUcEnterpriseAuditInfoMapper.insert(dUcEnterpriseAuditInfo);
		logger.info("merkleService	==>	save...");
		merkleService.save(new ArrayList<Merkle>() {{
			add(new Merkle(dUcEnterpriseAuditInfo.getId(), new InsObj(DUcEntpTypeMapExample.class.getName(), JSON.toJSONString(dUcEnterpriseAuditInfo))));
		}});
		logger.info("merkleService	==>	complete");
		logger.info("企业审核信息创建结果:" + (1 == entpInfoRtn ? "成功" : "失败"));
		return entpInfoRtn;
	}

	/**
	 * 生成交易商审核信息
	 *
	 * @param dUcDealer
	 * @return
	 */
	private int generateDUcDealerAuditInfo(String auditId, DUcDealer dUcDealer, short auditSrc) {
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
		dUcDealerAuditInfo.setAccountPaymentType(dUcDealer.getAccountPaymentType());

		// 多种类类型暂不考虑,就按一种类型来
		short oldType;

		DUcEntpTypeMapExample dUcEntpTypeMapExample = new DUcEntpTypeMapExample();
		dUcEntpTypeMapExample.createCriteria().andEntpIdEqualTo(dUcDealer.getId());
		List<DUcEntpTypeMap> dUcEntpTypeMaps = dUcEntpTypeMapMapper.selectByExample(dUcEntpTypeMapExample);
		if (null == dUcEntpTypeMaps || 0 == dUcEntpTypeMaps.size()) {
			oldType = UpmsConstant.USER_TYPE_TEL;//企业账户类型不存在,即为手机用户
		} else {
			oldType = dUcEntpTypeMaps.get(0).getEntpType();
		}

		dUcDealerAuditInfo.setEntpType(oldType);
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
		if (UpmsConstant.AUDIT_SRC_REGISTER != auditSrc) {
			DUcDealer current = dealerApiService.selectByPrimaryKey(dUcDealer.getId());

			if (null != current) {
				/**
				 * 3. 设置当前在用企业信息字段值
				 */
				dUcDealerAuditInfo.setFirmTypeOld(current.getFirmType());
				dUcDealerAuditInfo.setAccountPaymentTypeOld(current.getAccountPaymentType());
				dUcDealerAuditInfo.setEntpTypeOld(current.getFirmType());
				dUcDealerAuditInfo.setMarketAgrOld(current.getMarketAgr());
				dUcDealerAuditInfo.setFirmCodeOld(current.getFirmCode());
				dUcDealerAuditInfo.setFirmShortNameOld(current.getFirmShortName());
				dUcDealerAuditInfo.setJoinDateOld(current.getJoinDate());
				dUcDealerAuditInfo.setVatInvoiceEntpTypeOld(current.getVatInvoiceEntpType());
				dUcDealerAuditInfo.setQualFeeUrlOld(current.getQualFeeUrl());
				dUcDealerAuditInfo.setCustomRegionOld(current.getCustomRegion());
			}
		}
		/**
		 * 4. 保存
		 */
		int dealerInfoRtn = dUcDealerAuditInfoMapper.insert(dUcDealerAuditInfo);
		logger.info("merkleService	==>	save...");
		merkleService.save(new ArrayList<Merkle>() {{
			add(new Merkle(dUcDealerAuditInfo.getId(), new InsObj(DUcDealerAuditInfo.class.getName(), JSON.toJSONString(dUcDealerAuditInfo))));
		}});
		logger.info("merkleService	==>	complete");
		logger.info("交易商审核信息创建结果:" + (1 == dealerInfoRtn ? "成功" : "失败"));

		return dealerInfoRtn;
	}
}

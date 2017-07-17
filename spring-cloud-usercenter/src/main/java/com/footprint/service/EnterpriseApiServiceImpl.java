package com.footprint.service;

import com.alibaba.fastjson.JSON;
import com.footprint.api.DealerApiService;
import com.footprint.api.EnterpriseApiService;
import com.footprint.api.PersonApiService;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * Created by gaofang on 2017/6/21.
 * <p>
 * try catch 异常处理后期处理
 *
 * @author gaofang
 *         <p>
 *         企业服务实现
 */
@Service
@Transactional
public class EnterpriseApiServiceImpl implements EnterpriseApiService {

	private static Logger logger = LoggerFactory.getLogger(EnterpriseApiServiceImpl.class);

	@Autowired
	DUcEnterpriseMapper dUcEnterpriseMapper;//企业
	@Autowired
	DealerApiService dealerApiService;
	@Autowired
	DUcTextileEntpMapper dUcTextileEntpMapper;//服装企业
	@Autowired
	DUcEntpTypeMapMapper dUcEntpTypeMapMapper;//企业类型
	@Autowired
	DUcOrgBankAccountMapper dUcOrgBankAccountMapper;//组织银行账户
	@Autowired
	MerkleService merkleService;
	@Autowired
	MerkleRepository merkleRepository;
	@Autowired
	DUcOrgMapper dUcOrgMapper;
	@Autowired
	CommonMapper commonMapper;
	@Autowired
	DUcDealerAuditInfoMapper dUcDealerAuditInfoMapper;
	@Autowired
	DUcEnterpriseAuditInfoMapper dUcEnterpriseAuditInfoMapper;
	@Autowired
	PersonApiService personApiService;
	@Autowired
	WFApiService wfApiService;

	@Override
	public BaseResult insert(DUcEnterprise dUcEnterprise) {
		logger.info("EnterpriseApiServiceImpl	==>	insertEnterprise");
		logger.info("params	==>	dUcEnterprise:" + JSON.toJSONString(dUcEnterprise));


		try {
			logger.info("insertEnterprise	==>	insert...");
			dUcEnterpriseMapper.insert(dUcEnterprise);

			/**
			 * @企业信息多张表存在相同id的情况,需要在merkle结构中id加后缀
			 */
			logger.info("merkleService	==>	persistentMerkle...");
			merkleService.persistentMerkle(new ArrayList<Merkle>() {{
				add(new Merkle(dUcEnterprise.getId() + "_entp", new InsObj(DUcEnterprise.class.getName(), dUcEnterprise.getId(), JSON.toJSONString(dUcEnterprise))));
			}});
			logger.info("merkleService	==>	complete");

		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}
		return new BaseResult(ResultConstant.SUCCESS);
	}

	/**
	 * 添加企业信息
	 * <p>
	 *
	 * @param dUcEntpTypeMap
	 * @return
	 */
	@Override
	public BaseResult insertDUcEntpTypeMap(DUcEntpTypeMap dUcEntpTypeMap) {
		logger.info("EnterpriseApiServiceImpl	==>	insertDUcEntpTypeMap");
		logger.info("params	==>	dUcEntpTypeMap:" + JSON.toJSONString(dUcEntpTypeMap));
		try {
			dUcEntpTypeMapMapper.insert(dUcEntpTypeMap);

			// redis es 操作
			logger.info("merkleService	==>	save...");
			merkleService.save(new ArrayList<Merkle>() {{
				add(new Merkle(dUcEntpTypeMap.getId(), new InsObj(DUcEntpTypeMap.class.getName(), JSON.toJSONString(dUcEntpTypeMap))));
			}});
			logger.info("merkleService	==>	complete");
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}
		return new BaseResult(ResultConstant.SUCCESS);
	}

	/**
	 * 添加组织银行账户
	 * <p>
	 *
	 * @param dUcOrgBankAccount
	 * @return
	 */
	@Override
	public BaseResult insertDUcOrgBankAccount(DUcOrgBankAccount dUcOrgBankAccount) {
		logger.info("EnterpriseApiServiceImpl	==>	insertDUcOrgBankAccount");
		logger.info("params	==>	dUcOrgBankAccount:" + JSON.toJSONString(dUcOrgBankAccount));
		try {
			dUcOrgBankAccountMapper.insert(dUcOrgBankAccount);
			// redis es 操作
			logger.info("merkleService	==>	save...");
			merkleService.save(new ArrayList<Merkle>() {{
				add(new Merkle(dUcOrgBankAccount.getId(), new InsObj(DUcOrgBankAccount.class.getName(), JSON.toJSONString(dUcOrgBankAccount))));
			}});
			logger.info("merkleService	==>	complete");
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}
		return new BaseResult(ResultConstant.SUCCESS);
	}

	/**
	 * 添加组织
	 * <p>
	 *
	 * @param dUcOrg
	 * @return
	 */
	@Override
	public BaseResult insertDUcOrg(DUcOrg dUcOrg) {
		logger.info("EnterpriseApiServiceImpl	==>	insertDUcOrg");
		logger.info("params	==>	dUcOrg:" + JSON.toJSONString(dUcOrg));
		try {
			dUcOrgMapper.insert(dUcOrg);
			// redis es 操作
			logger.info("merkleService	==>	save...");
			merkleService.save(new ArrayList<Merkle>() {{
				add(new Merkle(dUcOrg.getId() + "_org", new InsObj(DUcOrg.class.getName(), dUcOrg.getId(), JSON.toJSONString(dUcOrg))));
			}});
			logger.info("merkleService	==>	complete");
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}
		return new BaseResult(ResultConstant.SUCCESS);
	}

	@Override
	public BaseResult update(DUcEnterprise dUcEnterprise) {
		logger.info("EnterpriseApiServiceImpl	==>	updateEnterprise");
		logger.info("params	==>	dUcEnterprise:" + JSON.toJSONString(dUcEnterprise));
		try {
			dUcEnterpriseMapper.updateByPrimaryKey(dUcEnterprise);

			/**
			 * @企业信息多张表存在相同id的情况,需要在merkle结构中id加后缀
			 */
			logger.info("merkleService	==>	persistentMerkle...");
			merkleService.persistentMerkle(new ArrayList<Merkle>() {{
				add(new Merkle(dUcEnterprise.getId() + "_entp", new InsObj(DUcEnterprise.class.getName(), dUcEnterprise.getId(), JSON.toJSONString(dUcEnterprise))));
			}});
			logger.info("merkleService	==>	complete");
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}
		return new BaseResult(ResultConstant.SUCCESS);
	}

	@Override
	public int deleteEnterprise(String id) {
		logger.info("EnterpriseApiServiceImpl	==>	deleteEnterprise");
		logger.info("params	==>	id:" + id);
		return dUcEnterpriseMapper.deleteByPrimaryKey(id);
	}

	@Override
	public DUcEnterprise findEnterprise(String id) {
		logger.info("EnterpriseApiServiceImpl	==>	findEnterprise");
		logger.info("params	==>	id:" + id);
		Merkle merkle = merkleRepository.findOne(id + "_entp");
		InsObj insObj = (InsObj) merkle.getValue();
		DUcEnterprise dUcEnterprise = JSON.toJavaObject(JSON.parseObject(insObj.getJson()), DUcEnterprise.class);
		return dUcEnterprise;
	}

	@Override
	public List<DUcEnterprise> findAllEnterprise() {
		logger.info("EnterpriseApiServiceImpl	==>	findEnterprise");
		DUcEnterpriseExample dUcEnterpriseExample = new DUcEnterpriseExample();
		//获取所有状态的企业
		dUcEnterpriseExample
				.createCriteria().
				andEntpStatusIn(
						Arrays.asList(
								UpmsConstant.ENPT_STATUS_NORMAL,
								UpmsConstant.ENPT_STATUS_PAUSE,
								UpmsConstant.ENPT_STATUS_FORBID,
								UpmsConstant.ENPT_STATUS_DELIST
						)
				);
		return dUcEnterpriseMapper.selectByExample(dUcEnterpriseExample);
	}

	@Override
	public List<DUcOrgBankAccount> findOrgBankAccount(String orgId) {
		logger.info("EnterpriseApiServiceImpl	==>	findOrgBankAccount");
		logger.info("params	==>	orgId:" + orgId);
		DUcOrgBankAccountExample dUcOrgBankAccountExample = new DUcOrgBankAccountExample();
		dUcOrgBankAccountExample.createCriteria().andOrgIdEqualTo(orgId);
		return dUcOrgBankAccountMapper.selectByExample(dUcOrgBankAccountExample);
	}

	@Override
	public DUcTextileEntp findTextileEntp(String id) {
		logger.info("EnterpriseApiServiceImpl	==>	findTextileEntp");
		logger.info("params	==>	id:" + id);
		Merkle merkle = merkleRepository.findOne(id + "_textile");
		InsObj insObj = (InsObj) merkle.getValue();
		DUcTextileEntp dUcTextileEntp = JSON.toJavaObject(JSON.parseObject(insObj.getJson()), DUcTextileEntp.class);
		return dUcTextileEntp;
	}

	@Override
	public List<DUcEntpTypeMap> findEntpType(String id) {
		logger.info("EnterpriseApiServiceImpl	==>	findEntpType");
		logger.info("params	==>	id:" + id);
		DUcEntpTypeMapExample dUcEntpTypeMapExample = new DUcEntpTypeMapExample();
		dUcEntpTypeMapExample.createCriteria().andEntpIdEqualTo(id);
		return dUcEntpTypeMapMapper.selectByExample(dUcEntpTypeMapExample);
	}

	@Override
	public BaseResult findEntpRal(String id) {
		logger.info("EnterpriseApiServiceImpl	==>	findEntpRal");
		logger.info("params	==>	id:" + id);
		Map<String, Object> rtn = new HashMap<>();
		try {
			/**
			 * 1. 获取企业相关信息
			 * 企业/交易商/组织/服装企业(id相同的表数据)
			 */
			List<Merkle> merkles = merkleService.findByPId(id);

			for (Merkle merkle : merkles) {
				InsObj insObj = (InsObj) merkle.getValue();
				//企业信息
				if (DUcEnterprise.class.getName().equals(insObj.getType())) {
					logger.info("findEntpRal	==>	dUcEnterprise...");
					DUcEnterprise dUcEnterprise = JSON.toJavaObject(JSON.parseObject(insObj.getJson()), DUcEnterprise.class);
					rtn.put("entp", dUcEnterprise);
				}
				//交易商信息
				else if (DUcDealer.class.getName().equals(insObj.getType())) {
					logger.info("findEntpRal	==>	dUcDealer...");
					DUcDealer dUcDealer = JSON.toJavaObject(JSON.parseObject(insObj.getJson()), DUcDealer.class);
					rtn.put("dealer", dUcDealer);
				}
				//服装企业
				else if (DUcTextileEntp.class.getName().equals(insObj.getType())) {
					logger.info("findEntpRal	==>	dUcTextileEntp...");
					DUcTextileEntp dUcTextileEntp = JSON.toJavaObject(JSON.parseObject(insObj.getJson()), DUcTextileEntp.class);
					rtn.put("textile", dUcTextileEntp);
				}
			}

			/**
			 * 2. 获取企业类型
			 */
			logger.info("findEntpRal	==>	findEntpType...");
			rtn.put("entpType", findEntpType(id));

			/**
			 * 3. 获取企业账户
			 */
			logger.info("findEntpRal	==>	findOrgBankAccount...");
			rtn.put("bankAccount", findOrgBankAccount(id));

			/**
			 * 4. 获取联系人信息
			 */
			Map<String, Object> conditions = new HashMap<>();
			conditions.put("entpId", id);
			List<Map<String, Object>> contacts = commonMapper.getContacts(conditions);
			if (null != contacts)
				rtn.put("contacts", contacts);

		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}
		return new BaseResult(ResultConstant.SUCCESS, rtn);
	}

	@Override
	public BaseResult findEntpRal4Maintenance(String id) {
		logger.info("EnterpriseApiServiceImpl	==>	findEntpRal4Maintenance");
		logger.info("params	==>	id:" + id);

		/**
		 * 1. 取当前在用的企业信息
		 */
		logger.info("取当前在用的企业信息");
		BaseResult baseResult = findEntpRal(id);
		try {
			//当前在用的企业信息
			Map<String, Object> entpRal = (Map<String, Object>) baseResult.getData();

			/**
			 * 2. 判断当前企业信息审核情况
			 */
			logger.info("判断当前企业信息审核情况");
			List<Map<String, Object>> auditStatus = commonMapper.getAuditStatus(id);
			if (null == auditStatus) {
				return new BaseResult(ResultConstant.FAILED, "企业审核信息不存在,企业信息异常");
			} else {
				Map<String, Object> currnentInfo = auditStatus.get(0);
				/**
				 * 2.1 获取企业最新一条审批状态
				 */
				short status = Short.valueOf(currnentInfo.get("AUDIT_STATUS").toString());
				entpRal.put("auditStatus", status);
				/**
				 * 2.2 为通过,直接返回当前在用企业信息
				 */
				if (UpmsConstant.AUDIT_STATUS_PASS == status) {
					logger.info("通过状态,直接返回数据");
					return baseResult;
				}
				/**
				 * 2.3 若为其他状态,则需要查询审核表中数据进行合并
				 */
				logger.info("非通过状态,需要合并数据");

				// 1. 取 D_UC_ENTERPRISE_AUDIT_INFO id
				String entpInfoId = currnentInfo.get("ENTP_INFO_ID").toString();
				DUcEnterprise dUcEnterprise = (DUcEnterprise) entpRal.get("entp");
				// 2. 合并数据
				unionEntpInfo(entpInfoId, dUcEnterprise);
				entpRal.put("entp", dUcEnterprise);


				// 3. 取 D_UC_DEALER_AUDIT_INFO id
				String dealerInfoId="";
				if(null!=currnentInfo.get("DEALER_INFO_ID")){
					dealerInfoId = currnentInfo.get("DEALER_INFO_ID").toString();
				}
				DUcDealer dUcDealer = (DUcDealer) entpRal.get("dealer");
				// 4. 合并数据
				unionDealerInfo(dealerInfoId, dUcDealer);
				entpRal.put("dealer", dUcDealer);

				baseResult.setData(entpRal);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}
		return baseResult;
	}

	/**
	 * 合并交易商在用信息和审核信息<br>
	 * 用于用户查询
	 *
	 * @param dealerInfoId
	 * @param dUcDealer
	 * @return
	 */
	private void unionDealerInfo(String dealerInfoId, DUcDealer dUcDealer) {
		logger.info("unionDealerInfo...");
		if (null != dealerInfoId) {
			/**
			 * 1. 获取审核数据
			 */
			logger.info("获取交易商审核数据...");
			Merkle merkle = merkleRepository.findOne(dealerInfoId);
			if (null == merkle)
				return;
			InsObj insObj = (InsObj) merkle.getValue();
			DUcDealerAuditInfo dUcDealerAuditInfo = JSON.toJavaObject(JSON.parseObject(insObj.getJson()), DUcDealerAuditInfo.class);

			/**
			 * 2. 合并
			 */
			logger.info("合并交易商数据...");
			dUcDealer.setFirmType(dUcDealerAuditInfo.getFirmType());
			dUcDealer.setAccountPaymentType(dUcDealerAuditInfo.getAccountPaymentType());
			dUcDealer.setMarketAgr(dUcDealerAuditInfo.getMarketAgr());
			dUcDealer.setFirmCode(dUcDealerAuditInfo.getFirmCode());
			dUcDealer.setFirmShortName(dUcDealerAuditInfo.getFirmShortName());
			dUcDealer.setJoinDate(dUcDealerAuditInfo.getJoinDate());
			dUcDealer.setVatInvoiceEntpType(dUcDealerAuditInfo.getVatInvoiceEntpType());
			dUcDealer.setQualFeeUrl(dUcDealerAuditInfo.getQualFeeUrl());
			dUcDealer.setCustomRegion(dUcDealerAuditInfo.getCustomRegion());
			logger.info("合并交易商数据 完成...");
		}
	}

	/**
	 * 合并企业在用信息和审核信息<br>
	 * 用于用户查询
	 *
	 * @param entpInfoId
	 * @param dUcEnterprise
	 * @return
	 */
	private void unionEntpInfo(String entpInfoId, DUcEnterprise dUcEnterprise) {
		logger.info("unionEntpInfo...");
		if (null != entpInfoId) {
			/**
			 * 1. 获取审核数据
			 */
			logger.info("获取企业审核数据...");
			Merkle merkle = merkleRepository.findOne(entpInfoId);
			if (null == merkle)
				return;
			InsObj insObj = (InsObj) merkle.getValue();
			DUcEnterpriseAuditInfo dUcEnterpriseAuditInfo = JSON.toJavaObject(JSON.parseObject(insObj.getJson()), DUcEnterpriseAuditInfo.class);

			/**
			 * 2. 合并
			 */
			logger.info("合并企业数据...");
			dUcEnterprise.setFullname(dUcEnterpriseAuditInfo.getFullname());
			dUcEnterprise.setShortname(dUcEnterpriseAuditInfo.getShortname());
			dUcEnterprise.setFullnamePinyin(dUcEnterpriseAuditInfo.getFullnamePinyin());
			dUcEnterprise.setLpName(dUcEnterpriseAuditInfo.getLpName());
			dUcEnterprise.setIdentityType(dUcEnterpriseAuditInfo.getIdentityType());
			dUcEnterprise.setIdentityId(dUcEnterpriseAuditInfo.getIdentityId());
			dUcEnterprise.setIdentityUrl(dUcEnterpriseAuditInfo.getIdentityUrl());
			dUcEnterprise.setOrgType(dUcEnterpriseAuditInfo.getOrgType());
			dUcEnterprise.setCompOrgnNum(dUcEnterpriseAuditInfo.getCompOrgnNum());
			dUcEnterprise.setCompProvince(dUcEnterpriseAuditInfo.getCompProvince());
			dUcEnterprise.setCompCity(dUcEnterpriseAuditInfo.getCompCity());
			dUcEnterprise.setCompDistrict(dUcEnterpriseAuditInfo.getCompDistrict());
			dUcEnterprise.setCompAddr(dUcEnterpriseAuditInfo.getCompAddr());
			dUcEnterprise.setBusinessLicenseUrl(dUcEnterpriseAuditInfo.getBusinessLicenseUrl());
			logger.info("合并企业数据 完成...");
		}
	}

	@Override
	public Map<String, Object> updateEntpRal(String id, Map<String, Object> map) {
		logger.info("EnterpriseApiServiceImpl	==>	updateEntpRal");
		logger.info("params	==>	id:" + id);
		logger.info("params	==>	map:" + JSON.toJSONString(map));
		logger.info("updateEntpRal	==>	新增/更新企业缓存中关联信息 开始...");
		/**
		 * 1. 获取关联数据
		 */
		BaseResult baseResult = findEntpRal(id);
		Map<String, Object> currentCache = (Map<String, Object>) baseResult.getData();
		/**
		 * 2. 更新数据
		 */
		for (String key : map.keySet()) {
			currentCache.put(key, map.get(key));
		}
//		updateEntpRal(id, currentCache);
		logger.info("updateEntpRal	==>	新增/更新企业缓存中关联信息 结束...");
		return map;
	}

	@Override
	public BaseResult checkOrgnNumUsable(String orgnNum) {
		logger.info("EnterpriseApiServiceImpl	==>	checkOrgnNumExists");
		logger.info("params	==>	orgnNum:" + orgnNum);
		try {
			DUcEnterpriseExample dUcEnterpriseExample = new DUcEnterpriseExample();
			dUcEnterpriseExample.createCriteria().andCompOrgnNumEqualTo(orgnNum);
			int rtn = (int) dUcEnterpriseMapper.countByExample(dUcEnterpriseExample);
			/**
			 * 查询结果数量不为0,不可用
			 */
			if (0 != rtn)
				return new BaseResult(ResultConstant.SUCCESS, false);
			return new BaseResult(ResultConstant.SUCCESS, true);
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}
	}

	/**
	 * 企业信息维护
	 *
	 * @param entpInfo
	 * @return
	 */
	@Override
	public BaseResult entpRal4Maintenance(Map<String, Object> entpInfo) {
		logger.info("EnterpriseApiServiceImpl	==>	entpRal4Maintenance");
		logger.info("params	==>	entpInfo:" + JSON.toJSONString(entpInfo));
		try {
			/**
			 * update entp
			 */
			DUcEnterprise dUcEnterprise = null;
			if (null != entpInfo.get("entp")) {
				Map<String, Object> entp = (Map<String, Object>) entpInfo.get("entp");
				dUcEnterprise = updateEntp(entp);
			}

			/**
			 * update dealer
			 */
			DUcDealer dUcDealer = null;
			if (null != entpInfo.get("dealer")) {
				Map<String, Object> dealer = (Map<String, Object>) entpInfo.get("dealer");
				dUcDealer = updateDealer(dealer);
			}

			/**
			 * update textile
			 */
//			if (null != entpInfo.get("textile")) {
//				Map<String, Object> textile = (Map<String, Object>) entpInfo.get("textile");
//			}

			/**
			 * update bankAccount
			 */
			if (null != entpInfo.get("bankAccount")) {
				List<Map<String, Object>> bankAccounts = (List<Map<String, Object>>) entpInfo.get("bankAccount");
				for (Map<String, Object> map : bankAccounts) {
					updateBankAccount(map);
				}
			}

			/**
			 * update contacts
			 */
			if (null != entpInfo.get("contacts")) {
				List<Map<String, Object>> contacts = (List<Map<String, Object>>) entpInfo.get("contacts");
				for (Map<String, Object> map : contacts) {
					updateContacts(map);
				}
			}

			/**
			 * 启动审核流程
			 */
			if (null != dUcEnterprise || null != dUcDealer)
				wfApiService.createAndStartWF(dUcEnterprise, dUcDealer,
						UpmsConstant.ACCOUNT_CHANGE_TYPE_DEALER2DEALER,
						UpmsConstant.AUDIT_SRC_CHANGES,
						UpmsConstant.AUDIT_STAGE_FIRST);
			if (null != dUcEnterprise)
				wfApiService.createAndStartWF(dUcEnterprise,
						UpmsConstant.ACCOUNT_CHANGE_TYPE_ENTP2ENTP,
						UpmsConstant.AUDIT_SRC_CHANGES,
						UpmsConstant.AUDIT_STAGE_SECOND);
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}
		return new BaseResult(ResultConstant.SUCCESS);
	}

	private void updateContacts(Map<String, Object> contact) {
		logger.info("updateContacts...");
		logger.info("获取联系人信息...");
		String id = contact.get("id").toString();//id
		DUcPerson dUcPerson = personApiService.selectByPrimaryKey(id);
		if (null != contact.get("name"))
			dUcPerson.setName(contact.get("name").toString());
		if (null != contact.get("mobile"))
			dUcPerson.setMobile(contact.get("mobile").toString());
		if (null != contact.get("tel"))
			dUcPerson.setTel(contact.get("tel").toString());
		if (null != contact.get("fax"))
			dUcPerson.setFax(contact.get("fax").toString());
		if (null != contact.get("mail"))
			dUcPerson.setMail(contact.get("mail").toString());
		dUcPerson.setUpdatetime(new Date());
//		dUcPerson.setUpdateuser(); todo
		personApiService.update(dUcPerson);
	}

	private void updateBankAccount(Map<String, Object> bankAccountInfo) {
		logger.info("updateBankAccount...");
		/**
		 * id为空新增,不为空更新
		 */
		if (null == bankAccountInfo.get("id")) {
			logger.info("添加银行账户...");
			DUcOrgBankAccount dUcOrgBankAccount = new DUcOrgBankAccount();
			dUcOrgBankAccount.setId(UUID.randomUUID().toString().replaceAll("-", ""));
			if (null != bankAccountInfo.get("bankType"))
				dUcOrgBankAccount.setBankType(Short.valueOf(bankAccountInfo.get("bankType").toString()));
			if (null != bankAccountInfo.get("bankName"))
				dUcOrgBankAccount.setBankName(bankAccountInfo.get("bankName").toString());
			if (null != bankAccountInfo.get("bankAccount"))
				dUcOrgBankAccount.setBankAccount(bankAccountInfo.get("bankAccount").toString());
			insertDUcOrgBankAccount(dUcOrgBankAccount);
		} else {
			logger.info("更新银行账户...");
			DUcOrgBankAccount dUcOrgBankAccount = dUcOrgBankAccountMapper.selectByPrimaryKey(bankAccountInfo.get("id").toString());
			if (null != bankAccountInfo.get("bankType"))
				dUcOrgBankAccount.setBankType(Short.valueOf(bankAccountInfo.get("bankType").toString()));
			if (null != bankAccountInfo.get("bankName"))
				dUcOrgBankAccount.setBankName(bankAccountInfo.get("bankName").toString());
			if (null != bankAccountInfo.get("bankAccount"))
				dUcOrgBankAccount.setBankAccount(bankAccountInfo.get("bankAccount").toString());
			dUcOrgBankAccount.setUpdatetime(new Date());
//			dUcOrgBankAccount.setUpdateuser(); todo
			dUcOrgBankAccountMapper.updateByPrimaryKey(dUcOrgBankAccount);
		}
	}

	/**
	 * 更新交易商数据
	 * 若存在审核字段,返回 DUcDealer 对象,否则返回null
	 *
	 * @param dealer
	 * @return
	 */
	private DUcDealer updateDealer(Map<String, Object> dealer) {
		logger.info("updateBankAccount...");
		logger.info("获取交易商数据...");
		String id = dealer.get("id").toString();//id
		DUcDealer dUcDealer = dealerApiService.selectByPrimaryKey(id);

		/**
		 * 设置不需要审核的字段值
		 */
		if (null != dealer.get("vatInvoicePr"))
			dUcDealer.setVatInvoicePr(dealer.get("vatInvoicePr").toString());//增值税票地址_省
		if (null != dealer.get("vatInvoiceCity"))
			dUcDealer.setVatInvoicePr(dealer.get("vatInvoiceCity").toString());
		if (null != dealer.get("vatInvoiceDist"))
			dUcDealer.setVatInvoiceDist(dealer.get("vatInvoiceDist").toString());
		if (null != dealer.get("vatInvoiceAddr"))
			dUcDealer.setVatInvoiceAddr(dealer.get("vatInvoiceAddr").toString());
		if (null != dealer.get("vatInvoiceTel"))
			dUcDealer.setVatInvoiceTel(dealer.get("vatInvoiceTel").toString());
		if (null != dealer.get("yearProcessing"))
			dUcDealer.setYearProcessing(Long.valueOf(dealer.get("yearProcessing").toString()));
		if (null != dealer.get("yearExpendQty"))
			dUcDealer.setYearExpendQty(Long.valueOf(dealer.get("yearExpendQty").toString()));
		if (null != dealer.get("haspQty"))
			dUcDealer.setHaspQty(Long.valueOf(dealer.get("haspQty").toString()));

		logger.info("保存不需要审核的字段...");
		dealerApiService.update(dUcDealer);

		/**
		 * 对需要审批的数据,创建审批流程
		 */
		if (null != dealer.get("firmType") || null != dealer.get("accountPaymentType") ||
				null != dealer.get("marketAgr") || null != dealer.get("joinDate") ||
				null != dealer.get("vatInvoiceEntpType") || null != dealer.get("customRegion") ||
				null != dealer.get("qualFeeUrl")) {

			if (null != dealer.get("firmType"))
				dUcDealer.setFirmType(Short.valueOf(dealer.get("firmType").toString()));
			if (null != dealer.get("accountPaymentType"))
				dUcDealer.setAccountPaymentType(Short.valueOf(dealer.get("accountPaymentType").toString()));
			if (null != dealer.get("marketAgr"))
				dUcDealer.setMarketAgr(Short.valueOf(dealer.get("marketAgr").toString()));
			if (null != dealer.get("joinDate"))
				dUcDealer.setJoinDate(new java.sql.Date((Long) dealer.get("joinDate")));
			if (null != dealer.get("vatInvoiceEntpType"))
				dUcDealer.setVatInvoiceEntpType(Short.valueOf(dealer.get("vatInvoiceEntpType").toString()));
			if (null != dealer.get("customRegion"))
				dUcDealer.setCustomRegion(Short.valueOf(dealer.get("customRegion").toString()));
			if (null != dealer.get("qualFeeUrl"))
				dUcDealer.setQualFeeUrl(dealer.get("qualFeeUrl").toString());
			return dUcDealer;
		}
		return null;
	}

	/**
	 * 更新企业数据
	 * 若存在审核字段,返回 DUcEnterprise 对象,否则返回null
	 *
	 * @param entp
	 * @return
	 */
	private DUcEnterprise updateEntp(Map<String, Object> entp) {
		logger.info("updateEntp...");
		logger.info("获取企业数据...");
		String id = entp.get("id").toString();//id
		DUcEnterprise dUcEnterprise = findEnterprise(id);

		/**
		 * 设置不需要审核的字段值
		 */
		if (null != entp.get("lpMbphone"))
			dUcEnterprise.setLpMbphone(entp.get("lpMbphone").toString());
		if (null != entp.get("lpTel"))
			dUcEnterprise.setLpTel(entp.get("lpTel").toString());
		if (null != entp.get("lpEmal"))
			dUcEnterprise.setLpEmal(entp.get("lpEmal").toString());
		if (null != entp.get("lpFax"))
			dUcEnterprise.setLpFax(entp.get("lpFax").toString());
		if (null != entp.get("fullnameEng"))
			dUcEnterprise.setFullnameEng(entp.get("fullnameEng").toString());
		if (null != entp.get("compRegfund"))
			dUcEnterprise.setCompRegfund(entp.get("compRegfund").toString());
		if (null != entp.get("compProvinceComm"))
			dUcEnterprise.setCompProvinceComm(entp.get("compProvinceComm").toString());
		if (null != entp.get("compCityComm"))
			dUcEnterprise.setCompCityComm(entp.get("compCityComm").toString());
		if (null != entp.get("compDistrictComm"))
			dUcEnterprise.setCompDistrictComm(entp.get("compDistrictComm").toString());
		if (null != entp.get("compAddrComm"))
			dUcEnterprise.setCompAddrComm(entp.get("compAddrComm").toString());
		if (null != entp.get("compAddrEng"))
			dUcEnterprise.setCompAddrEng(entp.get("compAddrEng").toString());
		if (null != entp.get("compPostcode"))
			dUcEnterprise.setCompPostcode(entp.get("compPostcode").toString());
		if (null != entp.get("compTel"))
			dUcEnterprise.setCompTel(entp.get("compTel").toString());
		if (null != entp.get("compFax"))
			dUcEnterprise.setCompFax(entp.get("compFax").toString());
		if (null != entp.get("entpLogoUrl"))
			dUcEnterprise.setEntpLogoUrl(entp.get("entpLogoUrl").toString());
		if (null != entp.get("maininCome"))
			dUcEnterprise.setMaininCome(entp.get("maininCome").toString());

		logger.info("保存不需要审核的字段...");
		update(dUcEnterprise);

		/**
		 * 对需要审批的数据,创建审批流程
		 */
		if (null != entp.get("fullname") || null != entp.get("shortname") ||
				null != entp.get("compOrgnNum") || null != entp.get("compProvince") ||
				null != entp.get("compCity") || null != entp.get("compDistrict") ||
				null != entp.get("compAddr") || null != entp.get("businessLicenseUrl") ||
				null != entp.get("lpName") || null != entp.get("identityType") ||
				null != entp.get("identityId") || null != entp.get("identityUrl")) {

			if (null != entp.get("fullname"))
				dUcEnterprise.setFullname(entp.get("fullname").toString());
			if (null != entp.get("shortname"))
				dUcEnterprise.setShortname(entp.get("shortname").toString());
			if (null != entp.get("compOrgnNum"))
				dUcEnterprise.setCompOrgnNum(entp.get("compOrgnNum").toString());
			if (null != entp.get("compProvince"))
				dUcEnterprise.setCompProvince(entp.get("compProvince").toString());
			if (null != entp.get("compCity"))
				dUcEnterprise.setCompCity(entp.get("compCity").toString());
			if (null != entp.get("compDistrict"))
				dUcEnterprise.setCompDistrict(entp.get("compDistrict").toString());
			if (null != entp.get("compAddr"))
				dUcEnterprise.setCompAddr(entp.get("compAddr").toString());
			if (null != entp.get("businessLicenseUrl"))
				dUcEnterprise.setBusinessLicenseUrl(entp.get("businessLicenseUrl").toString());
			if (null != entp.get("lpName"))
				dUcEnterprise.setLpName(entp.get("lpName").toString());
			if (null != entp.get("identityType"))
				dUcEnterprise.setIdentityType(Short.valueOf(entp.get("identityType").toString()));
			if (null != entp.get("identityId"))
				dUcEnterprise.setIdentityId(entp.get("identityId").toString());
			if (null != entp.get("identityUrl"))
				dUcEnterprise.setIdentityUrl(entp.get("identityUrl").toString());
			return dUcEnterprise;
		}
		return null;
	}

}

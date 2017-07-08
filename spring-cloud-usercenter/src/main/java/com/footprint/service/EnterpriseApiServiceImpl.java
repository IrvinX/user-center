package com.footprint.service;

import com.alibaba.fastjson.JSON;
import com.footprint.api.DealerApiService;
import com.footprint.api.EnterpriseApiService;
import com.footprint.common.constant.UpmsConstant;
import com.footprint.common.dao.DUcEnterpriseMapper;
import com.footprint.common.dao.DUcEntpTypeMapMapper;
import com.footprint.common.dao.DUcOrgBankAccountMapper;
import com.footprint.common.dao.DUcTextileEntpMapper;
import com.footprint.common.dto.BaseResult;
import com.footprint.common.dto.ResultConstant;
import com.footprint.common.merkletree.InsObj;
import com.footprint.common.merkletree.Merkle;
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

	@Override
	public BaseResult insertEnterprise(final DUcEnterprise dUcEnterprise) {
		logger.info("EnterpriseApiServiceImpl	==>	insertEnterprise");
		logger.info("params	==>	dUcEnterprise:" + JSON.toJSONString(dUcEnterprise));


		try {
			logger.info("insertEnterprise	==>	insert...");
			int result = dUcEnterpriseMapper.insert(dUcEnterprise);
			if (0 == result) {
				return null;
			}

			logger.info("merkleService	==>	save...");
			merkleService.save(new ArrayList<Merkle>() {{
				add(new Merkle(dUcEnterprise.getId(), new InsObj(DUcEnterprise.class.getName(), JSON.toJSONString(dUcEnterprise))));
			}});
			logger.info("merkleService	==>	complete");
		} catch (Exception e) {
			e.printStackTrace();
			BaseResult baseResult = new BaseResult(ResultConstant.FAILED, e.getMessage());
			return baseResult;
		}

		BaseResult baseResult = new BaseResult(ResultConstant.SUCCESS, dUcEnterprise);
		return baseResult;
	}

	@Override
	public DUcEnterprise updateEnterprise(DUcEnterprise dUcEnterprise) {
		logger.info("EnterpriseApiServiceImpl	==>	updateEnterprise");
		logger.info("params	==>	dUcEnterprise:" + JSON.toJSONString(dUcEnterprise));

		int result = dUcEnterpriseMapper.updateByPrimaryKey(dUcEnterprise);
		if (0 == result)
			return null;

		logger.info("merkleService	==>	persistentMerkle...");
		merkleService.persistentMerkle(new ArrayList<Merkle>() {{
			add(new Merkle(dUcEnterprise.getId(), new InsObj(DUcEnterprise.class.getName(), JSON.toJSONString(dUcEnterprise))));
		}});
		logger.info("merkleService	==>	complete");
		return dUcEnterprise;
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
		return dUcEnterpriseMapper.selectByPrimaryKey(id);
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
		return dUcTextileEntpMapper.selectByPrimaryKey(id);
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
	public Map<String, Object> findEntpRal(String id) {
		logger.info("EnterpriseApiServiceImpl	==>	findEntpRal");
		logger.info("params	==>	id:" + id);
		Map<String, Object> rtn = new HashMap<>();
		logger.info("findEntpRal	==>	findEnterprise...");
		rtn.put("entp", findEnterprise(id));
		logger.info("findEntpRal	==>	findEntpType...");
		rtn.put("entpType", findEntpType(id));
		logger.info("findEntpRal	==>	findTextileEntp...");
		rtn.put("textile", findTextileEntp(id));
		logger.info("findEntpRal	==>	findDealer...");
		rtn.put("dealer", dealerApiService.selectByPrimaryKey(id));
		logger.info("findEntpRal	==>	findOrgBankAccount...");
		rtn.put("bankAccount", findOrgBankAccount(id));
		return rtn;
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
		Map<String, Object> currentCache = findEntpRal(id);
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

	@Override
	public int insert(DUcEnterprise dUcEnterprise) {
		logger.info("EnterpriseApiServiceImpl	==>	insert");
		logger.info("params	==>	dUcEnterprise:" + JSON.toJSONString(dUcEnterprise));
		return dUcEnterpriseMapper.insert(dUcEnterprise);
	}
}

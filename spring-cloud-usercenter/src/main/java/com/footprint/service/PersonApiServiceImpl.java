package com.footprint.service;

import com.alibaba.fastjson.JSON;
import com.footprint.api.PersonApiService;
import com.footprint.common.dao.DUcOrgPersonMapper;
import com.footprint.common.dao.DUcPersonMapper;
import com.footprint.common.dto.BaseResult;
import com.footprint.common.dto.ResultConstant;
import com.footprint.common.merkletree.InsObj;
import com.footprint.common.merkletree.Merkle;
import com.footprint.common.merkletree.service.MerkleService;
import com.footprint.common.model.DUcOrgPerson;
import com.footprint.common.model.DUcPerson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

/**
 * Created by gaofang on 2017/6/20.
 * <p>
 * try catch 异常处理后期处理
 *
 * @author gaofang
 *         <p>
 *         人员服务
 */
@Service
@Transactional
public class PersonApiServiceImpl implements PersonApiService {

	private static Logger logger = LoggerFactory.getLogger(PersonApiServiceImpl.class);

	@Autowired
	DUcPersonMapper dUcPersonMapper;
	@Autowired
	MerkleService merkleService;
	@Autowired
	DUcOrgPersonMapper dUcOrgPersonMapper;

	@Override
	public BaseResult insert(DUcPerson dUcPerson) {
		logger.info("PersonApiServiceImpl	==>	insert");
		logger.info("params	==>	dUcPerson:" + JSON.toJSONString(dUcPerson));
		try {
			dUcPersonMapper.insert(dUcPerson);

			logger.info("merkleService	==>	save...");
			merkleService.save(new ArrayList<Merkle>() {{
				add(new Merkle(dUcPerson.getId(), new InsObj(DUcPerson.class.getName(), JSON.toJSONString(dUcPerson))));
			}});
			logger.info("merkleService	==>	complete");
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}
		return new BaseResult(ResultConstant.SUCCESS);
	}

	/**
	 * 更新人员
	 *
	 * @param dUcPerson
	 * @return
	 */
	@Override
	public BaseResult update(DUcPerson dUcPerson) {
		logger.info("PersonApiServiceImpl	==>	update");
		logger.info("params	==>	dUcPerson:" + JSON.toJSONString(dUcPerson));
		try {
			dUcPersonMapper.updateByPrimaryKey(dUcPerson);

			logger.info("merkleService	==>	save...");
			merkleService.save(new ArrayList<Merkle>() {{
				add(new Merkle(dUcPerson.getId(), new InsObj(DUcPerson.class.getName(), JSON.toJSONString(dUcPerson))));
			}});
			logger.info("merkleService	==>	complete");
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}
		return new BaseResult(ResultConstant.SUCCESS);
	}

	/**
	 * 添加组织-人员关联关系
	 *
	 * @param dUcOrgPerson
	 * @return
	 */
	@Override
	public BaseResult insertDUcOrgPerson(DUcOrgPerson dUcOrgPerson) {
		logger.info("PersonApiServiceImpl	==>	insertDUcOrgPerson");
		logger.info("params	==>	dUcOrgPerson:" + JSON.toJSONString(dUcOrgPerson));
		try {
			dUcOrgPersonMapper.insert(dUcOrgPerson);

			logger.info("merkleService	==>	save...");
			merkleService.save(new ArrayList<Merkle>() {{
				add(new Merkle(dUcOrgPerson.getId(), new InsObj(DUcOrgPerson.class.getName(), JSON.toJSONString(dUcOrgPerson))));
			}});
			logger.info("merkleService	==>	complete");
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}
		return new BaseResult(ResultConstant.SUCCESS);
	}

	@Override
	public DUcPerson selectByPrimaryKey(String id) {
		logger.info("PersonApiServiceImpl	==>	selectByPrimaryKey");
		logger.info("params	==>	id:" + id);
		return dUcPersonMapper.selectByPrimaryKey(id);
	}
}

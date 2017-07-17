package com.footprint.service;

import com.alibaba.fastjson.JSON;
import com.footprint.api.DealerApiService;
import com.footprint.common.dao.DUcDealerMapper;
import com.footprint.common.dto.BaseResult;
import com.footprint.common.dto.ResultConstant;
import com.footprint.common.merkletree.InsObj;
import com.footprint.common.merkletree.Merkle;
import com.footprint.common.merkletree.service.MerkleService;
import com.footprint.common.model.DUcDealer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

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
public class DealerApiServiceImpl implements DealerApiService {

	private static Logger logger = LoggerFactory.getLogger(DealerApiServiceImpl.class);

	@Autowired
	DUcDealerMapper dUcDealerMapper;//交易商
	@Autowired
	MerkleService merkleService;

	@Override
	public DUcDealer selectByPrimaryKey(String id) {
		logger.info("DealerApiServiceImpl	==>	selectByPrimaryKey");
		logger.info("params	==>	id:" + id);
		return dUcDealerMapper.selectByPrimaryKey(id);
	}

	@Override
	public BaseResult insert(DUcDealer dUcDealer) {
		logger.info("DealerApiServiceImpl	==>	insert");
		logger.info("params	==>	dUcDealer:" + JSON.toJSONString(dUcDealer));
		try {
			// 插入操作
			dUcDealerMapper.insert(dUcDealer);

			// redis es 操作
			logger.info("merkleService	==>	save...");

			/**
			 * @企业信息多张表存在相同id的情况,需要在merkle结构中id加后缀
			 */
			merkleService.save(new ArrayList<Merkle>() {{
				add(new Merkle(dUcDealer.getId() + "_dealer", new InsObj(DUcDealer.class.getName(), dUcDealer.getId(), JSON.toJSONString(dUcDealer))));
			}});
			logger.info("merkleService	==>	complete");
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}
		return new BaseResult(ResultConstant.SUCCESS);
	}

	@Override
	public BaseResult update(DUcDealer dUcDealer) {
		logger.info("DealerApiServiceImpl	==>	update");
		logger.info("params	==>	dUcDealer:" + JSON.toJSONString(dUcDealer));
		try {
			// 插入操作
			dUcDealerMapper.updateByPrimaryKey(dUcDealer);

			// redis es 操作
			logger.info("merkleService	==>	save...");

			/**
			 * @企业信息多张表存在相同id的情况,需要在merkle结构中id加后缀
			 */
			merkleService.save(new ArrayList<Merkle>() {{
				add(new Merkle(dUcDealer.getId() + "_dealer", new InsObj(DUcDealer.class.getName(), dUcDealer.getId(), JSON.toJSONString(dUcDealer))));
			}});
			logger.info("merkleService	==>	complete");
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}
		return new BaseResult(ResultConstant.SUCCESS);
	}
}

package com.footprint.service;

import com.alibaba.fastjson.JSON;
import com.footprint.api.DealerApiService;
import com.footprint.common.dao.DUcDealerMapper;
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
	public int insert(DUcDealer dUcDealer) {
		logger.info("DealerApiServiceImpl	==>	insert");
		logger.info("params	==>	dUcDealer:" + JSON.toJSONString(dUcDealer));
		int rtn = dUcDealerMapper.insert(dUcDealer);
		if (0 == rtn)
			return rtn;

		logger.info("merkleService	==>	save...");
		merkleService.save(new ArrayList<Merkle>() {{
			add(new Merkle(dUcDealer.getId(), new InsObj(DUcDealer.class.getName(), JSON.toJSONString(dUcDealer))));
		}});
		logger.info("merkleService	==>	complete");

		return rtn;
	}
}

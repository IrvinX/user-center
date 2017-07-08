package com.footprint.service;

import com.alibaba.fastjson.JSON;
import com.footprint.api.PersonApiService;
import com.footprint.common.dao.DUcPersonMapper;
import com.footprint.common.merkletree.InsObj;
import com.footprint.common.merkletree.Merkle;
import com.footprint.common.merkletree.service.MerkleService;
import com.footprint.common.model.DUcPerson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

/**
 * Created by gaofang on 2017/6/20.
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

	@Override
	public int insert(DUcPerson dUcPerson) {
		logger.info("PersonApiServiceImpl	==>	insert");
		logger.info("params	==>	dUcPerson:" + JSON.toJSONString(dUcPerson));
		int rtn = dUcPersonMapper.insert(dUcPerson);
		if (0 == rtn)
			return rtn;

		logger.info("merkleService	==>	save...");
		merkleService.save(new ArrayList<Merkle>() {{
			add(new Merkle(dUcPerson.getId(), new InsObj(DUcPerson.class.getName(), JSON.toJSONString(dUcPerson))));
		}});
		logger.info("merkleService	==>	complete");

		return rtn;
	}

	@Override
	public DUcPerson selectByPrimaryKey(String id) {
		logger.info("PersonApiServiceImpl	==>	selectByPrimaryKey");
		logger.info("params	==>	id:" + id);
		return dUcPersonMapper.selectByPrimaryKey(id);
	}
}

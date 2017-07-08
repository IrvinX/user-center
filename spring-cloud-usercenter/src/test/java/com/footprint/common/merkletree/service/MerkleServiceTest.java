package com.footprint.common.merkletree.service;

import com.alibaba.fastjson.JSON;
import com.footprint.UserCenterApplication;
import com.footprint.api.EnterpriseApiService;
import com.footprint.common.merkletree.InsObj;
import com.footprint.common.merkletree.Merkle;
import com.footprint.common.merkletree.repository.MerkleRepository;
import com.footprint.common.model.DUcEnterprise;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.cloud.redis.repositories.RedisClientTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

/**
 * Created by gaofang on 2017/7/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UserCenterApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class MerkleServiceTest {

	private static final Logger logger = LoggerFactory.getLogger(MerkleServiceTest.class);

	@Autowired
	MerkleService merkleService;
	@Autowired
	MerkleRepository merkleRepository;
	@Autowired
	EnterpriseApiService enterpriseApiService;
	@Autowired
	RedisClientTemplate redisClientTemplate;

	@Test
	public void save() throws Exception {

		merkleService.save(new ArrayList<Merkle>() {
			{
				add(new Merkle("222", new InsObj(DUcEnterprise.class.getName(), JSON.toJSONString(enterpriseApiService.findEnterprise("1c46b1916f0f4b5caab8a9e82d4d589b")))));
			}
		});
		logger.info("save	==>	redis:" + redisClientTemplate.get("222"));
		logger.info("save	==>	repo:" + JSON.toJSONString(merkleRepository.findOne("222")));
	}

	@Test
	public void findByType() throws Exception {
		Merkle merkle = merkleService.findByType(DUcEnterprise.class.getName(), 0, 10).get(0);
		logger.info("findByType	==>	result:" + JSON.toJSONString(merkle));
		InsObj insObj = (InsObj) merkle.getValue();
		DUcEnterprise dUcEnterprise = JSON.toJavaObject(JSON.parseObject(insObj.getJson()), DUcEnterprise.class);
		logger.info("findByType	==>	convert-result:" + JSON.toJSONString(dUcEnterprise));
	}

	@Test
	public void persistentMerkle() throws Exception {
		merkleService.persistentMerkle(new ArrayList<Merkle>() {
			{
				add(new Merkle("222", new InsObj(DUcEnterprise.class.getName(), JSON.toJSONString(enterpriseApiService.findEnterprise("1c46b1916f0f4b5caab8a9e82d4d589b")))));
			}
		});
		logger.info("persistentMerkle	==>	redis:" + redisClientTemplate.get("222"));
		logger.info("persistentMerkle	==>	repo:" + JSON.toJSONString(merkleRepository.findOne("222")));
	}

}
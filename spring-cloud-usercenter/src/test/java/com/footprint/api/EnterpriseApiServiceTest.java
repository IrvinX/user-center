package com.footprint.api;

import com.alibaba.fastjson.JSON;
import com.footprint.UserCenterApplication;
import com.footprint.common.model.DUcEnterprise;
import com.footprint.util.TestUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by gaofang on 2017/7/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UserCenterApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class EnterpriseApiServiceTest {

	private static final Logger logger = LoggerFactory.getLogger(EnterpriseApiServiceTest.class);

	@Autowired
	EnterpriseApiService enterpriseApiService;

	@Test
	public void insertEnterprise() throws Exception {
		DUcEnterprise enterprise = new DUcEnterprise();
		String id = TestUtil.generateId();
		logger.info("EnterpriseTest	==>	insert");
		logger.info("insert	==>	id:\n\t" + id);
		enterprise.setId(id);
		enterprise.setEntpStatus((short) (Math.random() * 2));
		enterprise.setFullnameEng(TestUtil.generateLetters(5));
		enterprise.setFullname(TestUtil.generateLetters(5));
		enterprise.setShortname(TestUtil.generateLetters(5));
		enterprise.setFullnamePinyin(TestUtil.generateLetters(5));
		enterprise.setLpName(TestUtil.generateLetters(5));
		enterprise.setLpMbphone(TestUtil.generateNums(11));
		enterprise.setLpTel(TestUtil.generateNums(11));
		enterprise.setLpEmal(TestUtil.generateLetters(5) + "@qq.com");
		enterprise.setLpFax(TestUtil.generateNums(11));
		enterprise.setIdentityType((short) (Math.random() * 2));
		enterprise.setIdentityId(TestUtil.generateNums(18));
		enterprise.setIdentityUrl("www.baidu.com");
		enterprise.setCompRegfund("10000000");
		enterprise.setOrgType((short) (Math.random() * 2));
		enterprise.setCompOrgnNum(TestUtil.generateId());
		enterprise.setCompTaxregcert(TestUtil.generateId());
		enterprise.setCompProvince(TestUtil.generateId());
		enterprise.setCompCity(TestUtil.generateId());
		enterprise.setCompDistrict(TestUtil.generateId());
		enterprise.setCompAddr(TestUtil.generateLetters(15));
		enterprise.setCompAddrEng(TestUtil.generateLetters(15));
		enterprise.setCreateuser(TestUtil.generateLetters(5));
		enterprise.setCreatetime(new Date());
		logger.info("insertEnterprise	==>	result:\n\t" + JSON.toJSONString(enterpriseApiService.insert(enterprise)));
	}

	@Test
	public void updateEnterprise() throws Exception {
		String id = "26fd249927454935b7eed7463baa64e9";
		DUcEnterprise dUcEnterprise = enterpriseApiService.findEnterprise(id);
		logger.info("updateEnterprise	==>	before:\n\t" + JSON.toJSONString(dUcEnterprise));
		dUcEnterprise.setFullname("谷歌谷歌谷歌谷歌");
		enterpriseApiService.update(dUcEnterprise);
		logger.info("updateEnterprise	==>	after:\n\t" + JSON.toJSONString(enterpriseApiService.findEnterprise(id)));
	}

	@Test
	public void deleteEnterprise() throws Exception {

	}

	@Test
	public void findEnterprise() throws Exception {
		logger.info("findEnterprise	==>	result:\n\t"
				+ JSON.toJSONString(enterpriseApiService.findEnterprise("e92cb51f04384187ba8c59ecd77130cd")));
	}

	@Test
	public void findAllEnterprise() throws Exception {
	}

	@Test
	public void findOrgBankAccount() throws Exception {

	}

	@Test
	public void findTextileEntp() throws Exception {

	}

	@Test
	public void findEntpType() throws Exception {

	}

	@Test
	public void findEntpRal() throws Exception {

	}

	@Test
	public void updateEntpRal() throws Exception {

	}

	@Test
	public void checkOrgnNumExists() throws Exception {

	}

}
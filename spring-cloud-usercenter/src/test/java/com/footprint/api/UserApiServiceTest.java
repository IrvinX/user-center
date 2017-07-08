package com.footprint.api;

import com.footprint.UserCenterApplication;
import com.footprint.common.dao.DUcPersonMapper;
import com.footprint.common.dao.DUcUserMapper;
import com.footprint.common.model.DUcPerson;
import com.footprint.common.model.DUcUser;
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
public class UserApiServiceTest {

	private static final Logger logger = LoggerFactory.getLogger(UserApiServiceTest.class);

	@Autowired
	DUcUserMapper dUcUserMapper;
	@Autowired
	DUcPersonMapper dUcPersonMapper;

	@Test
	public void checkUserNameExists() throws Exception {

	}

	@Test
	public void insertUser() throws Exception {
		// 构建人员对象
		DUcPerson dUcPerson = new DUcPerson();
		String personId = TestUtil.generateId();
		dUcPerson.setId(personId);
		dUcPerson.setName("管理员");
		/**
		 * 使用 用户状态
		 * 	1:正常
		 * 	2:通用
		 * 	3:删除
		 */
		dUcPerson.setPersonStatus((short) 0);
		dUcPerson.setCreatetime(new Date());
		dUcPerson.setCreateuser("admin");
		int result = dUcPersonMapper.insert(dUcPerson);
		logger.info("[LocalTest:	insertPersonUser]\t" + result);

		// 构建用户对象
		DUcUser dUcUser = new DUcUser();
		String userId=TestUtil.generateId();
		dUcUser.setId(userId);
		dUcUser.setPersonId(personId);
		dUcUser.setUserNm("admin");
		dUcUser.setUserStatus((short) 0);
		dUcUser.setCreatedate(new Date());
		dUcUser.setCreateuserid(userId);
		int result1 = dUcUserMapper.insert(dUcUser);
		logger.info("[LocalTest:	insertPersonUser]\t" + result1);
	}

	@Test
	public void check() throws Exception {

	}

	@Test
	public void countByExample() throws Exception {

	}

	@Test
	public void selectByExample() throws Exception {

	}

}
package com.footprint.service;

import com.alibaba.fastjson.JSON;
import com.footprint.api.PersonApiService;
import com.footprint.api.UserApiService;
import com.footprint.common.constant.UpmsConstant;
import com.footprint.common.dao.DUcUserMapper;
import com.footprint.common.dao.DUcUserPermissionMapper;
import com.footprint.common.dao.DUcUserRoleMapper;
import com.footprint.common.dto.BaseResult;
import com.footprint.common.dto.ResultConstant;
import com.footprint.common.merkletree.InsObj;
import com.footprint.common.merkletree.Merkle;
import com.footprint.common.merkletree.service.MerkleService;
import com.footprint.common.model.*;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
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
 *         用户服务实现
 */
@Service
@Transactional
public class UserApiServiceImpl implements UserApiService {

	private static Logger logger = LoggerFactory.getLogger(UserApiServiceImpl.class);

	@Autowired
	DUcUserMapper dUcUserMapper;
	@Autowired
	PersonApiService personApiService;
	@Autowired
	DUcUserRoleMapper dUcUserRoleMapper;
	@Autowired
	DUcUserPermissionMapper dUcUserPermissionMapper;
	@Autowired
	MerkleService merkleService;

	private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
	private String algorithmName = "md5";
	private int hashIterations = 1;

	@Override
	public BaseResult checkUserNameUsable(String userName) {
		logger.info("UserApiServiceImpl	==>	checkUserNameExists");
		logger.info("params	==>	userName:" + userName);

		/**
		 * 筛选同名用户并且状态不为删除的数据
		 */
		try {
			DUcUserExample dUcUserExample = new DUcUserExample();
			dUcUserExample.createCriteria()
					.andUserNmEqualTo(userName)
					.andUserStatusNotEqualTo(UpmsConstant.USER_STATUS_DELETE);
			int count = (int) dUcUserMapper.countByExample(dUcUserExample);
			/**
			 * 查询结果数量不为0,不可用
			 */
			if (0 != count)
				return new BaseResult(ResultConstant.SUCCESS, false);
			return new BaseResult(ResultConstant.SUCCESS, true);
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}
	}

	@Override
	public int insertUser(DUcUser dUcUser) {
		logger.info("UserApiServiceImpl	==>	insertUser");
		logger.info("params	==>	dUcUser:" + JSON.toJSONString(dUcUser));

		if (null == dUcUser) {
			logger.info("参数为Null");
			return 0;
		}

		/**
		 * 1. 生成 ID
		 * TODO 临时通过 UUID 生成
		 */
		if (null == dUcUser.getId()) {
			String id = generateID();
			logger.info("insertUser	==>	生成ID:" + id);
			dUcUser.setId(id);
		}

		/**
		 * 2. pwd & salt
		 * 	参数中若无password,不需要进行此操作,同时salt也不能存在
		 */
		if (null != dUcUser.getPassword()) {
			// 2.1 取 salt
			String salt = getSalt();
			logger.info("insertUser	==>	生成salt");
			// 2.2 生成 newPwd
			String newPwd = encryptPassword(dUcUser.getPassword(), salt);
			logger.info("insertUser	==>	生成newPwd");
			dUcUser.setSalt(salt);
			dUcUser.setPassword(newPwd);
		} else {
			dUcUser.setSalt(null);
		}
		/**
		 * 3. 保存
		 */
		int result = dUcUserMapper.insert(dUcUser);
		logger.info("insertUser	==>	插入操作完成,操作成功' " + result + " '条");
		if (0 == result)
			return result;

		logger.info("merkleService	==>	save...");
		merkleService.save(new ArrayList<Merkle>() {{
			add(new Merkle(dUcUser.getId(), new InsObj(DUcUser.class.getName(), JSON.toJSONString(dUcUser))));
		}});
		logger.info("merkleService	==>	complete");

		return result;
	}

	@Override
	public BaseResult check(Map<String, String> userInfo) {
		logger.info("UserApiServiceImpl	==>	check");
		logger.info("params	==>	dUcUser:" + JSON.toJSONString(userInfo));
		if (null == userInfo)
			return new BaseResult(ResultConstant.INVALID_PARAM, "用户信息为空");
		try {
			String accountCK = userInfo.get("account");
			String passwordCK = userInfo.get("password");

			/**
			 * 1. 取当前帐号的salt & pwd
			 */
			DUcUserExample dUcUserExample = new DUcUserExample();
			dUcUserExample.createCriteria().andUserNmEqualTo(accountCK);
			List<DUcUser> dUcUsers = dUcUserMapper.selectByExample(dUcUserExample);
			if (null == dUcUsers || dUcUsers.size() < 1) {
				logger.info("帐号不存在!");
				return new BaseResult(ResultConstant.SUCCESS, false);
			}

			DUcUser dUcUser = dUcUsers.get(0);
			logger.info("UserApiServiceImpl	==>	取用户数据:" + JSON.toJSONString(dUcUser));
			String salt = dUcUser.getSalt();
			String password = dUcUser.getPassword();

			/**
			 * 2. 验证
			 */
			String newPwd = encryptPassword(passwordCK, salt);
			if (password.equals(newPwd)) {
				logger.info("验证成功!");
				return new BaseResult(ResultConstant.SUCCESS, true);
			}

			logger.info("验证失败:帐号密码不匹配!");
			return new BaseResult(ResultConstant.SUCCESS, false);
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}
	}

	@Override
	public int countByExample(DUcUserExample dUcUserExample) {
		logger.info("UserApiServiceImpl	==>	countByExample");
		logger.info("params	==>	dUcUserExample:" + JSON.toJSONString(dUcUserExample));
		return (int) dUcUserMapper.countByExample(dUcUserExample);
	}

	@Override
	public List<DUcUser> selectByExample(DUcUserExample dUcUserExample) {
		logger.info("UserApiServiceImpl	==>	selectByExample");
		logger.info("params	==>	dUcUserExample:" + JSON.toJSONString(dUcUserExample));
		return dUcUserMapper.selectByExample(dUcUserExample);
	}

	@Override
	public Map<String, Object> findUserInfoByAccount(String account) {
		/**
		 * 1. 获取用户信息
		 */
		DUcUserExample dUcUserExample = new DUcUserExample();
		dUcUserExample.createCriteria().andUserNmEqualTo(account);
		List<DUcUser> dUcUsers = dUcUserMapper.selectByExample(dUcUserExample);
		if (null == dUcUsers || 0 == dUcUsers.size())
			return null;

		/**
		 * 2. 获取人员信息
		 */
		String personId = dUcUsers.get(0).getPersonId();
		DUcPerson dUcPerson = personApiService.selectByPrimaryKey(personId);

		Map<String, Object> rtn = new HashMap<>();
		rtn.put("userName", dUcPerson.getName());
		return rtn;
	}

	@Override
	public DUcUser findUserByAccount(String account) {
		DUcUserExample dUcUserExample = new DUcUserExample();
		dUcUserExample.createCriteria().andUserNmEqualTo(account);
		List<DUcUser> dUcUsers = dUcUserMapper.selectByExample(dUcUserExample);
		if (null == dUcUsers || 0 == dUcUsers.size())
			return null;
		return dUcUsers.get(0);
	}

	@Override
	public Set<String> findUserRolesByAccount(String account) {
		/**
		 * 1. 获取用户信息
		 */
		DUcUserExample dUcUserExample = new DUcUserExample();
		dUcUserExample.createCriteria().andUserNmEqualTo(account);
		List<DUcUser> dUcUsers = dUcUserMapper.selectByExample(dUcUserExample);
		if (null == dUcUsers || 0 == dUcUsers.size())
			return null;

		/**
		 * 2. 获取人员角色
		 */
		Set<String> rtn = new HashSet<>();
		DUcUserRoleExample dUcUserRoleExample = new DUcUserRoleExample();
		dUcUserRoleExample.createCriteria().andUserIdEqualTo(dUcUsers.get(0).getId());
		List<DUcUserRole> dUcUserRoles = dUcUserRoleMapper.selectByExample(dUcUserRoleExample);
		for (DUcUserRole dUcUserRole : dUcUserRoles) {
			rtn.add(dUcUserRole.getId());
		}
		return rtn;
	}

	@Override
	public Set<String> findUserPermissionsByAccount(String account) {
		/**
		 * 1. 获取用户信息
		 */
		DUcUserExample dUcUserExample = new DUcUserExample();
		dUcUserExample.createCriteria().andUserNmEqualTo(account);
		List<DUcUser> dUcUsers = dUcUserMapper.selectByExample(dUcUserExample);
		if (null == dUcUsers || 0 == dUcUsers.size())
			return null;

		/**
		 * 2. 获取人员权限
		 */
		Set<String> rtn = new HashSet<>();
		DUcUserPermissionExample dUcUserRoleExample = new DUcUserPermissionExample();
		dUcUserRoleExample.createCriteria().andUserIdEqualTo(dUcUsers.get(0).getId());
		List<DUcUserPermission> dUcUserPermissions = dUcUserPermissionMapper.selectByExample(dUcUserRoleExample);
		for (DUcUserPermission dUcUserPermission : dUcUserPermissions) {
			rtn.add(dUcUserPermission.getId());
		}
		return rtn;
	}

	/**
	 * 通过 UUID 生成 ID
	 *
	 * @return
	 */
	private String generateID() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	/**
	 * 生成salt
	 *
	 * @return
	 */
	private String getSalt() {
		return randomNumberGenerator.nextBytes().toHex();
	}

	/**
	 * 生成 newPwd
	 *
	 * @param password
	 * @param salt
	 * @return
	 */
	private String encryptPassword(String password, String salt) {

		String newPassword = new SimpleHash(
				algorithmName,
				password,
				ByteSource.Util.bytes(salt),
				hashIterations).toHex();
		return newPassword;
	}
}

package com.footprint.service;

import com.alibaba.fastjson.JSON;
import com.footprint.api.EnterpriseApiService;
import com.footprint.api.PersonApiService;
import com.footprint.api.UserApiService;
import com.footprint.common.config.shiro.UserImpl;
import com.footprint.common.constant.UpmsConstant;
import com.footprint.common.dao.*;
import com.footprint.common.dto.BaseResult;
import com.footprint.common.dto.ResultConstant;
import com.footprint.common.merkletree.InsObj;
import com.footprint.common.merkletree.Merkle;
import com.footprint.common.merkletree.service.MerkleService;
import com.footprint.common.model.*;
import com.footprint.entity.IUser;
import org.apache.shiro.authc.AuthenticationToken;
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
public class UserApiServiceImpl implements UserApiService, UserService {

	private static Logger logger = LoggerFactory.getLogger(UserApiServiceImpl.class);

	@Autowired
	DUcUserMapper dUcUserMapper;
	@Autowired
	DUcRoleMapper dUcRoleMapper;
	@Autowired
	DUcPermissionMapper dUcPermissionMapper;
	@Autowired
	PersonApiService personApiService;
	@Autowired
	DUcUserRoleMapper dUcUserRoleMapper;
	@Autowired
	DUcUserPermissionMapper dUcUserPermissionMapper;
	@Autowired
	MerkleService merkleService;
	@Autowired
	DUcUserOauthMapper dUcUserOauthMapper;
	@Autowired
	DUcOrgUserMapper dUcOrgUserMapper;
	@Autowired
	EnterpriseApiService enterpriseApiService;
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
	public BaseResult insertUser(DUcUser dUcUser) {
		logger.info("UserApiServiceImpl	==>	insertUser");
		logger.info("params	==>	dUcUser:" + JSON.toJSONString(dUcUser));
		try {

			if (null == dUcUser) {
				logger.info("参数为Null");
				return new BaseResult(ResultConstant.INVALID_PARAM);
			}

			/**
			 * 1. 生成 ID
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
			dUcUserMapper.insert(dUcUser);
			logger.info("insertUser	==>	插入操作完成,操作成功");

			logger.info("merkleService	==>	save...");
			merkleService.save(new ArrayList<Merkle>() {{
				add(new Merkle(dUcUser.getId(), new InsObj(DUcUser.class.getName(), JSON.toJSONString(dUcUser))));
			}});
			logger.info("merkleService	==>	complete");

		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}
		return new BaseResult(ResultConstant.SUCCESS);
	}

	/**
	 * 添加用户-角色关联关系
	 *
	 * @param dUcUserRole
	 * @return
	 */
	@Override
	public BaseResult insertDUcUserRole(DUcUserRole dUcUserRole) {
		logger.info("UserApiServiceImpl	==>	insertDUcUserRole");
		logger.info("params	==>	dUcUserRole:" + JSON.toJSONString(dUcUserRole));
		try {
			dUcUserRoleMapper.insert(dUcUserRole);
			// redis es 操作
			logger.info("merkleService	==>	save...");
			merkleService.save(new ArrayList<Merkle>() {{
				add(new Merkle(dUcUserRole.getId(), new InsObj(DUcUserRole.class.getName(), JSON.toJSONString(dUcUserRole))));
			}});
			logger.info("merkleService	==>	complete");
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}
		return new BaseResult(ResultConstant.SUCCESS);
	}

	/**
	 * 添加用户-认证方式关联关系
	 *
	 * @param dUcUserOauth
	 * @return
	 */
	@Override
	public BaseResult insertDUcUserOauth(DUcUserOauth dUcUserOauth) {
		logger.info("UserApiServiceImpl	==>	insertDUcUserOauth");
		logger.info("params	==>	dUcUserOauth:" + JSON.toJSONString(dUcUserOauth));
		try {
			dUcUserOauthMapper.insert(dUcUserOauth);
			// redis es 操作
			logger.info("merkleService	==>	save...");
			merkleService.save(new ArrayList<Merkle>() {{
				add(new Merkle(dUcUserOauth.getId(), new InsObj(DUcUserOauth.class.getName(), JSON.toJSONString(dUcUserOauth))));
			}});
			logger.info("merkleService	==>	complete");
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}
		return new BaseResult(ResultConstant.SUCCESS);
	}

	/**
	 * 添加组织-用户关联关系
	 *
	 * @param dUcOrgUser
	 * @return
	 */
	@Override
	public BaseResult insertDUcOrgUser(DUcOrgUser dUcOrgUser) {
		logger.info("UserApiServiceImpl	==>	insertDUcUserOauth");
		logger.info("params	==>	dUcUserOauth:" + JSON.toJSONString(dUcOrgUser));
		try {
			dUcOrgUserMapper.insert(dUcOrgUser);
			// redis es 操作
			logger.info("merkleService	==>	save...");
			merkleService.save(new ArrayList<Merkle>() {{
				add(new Merkle(dUcOrgUser.getId(), new InsObj(DUcOrgUser.class.getName(), JSON.toJSONString(dUcOrgUser))));
			}});
			logger.info("merkleService	==>	complete");
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}
		return new BaseResult(ResultConstant.SUCCESS);
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
	public BaseResult findUserInfoByAccount(String account) {
		logger.info("UserApiServiceImpl	==>	findUserInfoByAccount");
		logger.info("params	==>	account:" + account);
		UserImpl user;
		try {
			/**
			 * 1. 获取用户信息
			 */
			DUcUserExample dUcUserExample = new DUcUserExample();
			dUcUserExample.createCriteria().andUserNmEqualTo(account);
			List<DUcUser> dUcUsers = dUcUserMapper.selectByExample(dUcUserExample);
			if (null == dUcUsers || 0 == dUcUsers.size())
				return null;
			DUcUser dUcUser = dUcUsers.get(0);
			logger.info("获取用户信息	==>	dUcUser:" + JSON.toJSONString(dUcUser));
			/**
			 * 2. 获取人员信息
			 */
			String personId = dUcUser.getPersonId();
			DUcPerson dUcPerson = personApiService.selectByPrimaryKey(personId);
			logger.info("获取人员信息	==>	dUcPerson:" + JSON.toJSONString(dUcPerson));

			user = new UserImpl(
					dUcUser.getUserNm(),//id是登录名
					dUcPerson.getMobile(),
					dUcUser.getSalt(),
					dUcPerson.getName(),
					dUcUser.getPassword(),
					"",
					false,
					false,
					dUcUser.getNewOldPwd(),
					dUcUser.getUserType(),
					null,
					null,
					null,
					null,
					false);

			/**
			 * 3. 获取企业信息
			 */
			DUcOrgUserExample dUcOrgUserExample = new DUcOrgUserExample();
			dUcOrgUserExample.createCriteria().andUserIdEqualTo(dUcUser.getId());
			List<DUcOrgUser> dUcOrgUsers = dUcOrgUserMapper.selectByExample(dUcOrgUserExample);
			if (null != dUcOrgUsers || 0 < dUcOrgUsers.size()) {
				String entpId = dUcOrgUsers.get(0).getOrgId();
				DUcEnterprise dUcEnterprise = enterpriseApiService.findEnterprise(entpId);
				logger.info("获取企业信息	==>	dUcEnterprise:" + JSON.toJSONString(dUcEnterprise));

				user.setEnterpriseId(entpId);
				user.setCompOrgnNum(dUcEnterprise.getCompOrgnNum());
				user.setEnterpriseName(dUcEnterprise.getFullname());
				user.setEnterpriseLpName(dUcEnterprise.getLpName());
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}
		logger.info("用户信息	==>	user:" + JSON.toJSONString(user));
		return new BaseResult(ResultConstant.SUCCESS, user);
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
	public BaseResult findUserRolesByAccount(String account) {
		Set<String> rtn = new HashSet<>();
		/**
		 * 1. 获取用户信息
		 */
		try {
			DUcUserExample dUcUserExample = new DUcUserExample();
			dUcUserExample.createCriteria().andUserNmEqualTo(account);
			List<DUcUser> dUcUsers = dUcUserMapper.selectByExample(dUcUserExample);
			if (null == dUcUsers || 0 == dUcUsers.size())
				return new BaseResult(ResultConstant.SUCCESS);

			/**
			 * 2. 获取人员角色
			 */
			DUcUserRoleExample dUcUserRoleExample = new DUcUserRoleExample();
			dUcUserRoleExample.createCriteria().andUserIdEqualTo(dUcUsers.get(0).getId());
			List<DUcUserRole> dUcUserRoles = dUcUserRoleMapper.selectByExample(dUcUserRoleExample);
			for (DUcUserRole dUcUserRole : dUcUserRoles) {
				DUcRole dUcRole = dUcRoleMapper.selectByPrimaryKey(dUcUserRole.getRoleId());
				if (null != dUcRole)
					rtn.add(dUcRole.getRoleSign());
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}
		return new BaseResult(ResultConstant.SUCCESS, rtn);
	}

	@Override
	public BaseResult findUserPermissionsByAccount(String account) {
		Set<String> rtn = new HashSet<>();
		/**
		 * 1. 获取用户信息
		 */
		try {
			DUcUserExample dUcUserExample = new DUcUserExample();
			dUcUserExample.createCriteria().andUserNmEqualTo(account);
			List<DUcUser> dUcUsers = dUcUserMapper.selectByExample(dUcUserExample);
			if (null == dUcUsers || 0 == dUcUsers.size())
				return new BaseResult(ResultConstant.SUCCESS);

			/**
			 * 2. 获取人员权限
			 */
			DUcUserPermissionExample dUcUserRoleExample = new DUcUserPermissionExample();
			dUcUserRoleExample.createCriteria().andUserIdEqualTo(dUcUsers.get(0).getId());
			List<DUcUserPermission> dUcUserPermissions = dUcUserPermissionMapper.selectByExample(dUcUserRoleExample);
			for (DUcUserPermission dUcUserPermission : dUcUserPermissions) {
				DUcPermission dUcPermission = dUcPermissionMapper.selectByPrimaryKey(dUcUserPermission.getPermissionId());
				if (null != dUcPermission)
					rtn.add(dUcPermission.getExpression());
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(ResultConstant.FAILED, e.getMessage());
		}
		return new BaseResult(ResultConstant.SUCCESS, rtn);
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

	/**
	 * 修改密码
	 *
	 * @param userId
	 * @param newPassword
	 */
	@Override
	public void changePassword(Long userId, String newPassword) {
	}

	/**
	 * 添加用户-角色关系
	 *
	 * @param userId
	 * @param roleIds
	 */
	@Override
	public void correlationRoles(Long userId, Long... roleIds) {
	}

	/**
	 * 移除用户-角色关系
	 *
	 * @param userId
	 * @param roleIds
	 */
	@Override
	public void uncorrelationRoles(Long userId, Long... roleIds) {
	}

	/**
	 * 根据用户名查找用户
	 *
	 * @param username
	 * @return
	 */
	@Override
	public IUser findByUsername(String username) {
		return null;
	}

	/**
	 * 根据用户名查找其角色
	 *
	 * @param username
	 * @return
	 */
	@Override
	public Set<String> findRoles(String username) {
		BaseResult baseResult = findUserRolesByAccount(username);
		if (null == baseResult || null == baseResult.getData())
			return null;
		return new HashSet<String>((List<String>) baseResult.getData());
	}

	/**
	 * 根据用户名查找其权限
	 *
	 * @param username
	 * @return
	 */
	@Override
	public Set<String> findPermissions(String username) {
		BaseResult baseResult = findUserPermissionsByAccount(username);
		if (null == baseResult || null == baseResult.getData())
			return null;
		return new HashSet<String>((List<String>) baseResult.getData());
	}

	@Override
	public IUser findByToken(AuthenticationToken token) {
		return null;
	}

	/**
	 * 根据principal取得用户
	 *
	 * @param principal
	 * @return
	 */
	@Override
	public IUser findByPrincipal(Object principal) {
		logger.debug("findByPrincipal:" + principal);
		if (principal == null) {
			logger.debug("findByPrincipal: principal为空");
			return null;
		}

		UserImpl userImpl = new UserImpl();
		userImpl.setId((String) principal);
		// 通过帐号查询用户信息
		BaseResult baseResult = findUserInfoByAccount(principal.toString());
		if (null == baseResult) {
			return userImpl;
		}
		userImpl = JSON.toJavaObject(JSON.parseObject(JSON.toJSONString(baseResult.getData())), UserImpl.class);
		return userImpl;
	}
}

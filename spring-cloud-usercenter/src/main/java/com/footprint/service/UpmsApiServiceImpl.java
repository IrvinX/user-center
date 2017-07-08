package com.footprint.service;

import com.footprint.api.UpmsApiService;
import com.footprint.api.UserApiService;
import com.footprint.common.dao.*;
import com.footprint.common.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaofang on 2017/7/3.
 *
 * @author gaofang
 *         <p>
 *         权限服务实现
 */
@Service
public class UpmsApiServiceImpl implements UpmsApiService {

	private static Logger logger = LoggerFactory.getLogger(UpmsApiServiceImpl.class);

	@Autowired
	UserApiService userApiService;
	@Autowired
	DUcUserPermissionMapper dUcUserPermissionMapper;//用户-权限
	@Autowired
	DUcPermissionMapper dUcPermissionMapper;//权限
	@Autowired
	DUcUserRoleMapper dUcUserRoleMapper;//用户-角色
	@Autowired
	DUcRoleMapper dUcRoleMapper;//角色
	@Autowired
	DUcRolePermissionMapper dUcUserRoleExample;//角色-权限

	@Override
	public List<DUcPermission> selectPermissionByUserId(String userId) {
		logger.info("UpmsApiServiceImpl	==>	selectPermissionByUserId");
		logger.info("params	==>	userId:" + userId);

		List<DUcPermission> rtn = new ArrayList<>();
		/**
		 * 1. 通过用户ID 获取 该用户拥有的权限IDs
		 */
		DUcUserPermissionExample dUcUserPermissionExample = new DUcUserPermissionExample();
		dUcUserPermissionExample.createCriteria().andUserIdEqualTo(userId);
		List<DUcUserPermission> dUcUserPermissions = dUcUserPermissionMapper.selectByExample(dUcUserPermissionExample);
		logger.info("==> step1 end");
		/**
		 * 2. 通过权限ID 取 权限
		 */
		for (DUcUserPermission dUcUserPermission : dUcUserPermissions) {
			DUcPermission dUcPermission = dUcPermissionMapper.selectByPrimaryKey(dUcUserPermission.getPermissionId());
			rtn.add(dUcPermission);
		}
		logger.info("==> step2 end");
		return rtn;
	}

	@Override
	public List<DUcRole> selectRoleByUserId(String userId) {
		logger.info("UpmsApiServiceImpl	==>	selectRoleByUserId");
		logger.info("params	==>	userId:" + userId);

		List<DUcRole> rtn = new ArrayList<>();

		/**
		 * 1. 通过用户ID 获取 该用户拥有的角色IDs
		 */
		DUcUserRoleExample dUcUserRoleExample = new DUcUserRoleExample();
		dUcUserRoleExample.createCriteria().andUserIdEqualTo(userId);
		List<DUcUserRole> dUcUserRoles = dUcUserRoleMapper.selectByExample(dUcUserRoleExample);
		logger.info("==> step1 end");

		/**
		 * 2. 通过角色ID 取 角色
		 */
		for (DUcUserRole dUcUserRole : dUcUserRoles) {
			DUcRole dUcRole = dUcRoleMapper.selectByPrimaryKey(dUcUserRole.getRoleId());
			rtn.add(dUcRole);
		}
		logger.info("==> step2 end");
		return rtn;
	}

	@Override
	public List<DUcRolePermission> selectRolePermisstionByRoleId(String roleId) {
		logger.info("UpmsApiServiceImpl	==>	selectRolePermisstionByRoleId");
		logger.info("params	==>	roleId:" + roleId);

		DUcRolePermissionExample dUcRolePermissionExample = new DUcRolePermissionExample();
		dUcRolePermissionExample.createCriteria().andRoleIdEqualTo(roleId);
		List<DUcRolePermission> rtn = dUcUserRoleExample.selectByExample(dUcRolePermissionExample);

		return rtn;
	}

	@Override
	public List<DUcUserPermission> selectUserPermissionByUserId(String userId) {
		logger.info("UpmsApiServiceImpl	==>	selectUserPermissionByUserId");
		logger.info("params	==>	userId:" + userId);

		DUcUserPermissionExample dUcUserPermissionExample = new DUcUserPermissionExample();
		dUcUserPermissionExample.createCriteria().andUserIdEqualTo(userId);
		List<DUcUserPermission> rtn = dUcUserPermissionMapper.selectByExample(dUcUserPermissionExample);

		return rtn;
	}

	@Override
	public DUcUser selectUserByUsername(String username) {
		logger.info("UpmsApiServiceImpl	==>	selectUserByUsername");
		logger.info("params	==>	username:" + username);

		DUcUserExample dUcUserExample = new DUcUserExample();
		dUcUserExample.createCriteria().andUserNmEqualTo(username);
		List<DUcUser> dUcUsers = userApiService.selectByExample(dUcUserExample);
		if (null == dUcUsers || 0 == dUcUsers.size())
			return null;
		return dUcUsers.get(0);
	}
}

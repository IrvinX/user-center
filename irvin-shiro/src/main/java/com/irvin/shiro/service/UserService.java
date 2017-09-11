package com.irvin.shiro.service;


import com.irvin.shiro.entity.AuthUser;
import org.apache.shiro.authc.AuthenticationToken;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
@Service
public interface UserService {


	/**
	 * 修改密码
	 *
	 * @param userId
	 * @param newPassword
	 */
	void changePassword(Long userId, String newPassword);

	/**
	 * 添加用户-角色关系
	 *
	 * @param userId
	 * @param roleIds
	 */
	void correlationRoles(Long userId, Long... roleIds);


	/**
	 * 移除用户-角色关系
	 *
	 * @param userId
	 * @param roleIds
	 */
	void uncorrelationRoles(Long userId, Long... roleIds);

	/**
	 * 根据用户名查找用户
	 *
	 * @param username
	 * @return
	 */
	AuthUser findByUsername(String username);

	/**
	 * 根据用户名查找其角色
	 *
	 * @param username
	 * @return
	 */
	Set<String> findRoles(String username);

	/**
	 * 根据用户名查找其权限
	 *
	 * @param username
	 * @return
	 */
	Set<String> findPermissions(String username);

	AuthUser findByToken(AuthenticationToken token);


	/**
	 * 根据principal取得用户
	 *
	 * @param principal
	 * @return
	 */
	AuthUser findByPrincipal(Object principal);
}

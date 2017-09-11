package com.irvin.shiro.service;

public interface RoleService {

	void deleteRole(Long roleId);

	/**
	 * 添加角色-权限之间关系
	 *
	 * @param roleId
	 * @param permissionIds
	 */
	void correlationPermissions(Long roleId, Long... permissionIds);

	/**
	 * 移除角色-权限之间关系
	 *
	 * @param roleId
	 * @param permissionIds
	 */
	void uncorrelationPermissions(Long roleId, Long... permissionIds);

}

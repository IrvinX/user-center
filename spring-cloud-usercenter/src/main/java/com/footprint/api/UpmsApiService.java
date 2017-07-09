package com.footprint.api;

import com.footprint.common.model.*;

import java.util.List;

/**
 * Created by gaofang on 2017/7/3.
 * <p>
 * upms系统接口
 */
public interface UpmsApiService {

	/**
	 * 根据用户id获取所拥有的权限(用户和角色权限合集)
	 *
	 * @param userId
	 * @return
	 */
	List<DUcPermission> selectPermissionByUserId(String userId);

	/**
	 * 根据用户id获取所属的角色
	 *
	 * @param userId
	 * @return
	 */
	List<DUcRole> selectRoleByUserId(String userId);

	/**
	 * 根据角色id获取所拥有的权限
	 *
	 * @param roleId
	 * @return
	 */
	List<DUcRolePermission> selectRolePermisstionByRoleId(String roleId);

	/**
	 * 根据用户id获取所拥有的权限
	 *
	 * @param userId
	 * @return
	 */
	List<DUcUserPermission> selectUserPermissionByUserId(String userId);

}

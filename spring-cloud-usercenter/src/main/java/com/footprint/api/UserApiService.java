package com.footprint.api;

import com.footprint.common.dto.BaseResult;
import com.footprint.common.model.*;

import java.util.List;
import java.util.Map;

/**
 * Created by gaofang on 2017/6/20.
 *
 * @author gaofang
 *         <p>
 *         用户服务接口
 */
public interface UserApiService {

	/**
	 * 校验当前用户名(即帐号)是否已注册
	 *
	 * @param userName
	 * @return
	 */
	BaseResult checkUserNameUsable(String userName);

	//--------- 以下方法未使用

	/**
	 * 添加用户<br>
	 * 包含 psw & salt 处理
	 *
	 * @param dUcUser
	 * @return
	 */
	BaseResult insertUser(DUcUser dUcUser);

	/**
	 * 添加用户-角色关联关系
	 *
	 * @param dUcUserRole
	 * @return
	 */
	BaseResult insertDUcUserRole(DUcUserRole dUcUserRole);

	/**
	 * 添加用户-认证方式关联关系
	 *
	 * @param dUcUserOauth
	 * @return
	 */
	BaseResult insertDUcUserOauth(DUcUserOauth dUcUserOauth);

	/**
	 * 添加组织-用户关联关系
	 *
	 * @param dUcOrgUser
	 * @return
	 */
	BaseResult insertDUcOrgUser(DUcOrgUser dUcOrgUser);

	/**
	 * 用户登录:帐号密码验证
	 *
	 * @param userInfo keys:account/password
	 * @return 返回值为 1: 成功 0: 失败
	 */
	BaseResult check(Map<String, String> userInfo);

	int countByExample(DUcUserExample dUcUserExample);

	List<DUcUser> selectByExample(DUcUserExample dUcUserExample);

	/**
	 * 通过帐号获取用户信息
	 *
	 * @param account
	 * @return
	 */
	BaseResult findUserInfoByAccount(String account);

	/**
	 * 通过帐号获取用户信息
	 *
	 * @param account
	 * @return
	 */
	DUcUser findUserByAccount(String account);

	/**
	 * 通过帐号获取用户角色
	 *
	 * @param account
	 * @return
	 */
	BaseResult findUserRolesByAccount(String account);

	/**
	 * 通过帐号获取用户权限
	 *
	 * @param account
	 * @return
	 */
	BaseResult findUserPermissionsByAccount(String account);
}

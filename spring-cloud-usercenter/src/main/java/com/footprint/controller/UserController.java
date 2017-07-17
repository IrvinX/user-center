package com.footprint.controller;

import com.footprint.api.UserApiService;
import com.footprint.common.dto.BaseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by gaofang on 2017/6/20.
 * <p>
 * 用户管理
 */

@RestController
@RequestMapping("/user")
@Api(value = "用户管理", description = "用户管理")
public class UserController {

	private static Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserApiService userApiService;

	@ApiOperation(value = "通过帐号获取用户信息", notes = "通过帐号获取用户信息")
	@RequestMapping(value = "/find/user-info/{account}", method = RequestMethod.GET)
	public BaseResult findUserInfoByAccount(@PathVariable String account) {
		return userApiService.findUserInfoByAccount(account);
	}

	@ApiOperation(value = "通过帐号获取用户角色", notes = "通过帐号获取用户角色")
	@RequestMapping(value = "/find/user-roles/{account}", method = RequestMethod.GET)
	public BaseResult findUserRolesByAccount(@PathVariable String account) {
		return userApiService.findUserRolesByAccount(account);
	}

	@ApiOperation(value = "通过帐号获取用户权限", notes = "通过帐号获取用户权限")
	@RequestMapping(value = "/find/user-permissions/{account}", method = RequestMethod.GET)
	public BaseResult findUserPermissionsByAccount(@PathVariable String account) {
		return userApiService.findUserPermissionsByAccount(account);
	}
//	@ApiOperation(value = "后台首页")
//	@RequestMapping(value = "/index", method = RequestMethod.GET)
//	public String index(ModelMap modelMap) {
//		return "/manage/index.jsp";
//	}
//
//	@ApiOperation(value = "新增人员", notes = "新增人员接口")
//	@RequestMapping(value = "/create/person", method = RequestMethod.POST, produces = "application/json")
//	@ResponseBody
//	public String createPerson(@RequestBody DUcPerson dUcPerson) {
//		logger.info("DUcUserController	==>	createPerson");
//		logger.info("params	==>	dUcPerson:" + JSON.toJSONString(dUcPerson));
//		String result = 1 == personApiService.insert(dUcPerson) ? "success" : "failed";
//		logger.info("result	==>	result:" + result);
//		return result;
//	}
}
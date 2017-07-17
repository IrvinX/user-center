package com.footprint.controller;

import com.alibaba.fastjson.JSON;
import com.footprint.common.dto.BaseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.footprint.api.EnterpriseApiService;
import com.footprint.api.SignInApiService;
import com.footprint.api.UserApiService;

import java.util.Map;

/**
 * Created by gaofang on 2017/6/28.
 * <p>
 * 注册管理
 */
@RestController
@RequestMapping("/sign-in")
@Api(value = "注册管理", description = "注册管理")
public class SignInController {

	private static Logger logger = LoggerFactory.getLogger(SignInController.class);

	@Autowired
	SignInApiService signInApiService;
	@Autowired
	UserApiService userApiService;//用户名存在校验
	@Autowired
	EnterpriseApiService enterpriseApiService;//统一社会信用代码可用校验

	@ApiOperation(value = "手机号可用校验", notes = "校验手机号是否已被使用")
	@RequestMapping(value = "/check/mobile", method = RequestMethod.GET, produces = {"application/json; charset=utf-8"})
	public BaseResult checkMobileUsable(@RequestParam(value = "mobile") String mobile) {
		logger.info("SignInController	==>	checkMobileExists");
		logger.info("params	==>	telNo:" + mobile);
		return signInApiService.checkMobileUsable(mobile);
	}

	@ApiOperation(value = "用户名可用校验", notes = "校验用户名是否已被使用")
	@RequestMapping(value = "/check/user-name", method = RequestMethod.GET, produces = {"application/json; charset=utf-8"})
	public BaseResult checkUserNameUsable(@RequestParam(value = "userName") String userName) {
		logger.info("SignInController	==>	checkUserNameExists");
		logger.info("params	==>	userName:" + userName);
		return userApiService.checkUserNameUsable(userName);
	}

	@ApiOperation(value = "统一社会信用代码可用校验", notes = "校验统一社会信用代码是否已被使用")
	@RequestMapping(value = "/check/orgn-num", method = RequestMethod.GET, produces = {"application/json; charset=utf-8"})
	public BaseResult checkOrgnNumUsable(@RequestParam(value = "orgnNum") String orgnNum) {
		logger.info("SignInController	==>	checkOrgnNumExists");
		logger.info("params	==>	orgnNum:" + orgnNum);
		return enterpriseApiService.checkOrgnNumUsable(orgnNum);
	}

	@ApiOperation(value = "注册", notes = "用户注册统一接口")
	@RequestMapping(value = "/sign-in", method = RequestMethod.POST, produces = {"application/json; charset=utf-8"})
	public BaseResult signIn(@RequestBody Map<String, Object> info) {
		logger.info("SignInController	==>	signIn");
		logger.info("params	==>	info:" + JSON.toJSONString(info));
		return signInApiService.signIn(info);
	}
}

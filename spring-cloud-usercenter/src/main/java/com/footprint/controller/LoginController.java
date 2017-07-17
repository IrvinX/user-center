package com.footprint.controller;

import com.alibaba.fastjson.JSON;
import com.footprint.api.UserApiService;
import com.footprint.common.dto.BaseResult;
import com.footprint.common.dto.ResultConstant;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by gaofang on 2017/6/20.
 * <p>
 * 登录管理
 */
@RestController
@RequestMapping("/login")
@Api(value = "登录管理", description = "登录管理")
public class LoginController {

	private static Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	UserApiService userApiService;

	@ApiOperation(value = "登录验证", notes = "用户帐号密码验证,参数Map的key为 account & password")
	@RequestMapping(value = "/check", method = RequestMethod.POST, produces = {"application/json; charset=utf-8"})
	public BaseResult check(@RequestBody Map<String, String> userInfo) {
		logger.info("LoginController	==>	check");
		logger.info("params	==>	userInfo:" + JSON.toJSONString(userInfo));

		/**
		 * todo 当前不添加密码校验,只要用户名存在就可以登录,
		 * 以下代码临时使用,当需要密码校验时,删除以下代码,启用注视掉的代码
		 */
		//该方法是用来校验用户名是否可用的,若BaseResult值为false,说明用户名存在
		BaseResult temp = userApiService.checkUserNameUsable(userInfo.get("account"));
		Boolean bool = (Boolean) temp.getData();
		if (bool)
			return new BaseResult(ResultConstant.SUCCESS, false);
		return new BaseResult(ResultConstant.SUCCESS, true);

//暂时先不用密码校验
//		BaseResult result = userApiService.check(userInfo);
//		return result;
	}

}

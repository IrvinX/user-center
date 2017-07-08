package com.footprint.controller;

import com.footprint.api.EnterpriseApiService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by gaofang on 2017/6/22.
 * <p>
 * 企业管理
 */
@RestController
@RequestMapping("/enterprise")
@Api(value = "企业管理", description = "企业管理")
public class EnterpriseController {

	private static Logger logger = LoggerFactory.getLogger(EnterpriseController.class);

	@Autowired
	EnterpriseApiService enterpriseApiService;

	@ApiOperation(value = "企业查询", notes = "查询企业相关信息")
	@RequestMapping(value = "/find/enterprise-ral", method = RequestMethod.GET, produces = {"application/json; charset=utf-8"})
	public Map<String, Object> findEnterpriseRal(@RequestParam(value = "id") String id) {
		return enterpriseApiService.findEntpRal(id);
	}

//	@ApiOperation(value = "获取所有企业", notes = "获取所有企业")
//	@RequestMapping(value = "/find/all", method = RequestMethod.GET, produces = {"application/json; charset=utf-8"})
//	public List<DUcEnterprise> findAllEnterprise() {
//		logger.info("EnterpriseController	==>	findAllEnterprise");
//
//		List<DUcEnterprise> dUcEnterprises = enterpriseApiService.findAllEnterprise();
//		return dUcEnterprises;
//	}
//
//	@ApiOperation(value = "新建企业", notes = "新建企业")
//	@RequestMapping(value = "/create/entp", method = RequestMethod.POST, produces = {"application/json; charset=utf-8"})
//	public String insertEnterprise(@RequestBody DUcEnterprise dUcEnterprise) {
//		logger.info("EnterpriseController	==>	insertEnterprise");
//		logger.info("params	==>	dUcEnterprise:" + JSON.toJSONString(dUcEnterprise));
//
//		enterpriseApiService.insertEnterprise(dUcEnterprise);
//		return "success";
//	}
}

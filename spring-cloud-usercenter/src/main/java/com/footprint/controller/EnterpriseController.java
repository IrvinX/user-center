package com.footprint.controller;

import com.alibaba.fastjson.JSON;
import com.footprint.api.EnterpriseApiService;
import com.footprint.common.dto.BaseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

	@ApiOperation(value = "企业查询", notes = "查询企业相关信息为已审核通过的数据")
	@RequestMapping(value = "/find/enterprise-ral", method = RequestMethod.GET, produces = {"application/json; charset=utf-8"})
	public BaseResult findEnterpriseRal(@RequestParam(value = "id") String id) {
		logger.info("EnterpriseController	==>	findEnterpriseRal");
		logger.info("params	==>	id" + id);
		return enterpriseApiService.findEntpRal(id);
	}

	@ApiOperation(value = "企业查询(企业信息维护使用)", notes = "查询到的信息为用户修改的数据")
	@RequestMapping(value = "/find/entp-ral-maintenance", method = RequestMethod.GET, produces = {"application/json; charset=utf-8"})
	public BaseResult findEntpRal4Maintenance(@RequestParam(value = "id") String id) {
		logger.info("EnterpriseController	==>	findEntpRal4Maintenance");
		logger.info("params	==>	id" + id);
		return enterpriseApiService.findEntpRal4Maintenance(id);
	}

	@ApiOperation(value = "企业信息维护", notes = "企业信息维护")
	@RequestMapping(value = "/maintenance", method = RequestMethod.POST, produces = {"application/json; charset=utf-8"})
	public BaseResult entpRal4Maintenance(@RequestBody Map<String,Object> entpInfo) {
		logger.info("EnterpriseController	==>	entpRal4Maintenance");
		logger.info("params	==>	entpInfo" + JSON.toJSONString(entpInfo));
		return enterpriseApiService.entpRal4Maintenance(entpInfo);
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

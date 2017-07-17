package com.footprint.controller;

import com.alibaba.fastjson.JSON;
import com.footprint.api.WFApiService;
import com.footprint.common.dto.BaseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by gaofang on 2017/6/20.
 * <p>
 * 流程管理
 */
@RestController
@RequestMapping("/audit")
@Api(value = "审批管理", description = "审批管理")
public class WFController {

	private static Logger logger = LoggerFactory.getLogger(WFController.class);

	@Autowired
	WFApiService wfApiService;


	/**
	 * 获取待审核数据
	 *
	 * @param conditions 查询条件
	 *                   key:
	 *                   type      办事处待审核/总部待审核
	 *                   pagesize  页码
	 *                   offsetNum 数量
	 *                   其他条件
	 * @return
	 */
	@ApiOperation(value = "待审核查询", notes = "待审核查询")
	@RequestMapping(value = "/find/pending", method = RequestMethod.POST, produces = {"application/json; charset=utf-8"})
	public BaseResult getPendingJobs(@RequestBody Map<String, Object> conditions) {
		logger.info("WFController	==>	pendingJobs");
		logger.info("params	==>	conditions:" + JSON.toJSONString(conditions));
		return wfApiService.getPendingJobs(conditions);
	}

	/**
	 * 流程节点审核处理
	 *
	 * @param auditInfo k:id/auditStatus/auditMemo/auditMan
	 * @return
	 */
	@ApiOperation(value = "流程节点审核处理", notes = "流程节点审核处理")
	@RequestMapping(value = "/single", method = RequestMethod.POST, produces = {"application/json; charset=utf-8"})
	public BaseResult audit(@RequestBody Map<String, Object> auditInfo) {
		logger.info("WFController	==>	auditPass");
		logger.info("params	==>	auditIds:" + JSON.toJSONString(auditInfo));
		return wfApiService.audit(auditInfo);
	}

	/**
	 * 批量审核操作
	 *
	 * @param audits
	 * @return
	 */
	@ApiOperation(value = "批量审核操作", notes = "批量审核操作")
	@RequestMapping(value = "/batch", method = RequestMethod.POST, produces = {"application/json; charset=utf-8"})
	public BaseResult auditBatchPass(@RequestBody Map<String, Object> audits) {
		logger.info("WFController	==>	auditPass");
		logger.info("params	==>	audits:" + JSON.toJSONString(audits));
		List<String> auditIds = (List<String>) audits.get("auditIds");
		short auditStatus = Short.valueOf(audits.get("auditStatus").toString());
		return wfApiService.auditBatch(auditIds, auditStatus);
	}

	/**
	 * 通过审批节点ID查询企业审核信息
	 *
	 * @param auditId 审批节点ID
	 * @return
	 */
	@ApiOperation(value = "通过审批节点ID查询企业审核信息", notes = "通过审批节点ID查询企业审核信息")
	@RequestMapping(value = "/find/auditInfo", method = RequestMethod.GET, produces = {"application/json; charset=utf-8"})
	public BaseResult findAuditInfo(@RequestParam("id") String auditId) {
		logger.info("WFController	==>	findAuditInfo");
		logger.info("params	==>	auditId:" + auditId);
		return wfApiService.findAuditInfo(auditId);
	}

	/**
	 * 根据审批状态获取审批数据
	 *
	 * @return
	 */
	@ApiOperation(value = "根据审批状态获取审批数据", notes = "根据审批状态获取审批数据")
	@RequestMapping(value = "/find/by-status", method = RequestMethod.POST, produces = {"application/json; charset=utf-8"})
	public BaseResult getInfoByAuditStatus(@RequestBody Map<String, Object> conditions) {
		logger.info("WFController	==>	getInfoByAuditStatus");
		logger.info("params	==>	conditions:" + JSON.toJSONString(conditions));
		return wfApiService.getInfoByAuditStatus(conditions);
	}
}

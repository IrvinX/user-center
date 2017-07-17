package com.footprint.api;

import com.footprint.common.dto.BaseResult;
import com.footprint.common.model.DUcDealer;
import com.footprint.common.model.DUcEnterprise;

import java.util.List;
import java.util.Map;

/**
 * Created by gaofang on 2017/6/30.
 *
 * @author gaofang
 *         <p>
 *         流程审批服务接口
 */
public interface WFApiService {

	/**
	 * 普通企业用户注册(启动流程)
	 *
	 * @param dUcEnterprise
	 * @return 0:失败 1:成功
	 */
	int signInWF(DUcEnterprise dUcEnterprise);

	/**
	 * 交易商注册(启动流程)
	 *
	 * @param dUcEnterprise
	 * @param dUcDealer
	 * @return 0:失败 1:成功
	 */
	int signInWF(DUcEnterprise dUcEnterprise, DUcDealer dUcDealer);

	/**
	 * 审核流程新建并启动(启动流程)
	 *
	 * @param dUcEnterprise
	 * @param dUcDealer
	 * @param changeType
	 * @param auditSrc
	 * @param auditStge
	 * @return
	 */
	int createAndStartWF(DUcEnterprise dUcEnterprise, DUcDealer dUcDealer, short changeType, short auditSrc, short auditStge);

	/**
	 * 审核流程新建并启动(启动流程)
	 *
	 * @param dUcEnterprise
	 * @param changeType
	 * @param auditSrc
	 * @param auditStge
	 * @return
	 */
	int createAndStartWF(DUcEnterprise dUcEnterprise, short changeType, short auditSrc, short auditStge);

	/**
	 * 根据审核阶段获取待审核数据
	 *
	 * @param auditStage
	 * @return 返回值
	 * k:entp   v:DUcEnterpriseAuditInfo
	 * k:dealer v:DUcDealerAuditInfo
	 */
	List<Map<String, Object>> getPendings(short auditStage);

	/**
	 * 根据id获取待审核数据
	 *
	 * @param id
	 * @return 返回值
	 * k:entp   v:DUcEnterpriseAuditInfo
	 * k:dealer v:DUcDealerAuditInfo
	 */
	Map<String, Object> getAuditNode(String id);

	/**
	 * 流程节点审核处理
	 *
	 * @param auditInfo k:id/auditStatus/auditMemo/auditMan/firmCode
	 * @return
	 */
	BaseResult audit(Map<String, Object> auditInfo);

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
	BaseResult getPendingJobs(Map<String, Object> conditions);

	/**
	 * 审核批量通过
	 *
	 * @param auditIds    参数为审核id list
	 * @param auditStatus 审批状态
	 * @return
	 */
	BaseResult auditBatch(List<String> auditIds, short auditStatus);

	/**
	 * 通过审批节点ID查询企业审核信息
	 *
	 * @param auditId 审批节点ID
	 * @return
	 */
	BaseResult findAuditInfo(String auditId);

	/**
	 * 获取对应审批状态的数据
	 *
	 * @param conditions
	 * @return
	 */
	BaseResult getInfoByAuditStatus(Map<String, Object> conditions);
}

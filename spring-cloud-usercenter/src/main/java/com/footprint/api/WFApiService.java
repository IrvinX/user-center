package com.footprint.api;

import com.footprint.common.model.*;

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
	 * 根据审核阶段获取待审核数据
	 *
	 * @param AuditStage
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
	 * @param id
	 * @param auditInfo k:auditStatus/auditMemo/auditMan
	 * @return 0:失败 1:成功
	 */
	int audit(String id, Map<String, Object> auditInfo);
}

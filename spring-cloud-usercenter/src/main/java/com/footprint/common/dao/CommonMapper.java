package com.footprint.common.dao;

import java.util.List;
import java.util.Map;

public interface CommonMapper {

	/**
	 * 取待审核企业信息
	 *
	 * @param conditions
	 * @return
	 */
	List<Map<String, Object>> getPendingJobs(Map<String, Object> conditions);

	/**
	 * 获取联系人
	 *
	 * @param conditions
	 * @return
	 */
	List<Map<String, Object>> getContacts(Map<String, Object> conditions);

	/**
	 * 获取企业审核状态
	 *
	 * @param entpId
	 * @return
	 */
	List<Map<String, Object>> getAuditStatus(String entpId);

	/**
	 * 根据审核状态取审核信息
	 *
	 * @param conditions
	 * @return
	 */
	List<Map<String, Object>> getInfoByAuditStatus(Map<String, Object> conditions);
}
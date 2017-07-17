package com.footprint.api;

import com.footprint.common.dto.BaseResult;
import com.footprint.common.model.*;

import java.util.List;
import java.util.Map;

/**
 * Created by gaofang on 2017/6/21.
 *
 * @author gaofang
 *         <p>
 *         企业服务接口
 */
public interface EnterpriseApiService {

	/**
	 * 添加企业信息
	 * <p>
	 * 表 D_UC_ENTERPRISE
	 *
	 * @param enterprise
	 * @return
	 */

	BaseResult insert(DUcEnterprise enterprise);

	/**
	 * 添加企业信息
	 * <p>
	 *
	 * @param dUcEntpTypeMap
	 * @return
	 */
	BaseResult insertDUcEntpTypeMap(DUcEntpTypeMap dUcEntpTypeMap);

	/**
	 * 添加组织银行账户
	 * <p>
	 *
	 * @param dUcOrgBankAccount
	 * @return
	 */
	BaseResult insertDUcOrgBankAccount(DUcOrgBankAccount dUcOrgBankAccount);

	/**
	 * 添加组织
	 * <p>
	 *
	 * @param dUcOrg
	 * @return
	 */
	BaseResult insertDUcOrg(DUcOrg dUcOrg);


	/**
	 * 更新企业信息
	 * <p>
	 * 表 D_UC_ENTERPRISE
	 *
	 * @param dUcEnterprise
	 * @return
	 */
	BaseResult update(DUcEnterprise dUcEnterprise);

	/**
	 * 删除企业信息
	 * TODO 级联删除,缓存删除
	 * <p>
	 * 表 D_UC_ENTERPRISE
	 *
	 * @param id
	 * @return
	 */
	int deleteEnterprise(String id);

	/**
	 * 通过主键查询企业信息
	 * <p>
	 * 表 D_UC_ENTERPRISE
	 *
	 * @param id
	 * @return
	 */
	DUcEnterprise findEnterprise(String id);

	/**
	 * 获取所有企业(查询结果为所有状态的企业)
	 * <p>
	 * 表 D_UC_ENTERPRISE
	 *
	 * @return
	 */
	List<DUcEnterprise> findAllEnterprise();

	/**
	 * 通过orgId查组织银行账户
	 * <p>
	 * OrgId 即 企业ID
	 * 表 D_UC_ORG_BANK_ACCOUNT
	 *
	 * @param orgId
	 * @return
	 */
	List<DUcOrgBankAccount> findOrgBankAccount(String orgId);

	/**
	 * 通过主键查服装企业信息
	 * <p>
	 * 主键即 企业ID
	 * 表 D_UC_TEXTILE_ENTP
	 *
	 * @param id
	 * @return
	 */
	DUcTextileEntp findTextileEntp(String id);

	/**
	 * 通过主键查企业类型
	 * <p>
	 * 主键即 企业ID
	 * 表 D_UC_ENTP_TYPE_MAP
	 *
	 * @param id
	 * @return
	 */
	List<DUcEntpTypeMap> findEntpType(String id);

	/**
	 * 通过企业Id,获取需要的所有关联数据
	 * <p>
	 * 若所需的关联数据不够,向返回值 map 中添加
	 * <p>
	 * 描述:<br>
	 * k:entp		v:D_UC_ENTERPRISE
	 * k:entpType	v:D_UC_ENTP_TYPE_MAP
	 * k:textile	v:D_UC_TEXTILE_ENTP
	 * k:dealer		v:D_UC_DEALER
	 * k:bankAccount	v:D_UC_ORG_BANK_ACCOUNT
	 * k:contacts	v:企业联系人
	 *
	 * @param id
	 * @return
	 */
	BaseResult findEntpRal(String id);

	BaseResult findEntpRal4Maintenance(String id);

	/**
	 * 新增/更新 缓存中企业相关信息
	 *
	 * @param id
	 * @param map
	 * @return
	 */
	Map<String, Object> updateEntpRal(String id, Map<String, Object> map);

	/**
	 * 统一社会信用代码可用校验
	 *
	 * @param orgnNum
	 * @return
	 */
	BaseResult checkOrgnNumUsable(String orgnNum);


	/**
	 * 企业信息维护
	 *
	 * @param entpInfo
	 * @return
	 */
	BaseResult entpRal4Maintenance(Map<String, Object> entpInfo);

}

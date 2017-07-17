package com.footprint.api;

import com.footprint.common.dto.BaseResult;
import com.footprint.common.model.DUcOrgPerson;
import com.footprint.common.model.DUcPerson;

/**
 * Created by gaofang on 2017/6/20.<br>
 *
 * @author gaofang
 *         <p>
 *         人员服务接口
 */
public interface PersonApiService {

	/**
	 * 添加人员
	 *
	 * @param dUcPerson
	 * @return
	 */
	BaseResult insert(DUcPerson dUcPerson);

	/**
	 * 更新人员
	 *
	 * @param dUcPerson
	 * @return
	 */
	BaseResult update(DUcPerson dUcPerson);


	/**
	 * 添加组织-人员关联关系
	 *
	 * @param dUcOrgPerson
	 * @return
	 */
	BaseResult insertDUcOrgPerson(DUcOrgPerson dUcOrgPerson);

	DUcPerson selectByPrimaryKey(String id);


}

package com.footprint.api;

import com.footprint.common.model.DUcPerson;

/**
 * Created by gaofang on 2017/6/20.<br>
 *
 * @author gaofang
 *         <p>
 *         人员服务接口
 */
public interface PersonApiService {

	int insert(DUcPerson dUcPerson);

	DUcPerson selectByPrimaryKey(String id);

}

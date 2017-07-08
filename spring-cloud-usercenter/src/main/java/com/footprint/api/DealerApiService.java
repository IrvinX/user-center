package com.footprint.api;

import com.footprint.common.model.DUcDealer;

/**
 * Created by gaofang on 2017/6/21.
 *
 * @author gaofang
 *         <p>
 *         交易商服务接口
 */
public interface DealerApiService {

	DUcDealer selectByPrimaryKey(String id);

	int insert(DUcDealer dUcDealer);
}

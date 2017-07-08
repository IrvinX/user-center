package com.footprint.api;

import com.footprint.common.dto.BaseResult;

import java.util.Map;

/**
 * Created by gaofang on 2017/6/28.
 *
 * @author gaofang
 *         <p>
 *         注册服务接口<br>
 *         包括用户注册以及企业注册
 */
public interface SignInApiService {

	/**
	 * 校验当前手机号是否已注册
	 *
	 * @param mobile
	 * @return
	 */
	BaseResult checkMobileUsable(String mobile);

	/**
	 * 注册
	 *
	 * @param info
	 * @return
	 */
	BaseResult signIn(Map<String, Object> info);
}

package com.footprint.common.dto;

import com.footprint.common.constant.ErrorCodeConstant;

import javax.validation.constraints.NotNull;

/**
 * Created by gaofang on 2017/7/6.
 */
public enum ResultConstant {

	FAILED(ErrorCodeConstant.FAILED, "failed"),
	SUCCESS(ErrorCodeConstant.SUCCESS, "success"),

	INVALID_LENGTH(ErrorCodeConstant.INVALID_LENGTH, "Invalid length"),
	INVALID_PARAM(ErrorCodeConstant.INVALID_PARAM, "Invalid param");

	public String code;

	public String message;

	ResultConstant(@NotNull String code, @NotNull String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

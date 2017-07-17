package com.footprint.common.dto;

import javax.validation.constraints.NotNull;

/**
 * Created by gaofang on 2017/7/6.
 * 统一返回值
 */
public class BaseResult {

	private String code;   //错误编码
	private String message;     //返回信息
	private String errorMessage;//错误信息
	private Object data;  //数据体

	public BaseResult(@NotNull ResultConstant resultConstant) {
		this.code = resultConstant.getCode();
		this.message = resultConstant.getMessage();
	}

	public BaseResult(@NotNull ResultConstant resultConstant, Object data) {
		this.code = resultConstant.getCode();
		this.message = resultConstant.getMessage();
		this.data = data;
	}

	public BaseResult(@NotNull ResultConstant resultConstant, String errorMessage) {
		this.code = resultConstant.getCode();
		this.message = resultConstant.getMessage();
		this.errorMessage = errorMessage;
	}

	public BaseResult(@NotNull String code, @NotNull String message, Object data) {

		this.data = data;
		this.code = code;
		this.message = message;
	}

	public BaseResult(@NotNull String code, @NotNull String message) {

		this.code = code;
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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

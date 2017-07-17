package com.footprint.common.merkletree;

import lombok.Data;

import java.io.Serializable;

/**
 * type为对象类型(反序列化时使用)，json是业务对象数据
 */
@Data
public class InsObj implements Serializable {

	private static final long serialVersionUID = -8408547644321078477L;
	/**
	 * 对象类型
	 */
	private String type;

	/**
	 * 对象父节点(企业信息用)
	 */
	private String pId;

	/**
	 * 对象数据
	 */
	private String json;

	public InsObj() {
	}

	public InsObj(String type, String json) {

		this.type = type;
		this.json = json;
	}

	public InsObj(String type, String pId, String json) {
		this.type = type;
		this.pId = pId;
		this.json = json;
	}

	public String getType() {
		return type;
	}

	public String getPId() {
		return pId;
	}

	public String getJson() {
		return json;
	}
}

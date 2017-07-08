package com.footprint.common.merkletree;

import jmerkle.sequential.JMerkleAlterable;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * id与业务对象id相关，编码规则为业务对象ID + _merkle<br>
 * ins为存储对象，type为对象类型(反序列化时使用)，json是业务对象数据<br>
 */
@Data
@Document(indexName = "ecotton", type = "merkleins", shards = 1, replicas = 0, refreshInterval = "-1", indexStoreType = "fs")
public class Merkle implements JMerkleAlterable {
	@Id
	private String key;
	@Field(type = FieldType.Object)
	private InsObj value;

	public Merkle() {
	}

	public Merkle(String key, InsObj value) {

		this.key = key;
		this.value = value;
	}

	@Override
	public String getKey() {
		return key;
	}

	@Override
	public Serializable getValue() {
		return value;
	}
}

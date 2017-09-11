package org.spring.cloud.redis.services;

import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.cloud.redis.repositories.RedisClientTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * redis事务策略
 * 
 * @author Irvin
 */
@Service
public class RedisClientSync {
	private static final Logger logger = LoggerFactory
			.getLogger(RedisClientSync.class);
	@Autowired
	private RedisClientTemplate redisClientTemplate;

	static int expired = 5000;// TODO

	// 事务锁前缀
	private String setnxPrefix = "data_"; // TODO

	/**
	 * 生成事务锁<br>
	 * setnx(lock, String.valueOf(System.currentTimeMillis() + expired + 1)<br>
	 * lock为data id +前缀<br>
	 * 
	 * @param lock
	 * @return
	 */
	private boolean acquireTransactionLock(String dataId) {
		// 1. 通过SETNX试图获取一个lock
		boolean success = false;
		long value = System.currentTimeMillis() + expired + 1;
		long acquired = redisClientTemplate.setnx(this.setnxPrefix + dataId,
				String.valueOf(value));
		// SETNX成功，则成功获取一个锁
		if (acquired == 1)
			success = true;
		// SETNX失败，说明锁仍然被其他对象保持，检查其是否已经超时
		else {
			long oldValue = Long.valueOf(redisClientTemplate
					.get(this.setnxPrefix + dataId));
			// 超时
			if (oldValue < System.currentTimeMillis()) {
				String getValue = redisClientTemplate.getSet(this.setnxPrefix
						+ dataId, String.valueOf(value));
				// 获取锁成功
				if (Long.valueOf(getValue) == oldValue)
					success = true;
				// 已被其他进程捷足先登了
				else
					success = false;
			}
			// 未超时，则直接返回失败
			else
				success = false;
		}
		return success;
	}

	/**
	 * 更新redis数据规则
	 * 
	 * @param key
	 * @param action
	 * @param value
	 * @param collection_
	 */
	private void updateDataContent(String key, String action, String value,
			String collection_) {
		if (null != redisClientTemplate.hget(key, "content")
				&& "save".equals(action)) {
			// 如果是"save"操作，数据不更新，以redis为准
		} else {
			redisClientTemplate.hset(key, "content", value);
		}
		redisClientTemplate.hset(key, "collection", collection_);
		redisClientTemplate.hset(key, "action", action);
	}

	/**
	 * 生成事务锁<br>
	 * 更新事务数据<br>
	 * 位置：redis<br>
	 * 结构1:{TransactionID，DataID(set)}<br>
	 * 结构2::{DataID，DataContent(Hash)}<br>
	 * DataContent(hash):<br>
	 * {<br>
	 * content : 数据<br>
	 * collection: collection名<br>
	 * }<br>
	 * 
	 * @param transactionId
	 *            事务ID
	 * @param collection_
	 *            collection名
	 * @param contentMap
	 *            k:dataID , v: content
	 */
	public boolean updateTransactionData(String transactionId,
			String collection_, Map<String, String> contentMap, String action) {
		try {
			cleanData(transactionId, contentMap);
			for (String key : contentMap.keySet()) {
				/**
				 * 生成事务锁
				 */
				if (!acquireTransactionLock(key))
					return false;
				/**
				 * 结构1:{TransactionID，DataID(set)}
				 */
				redisClientTemplate.sadd(transactionId, key);
				/**
				 * 结构2::{DataID，DataContent(Hash)}<br>
				 * DataContent(hash):<br>
				 * {<br>
				 * content : 数据<br>
				 * collection: collection名<br>
				 * }<br>
				 */
				this.updateDataContent(key, action, contentMap.get(key),
						collection_);
			}
			logger.info(transactionId + "上锁成功");
		} catch (Exception e) {
			logger.error(transactionId + "上锁失败", e);
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * 分布上锁<br>
	 * 更新数据<br>
	 * 如果是"save"操作，数据不更新，以redis为准
	 * 
	 * @param transactionId
	 * @param contentMap
	 * @return
	 */
	public boolean updateTransactionDataByStep_GetDataLock(
			String transactionId, String collection_,
			Map<String, String> contentMap, String action) {

		try {
			for (String key : contentMap.keySet()) {
				/**
				 * 结构2::{DataID，DataContent(Hash)}<br>
				 * DataContent(hash):<br>
				 * {<br>
				 * content : 数据<br>
				 * collection: collection名<br>
				 * }<br>
				 */
				this.updateDataContent(key, action, contentMap.get(key),
						collection_);
			}
			logger.info(transactionId + "更新数据成功");
		} catch (Exception e) {
			logger.error(transactionId + "更新数据失败", e);
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * 分布上锁<br>
	 * 生成事务锁<br>
	 * 
	 * @param transactionId
	 * @param contentMap
	 * @return
	 */
	public boolean updateTransactionDataByStep_GetLock(String transactionId,
			Map<String, String> contentMap) {
		try {
			for (String key : contentMap.keySet()) {
				/**
				 * 生成事务锁
				 */
				if (!acquireTransactionLock(key))
					return false;
				/**
				 * 将数据添加到事务结构中 结构1:{TransactionID，DataID(set)}
				 */
				redisClientTemplate.sadd(transactionId, key);
			}
			logger.info(transactionId + "上锁成功");
		} catch (Exception e) {
			logger.error(transactionId + "上锁失败", e);
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * 释放锁,并释放所有数据<br>
	 * 结构1:{TransactionID，DataID(set)}<br>
	 * 结构2::{DataID，DataContent(Hash)}<brupdateTransactionDataByStep_GetLock>
	 * SETNX数据<br>
	 *
	 * @param lock
	 */
	public void releaseLock(String transactionId) {
		// long current = System.currentTimeMillis();
		// // 避免删除非自己获取得到的锁updateTransactionDataByStep_GetLock
		// if (current < Long.valueOf(redisClientTemplate.get(lock)))
		Set<String> idSet = redisClientTemplate.smembers(transactionId);
		for (String strId : idSet) {
			// 结构2::{DataID，DataContent(Hash)}
			redisClientTemplate.del(strId);
			// SETNX数据
			redisClientTemplate.del(this.setnxPrefix + strId);
		}
		// 结构1:{TransactionID，DataID(set)updateTransactionDataByStep_GetLock}
		redisClientTemplate.del(transactionId);
	}

	/**
	 * 检查重复数据
	 * 
	 * @author jp
	 * **/
	public Boolean sismember(String transactionId, String key) {
		return redisClientTemplate.sismember(transactionId, key);
	}

	/**
	 * 清洗数据，避免覆盖redis中Id相同的数据
	 * 
	 * @author jp
	 * **/
	private void cleanData(String transactionId, Map<String, String> contentMap) {
		for (String key : contentMap.keySet()) {
			if (redisClientTemplate.sismember(transactionId, key)) {
				contentMap.remove(key);
			}
		}
	}

}

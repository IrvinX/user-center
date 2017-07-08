package org.spring.cloud.redis.services;

import java.util.List;
import java.util.Set;

import org.spring.cloud.redis.repositories.RedisClientTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedisSyncLock {
	@Autowired
	private RedisClientTemplate redisClientTemplate;

	static int expired = 5000;// TODO

	/**
	 * 获取数据锁
	 * 
	 * @param lock
	 * @return
	 */
	public boolean acquireLock(String lock) {
		// 1. 通过SETNX试图获取一个lock
		boolean success = false;
		long value = System.currentTimeMillis() + expired + 1;
		long acquired = redisClientTemplate.setnx(lock, String.valueOf(value));
		// SETNX成功，则成功获取一个锁
		if (acquired == 1)
			success = true;
		// SETNX失败，说明锁仍然被其他对象保持，检查其是否已经超时
		else {
			long oldValue = Long.valueOf(redisClientTemplate.get(lock));
			// 超时
			if (oldValue < System.currentTimeMillis()) {
				String getValue = redisClientTemplate.getSet(lock,
						String.valueOf(value));
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
	 * 更新transaction中的数据id
	 * 
	 * @param transactionId
	 * @param idList
	 */
	public void updateTransactionLock(String transactionId, List<String> idList) {
		for (String strId : idList) {
			redisClientTemplate.sadd(transactionId, strId);
		}
	}

	/**
	 * 释放锁,并释放所有数据
	 * 
	 * @param lock
	 */
	public void releaseLock(String transactionId) {
		// long current = System.currentTimeMillis();
		// // 避免删除非自己获取得到的锁
		// if (current < Long.valueOf(redisClientTemplate.get(lock)))
		Set<String> idSet = redisClientTemplate.smembers(transactionId);
		for (String strId : idSet) {
			redisClientTemplate.del(strId);
		}
		redisClientTemplate.del(transactionId);
	}

}

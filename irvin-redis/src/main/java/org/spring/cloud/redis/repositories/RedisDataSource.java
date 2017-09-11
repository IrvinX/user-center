/**
 * 
 */
package org.spring.cloud.redis.repositories;

import redis.clients.jedis.ShardedJedis;

/**
 * @author irvin
 *
 */

public interface RedisDataSource {
	public abstract ShardedJedis getRedisClient();

	public void returnResource(ShardedJedis shardedJedis);

	public void returnResource(ShardedJedis shardedJedis, boolean broken);
}

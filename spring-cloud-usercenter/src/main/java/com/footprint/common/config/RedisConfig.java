/**
 * 
 */
package com.footprint.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedisPool;
import org.springframework.cache.interceptor.KeyGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;

import java.util.Arrays;
import java.lang.reflect.Method;

/**
 * @author gaoyu
 *
 */
@Configuration
@EnableCaching
@ComponentScan(basePackages = "org.spring.cloud.redis")
public class RedisConfig extends CachingConfigurerSupport {
	@Value("${spring.redis.database}")
	private int database;
	@Value("${spring.redis.host}")
	private String host;
	@Value("${spring.redis.port}")
	private int port;
	@Value("${spring.redis.password}")
	private String password;
	@Value("${spring.redis.pool.max-active}")
	private int max_active;
	@Value("${spring.redis.pool.max-wait}")
	private int max_wait;
	@Value("${spring.redis.pool.max-idle}")
	private int max_idle;
	@Value("${spring.redis.pool.min-idle}")
	private int min_idle;
	@Value("${spring.redis.timeout}")
	private int timeout;

	@Bean
	public JedisPoolConfig jedisPoolConfig() {
		JedisPoolConfig poolConfig = new JedisPoolConfig();
		poolConfig.setMaxIdle(max_idle);
		poolConfig.setMinIdle(min_idle);
		poolConfig.setMaxWaitMillis(max_wait);
		poolConfig.setTestOnBorrow(true);
		poolConfig.setTestOnReturn(true);
		poolConfig.setTestWhileIdle(true);
		poolConfig.setNumTestsPerEvictionRun(10);
		poolConfig.setTimeBetweenEvictionRunsMillis(timeout);
		return poolConfig;

	}

	@Bean(name = "shardedJedisPool")
	public ShardedJedisPool shardedJedisPool() {
		JedisShardInfo JedisShardInfo = new JedisShardInfo(host, port);
		ShardedJedisPool ShardedJedisPool = new ShardedJedisPool(
				jedisPoolConfig(), Arrays.asList(JedisShardInfo));
		System.out.println("redis host::" + this.host);
		return ShardedJedisPool;
	}

    @Bean
    public JedisConnectionFactory redisConnectionFactory(){
        JedisConnectionFactory redisConnectionFactory = new 
        JedisConnectionFactory();
        redisConnectionFactory.setHostName(host);
        redisConnectionFactory.setPort(port);
        return redisConnectionFactory;
    }

	@Bean
	public KeyGenerator wiselyKeyGenerator(){
		return new KeyGenerator() {
			@Override
			public Object generate(Object target, Method method, Object... params) {
				StringBuilder sb = new StringBuilder();
				sb.append(target.getClass().getName());
				sb.append(method.getName());
				for (Object obj : params) {
					sb.append(obj.toString());
				}
				return sb.toString();
			}
		};

	}
	
//	@Bean
//	public StringRedisTemplate redisTemplate(RedisConnectionFactory cf) {
////		StringRedisTemplate redisTemplate = new StringRedisTemplate(
////				jedisConnectionFactory());
//		StringRedisTemplate redisTemplate = new StringRedisTemplate(cf);
//
//		Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
////		redisTemplate.afterPropertiesSet();
//		redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);
//		redisTemplate.setKeySerializer(new StringRedisSerializer());
//		redisTemplate.setHashKeySerializer(new StringRedisSerializer());
////		redisTemplate.setHashValueSerializer(new HashValueRedisObjectSerializer());
//
//		return redisTemplate;
//	}

	  @Bean
	    public CacheManager cacheManager(RedisTemplate redisTemplate){
	        RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
	        return cacheManager;
	    }

	@Bean
	public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory) {
		StringRedisTemplate template = new StringRedisTemplate(factory);
		Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
		ObjectMapper om = new ObjectMapper();
		om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
		om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
		jackson2JsonRedisSerializer.setObjectMapper(om);
		template.setValueSerializer(jackson2JsonRedisSerializer);
		template.afterPropertiesSet();
		return template;
	}
}

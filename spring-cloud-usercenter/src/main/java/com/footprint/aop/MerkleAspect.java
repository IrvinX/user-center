package com.footprint.aop;

import com.alibaba.fastjson.JSONObject;
import com.footprint.common.merkletree.Merkle;
import com.footprint.common.merkletree.repository.MerkleRepository;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.cloud.redis.repositories.RedisClientTemplate;
import org.spring.cloud.redis.services.RedisClientSync;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Aspect
@Component
public class MerkleAspect {

	private static final Logger logger = LoggerFactory
			.getLogger(MerkleAspect.class);
	@Autowired
	RedisClientSync redisClientSync;
	@Autowired
	MerkleRepository merkleRepository;
	@Autowired
	private RedisClientTemplate redisClientTemplate;

	/**
	 * merkle对比后更新es
	 *
	 * @author Irvin
	 **/
	@AfterReturning(pointcut = "execution( * com.footprint.common.merkletree.service.MerkleService.persistentMerkle(..))", returning = "retVal")
	public void sendUpdateMerkleES(JoinPoint point, Object retVal)
			throws Throwable {
		// 访问目标方法的参数：
		List<String> ids = (List<String>) retVal;
		logger.info("ids.size():" + ids.size());
		if (ids != null && ids.size() > 0)
			// 从redis取出merkle并存入
			merkleRepository.save(new ArrayList<Merkle>() {
				{
					for (String id : ids) {
						add(JSONObject.parseObject(redisClientTemplate.get(id),
								Merkle.class));
					}
				}
			});
	}

	/**
	 * merkle对比后更新es
	 *
	 * @author Irvin
	 **/
	@AfterReturning(pointcut = "execution( * com.footprint.common.merkletree.service.MerkleService.save(..))", returning = "retVal")
	public void sendSaveMerkleES(JoinPoint point, Object retVal)
			throws Throwable {
		// 访问目标方法的参数：
		ArrayList<Merkle> merkles = (ArrayList<Merkle>) retVal;
		logger.info("merkles.size():" + merkles.size());
		for (Merkle merkle : merkles) {
			merkleRepository.save(merkle);
		}
	}

	/**
	 * 回滚处理
	 *
	 * @author Irvin
	 **/
	@AfterThrowing(throwing = "ex", pointcut = "execution( * com.footprint.common.merkletree.service.MerkleService.persistentMerkle(..))")
	public void rollBackUpdateMerkleES(Exception ex) throws Throwable {
		logger.info("****" + ex.getMessage() + ",Start to RollBack! ****");
	}
}

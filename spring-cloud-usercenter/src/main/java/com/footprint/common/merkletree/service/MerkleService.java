package com.footprint.common.merkletree.service;

import com.alibaba.fastjson.JSON;
import com.footprint.common.merkletree.Merkle;
import com.footprint.common.merkletree.repository.MerkleRepository ;
import jmerkle.sequential.JMerkle;
import jmerkle.sequential.JMerkleAlterable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.cloud.redis.repositories.RedisClientTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 
 *
 * @author:Irvin
 * @time:2017年7月4日 下午3:43:36
 */
@Service
public class MerkleService {
	private static final Logger logger = LoggerFactory
			.getLogger(MerkleService.class);
	@Autowired
	MerkleRepository merkleRepository;
	@Autowired
	private RedisClientTemplate redisClientTemplate;

	/**
	 * merker持久化<br>
	 * 先插入redis,然后aop插入elasticsearch<br>
	 * aop @link com.footprint.aop.MerkleAspect.sendSaveMerkleES
	 *
	 * @Description:
	 * @param merkles
	 *            void
	 * @exception:
	 * @author: Irvin
	 * @time:2017年7月4日 下午2:03:51
	 */
	public ArrayList<Merkle> save(ArrayList<Merkle> merkles) {
		for (Merkle merkle : merkles) {
			redisClientTemplate.set(merkle.getKey(), JSON.toJSONString(merkle));
		}

		return merkles;
	}

	/**
	 * 根据type查询merkle
	 *
	 * @param type
	 * @param page
	 * @param size
	 * @return
	 */
	public List<Merkle> findByType(String type,int page,
			int size) {
		return merkleRepository.findByType(type,new PageRequest(page, size)).getContent();
	}

	/**
	 * merkle变更比对
	 *
	 * @Description:
	 * @param Merkles
	 * @return List<String>
	 * @exception:
	 * @author: Irvin
	 * @time:2017年7月4日 下午2:05:05
	 */
	private List<String> merkleCompare(ArrayList<Merkle> Merkles) {
		List<String> ids = new ArrayList<String>();
		for (Merkle merkle : Merkles) {
			ids.add(merkle.getKey());
		}
		return JMerkle.diff(
				JMerkle.alter(null, new ArrayList<JMerkleAlterable>() {

					/**
					 *
					 * @author:Irvin
					 * @time:2017年7月4日 下午3:36:39
					 */
					private static final long serialVersionUID = 969953512891328802L;

					{
						addAll((Collection<? extends JMerkleAlterable>) merkleRepository
								.findAll(ids));
					}
				}), JMerkle.alter(null, new ArrayList<JMerkleAlterable>() {

					/**
					 *
					 * @author:Irvin
					 * @time:2017年7月4日 下午3:36:47
					 */
					private static final long serialVersionUID = -5605102800966094955L;

					{
						addAll(Merkles);
					}
				}));
	}

	/**
	 * merkle持久化<br>
	 * aop @link com.footprint.aop.MerkleAspect.sendUpdateMerkleES
	 *
	 * @Description:
	 * @param merkles
	 *            void
	 * @exception:
	 * @author: Irvin
	 * @time:2017年7月4日 下午2:14:02
	 */
	public List<String> persistentMerkle(ArrayList<Merkle> merkles) {
		// 比对变更
		List<String> ids = this.merkleCompare(merkles);
		// 变更全部存入缓存
		for (Merkle merkle : merkles) {
			if (ids.contains(merkle.getKey())) {
				logger.info("merkle.getId():" + merkle.getKey());
				redisClientTemplate.set(merkle.getKey(),
						JSON.toJSONString(merkle));
			}
		}
		return ids;
	}
}

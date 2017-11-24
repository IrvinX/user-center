package irvin.uc.common.aop;

import irvin.api.bussiness.domain.Event;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.cloud.redis.repositories.RedisClientTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * @author irvin
 * @date Create in 下午5:06 2017/11/14
 * @description
 */
@Service
public class RollBack {
    private static final Logger logger = LoggerFactory.getLogger(RollBack.class);
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private RedisClientTemplate redisClientTemplate;
    private String prefix = "prev_";

    /**
     * 从mongodb中取数据，等待回滚 <br>
     * TODO 如果取出list长度为0，说明是insert操作，是否可以直接采用best effort 1 pc
     *
     * @param dataId
     * @param collection
     * @return
     */
    private List<String> getDataFromDB(String dataId, long version, String collection) {
        Criteria criteria = Criteria.where("id").is(dataId).and("version").is(version);
        Query query = new Query(criteria);
        return mongoTemplate.find(query, String.class, collection);
    }

    /**
     * 从mongodb中取出数据，作为回滚日志存储到redis中
     *
     * @param events
     */
    public boolean generateRollBackLog(List<Event> events) {
        String transactionID = events.get(0).getTransactionId();
        try {
            // 分别取出每个collect中的content，准备回滚用
            for (Event event : events) {
                String collection = event.getCollection();
                String dataId = event.getDataId();
                long version = event.getVersion();
                logger.debug("----> @Around：dataID:{}", dataId);
                logger.debug("----> @Around：collection:{}", collection);
                logger.debug("----> @Around：content:{}", redisClientTemplate.hget(dataId, "content"));
                List<String> contentList = getDataFromDB(dataId, version, collection);
                if (null == contentList)
                    continue;
                logger.debug("collection_" + collection);
                logger.debug("contentList.size()" + contentList.size());
                if (contentList.size() > 0) {
                    // 记录collection_名
                    redisClientTemplate.hset(prefix + transactionID, "collection_", collection);
                    for (String content : contentList) {
                        // 记录content
                        redisClientTemplate.sadd(transactionID + "_" + collection, content);
                    }
                }
            }
        } catch (Exception e) {
            logger.error(transactionID + "取出回滚数据失败", e);
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * 删除日志
     *
     * @param collections
     * @param transactionID
     * @return
     */
    public boolean removeRollBackLog(Set<String> collections, String transactionID) {
        try {
            collections.forEach(collection -> redisClientTemplate.del(transactionID + "_" + collection));
            redisClientTemplate.del(prefix + transactionID);
        } catch (Exception e) {
            logger.error(transactionID + "取出回滚数据失败", e);
            e.printStackTrace();
            return false;
        }
        return true;
    }
}

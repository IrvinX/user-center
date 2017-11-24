package irvin.uc.service.basic;

import com.alibaba.fastjson.JSON;
import irvin.api.bussiness.domain.Event;
import org.spring.cloud.redis.repositories.RedisClientTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author irvin
 * @date Create in 上午11:32 2017/11/15
 * @description
 */
@Service
public class RedisService {

    @Autowired
    RedisClientTemplate redisClientTemplate;

    /**
     * 数据信息保存到 redis
     *
     * @param record
     * @param events
     * @param <T>
     */
    public <T> void persistentDataInfo(T record, List<Event> events) {

        events.forEach(event -> {
            /* 保存对象信息 */
            redisClientTemplate.hset(event.getDataId(), "collection", String.valueOf(event.getCollection()));
            redisClientTemplate.hset(event.getDataId(), "action", String.valueOf(event.getAction()));
            redisClientTemplate.hset(event.getDataId(), "content", JSON.toJSONString(record));

            /* 保存事务包含对象 */
            redisClientTemplate.sadd(event.getTransactionId(), event.getDataId());
        });

    }

    public <T> void persistentDataInfo(T record, Event event) {

        persistentDataInfo(record, new ArrayList<Event>() {
            {
                add(event);
            }
        });

    }
}

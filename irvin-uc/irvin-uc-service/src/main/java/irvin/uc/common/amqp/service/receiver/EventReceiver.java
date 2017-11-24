/**
 *
 */
package irvin.uc.common.amqp.service.receiver;

import irvin.api.bussiness.domain.Event;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.cloud.redis.repositories.RedisClientTemplate;
import org.spring.cloud.redis.services.RedisClientSync;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * 数据同步消费者
 */
@Component
@RabbitListener(queues = "queue.uc.event")
public class EventReceiver {

    private static final Logger logger = LoggerFactory.getLogger(EventReceiver.class);
    @Autowired
    RedisClientTemplate redisClientTemplate;
    @Autowired
    RedisClientSync redisClientSync;

    /**
     * @param event
     * @return
     */
    @RabbitHandler
    public Event process(Event event) {

        String transactionId = UUID.randomUUID().toString();

        logger.info("[x]MESSAGE BROKER receiver,EventClass:" + event.getCollection() + ",transactionId:" + transactionId);

        // 服务类
        String collection = event.getCollection();
        // 方法
        int action = event.getAction();
        Event rtn = new Event();
        try {
            Set<String> dataSet = redisClientTemplate.smembers(event.getTransactionId());
            // 异常处理
            if (null == dataSet)
                return null;

            // mongo db的原始数据,k :collection_ v:dataIdList
            HashMap<String, List<String>> orgDataMap = new HashMap<>();
            //TODO
//            commit(evt.getTransactionId(),dataSet,orgDataMap);
        } catch (Exception e) {
            // TODO 回滚操作
            e.printStackTrace();
        }
        // this.transactionDao.delete(transactionId);
        return rtn;
    }
}

package irvin.uc.common.util;

import irvin.api.bussiness.domain.Event;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author irvin
 * @date Create in 上午9:41 2017/11/15
 * @description
 */
@Component
public class EventGenerator {

    @Autowired
    IDGenerator idGenerator;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 构建 Event
     *
     * @param record  数据
     * @param dataId  数据 id
     * @param version 数据版本号
     * @param action  数据操作类型
     * @param domain  所属领域(消息队列名)
     * @param <T>     数据类型
     * @return Event
     */
    public <T> Event generator(T record, String dataId, long version, int action, String domain) {
        return generator(idGenerator.idGenerator(), record, dataId, version, action, domain);
    }

    /**
     * 构建 Event
     *
     * @param transactionId 事务 id
     * @param record        数据
     * @param dataId        数据 id
     * @param version       数据版本号
     * @param action        数据操作类型
     * @param domain        所属领域(消息队列名)
     * @param <T>           数据类型
     * @return Event
     */
    public <T> Event generator(String transactionId, T record, String dataId, long version, int action, String domain) {
        if (null == transactionId || transactionId.isEmpty())
            return generator(record, dataId, version, action, domain);
        Event event = new Event();
        event.setDataId(dataId);
        event.setVersion(version);
        event.setCollection(record.getClass().getName());
        event.setTransactionId(transactionId);
        event.setAction(action);
        event.setDomain(domain);
        return event;
    }
}

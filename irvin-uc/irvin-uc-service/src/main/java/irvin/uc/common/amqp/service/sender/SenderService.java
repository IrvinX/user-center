package irvin.uc.common.amqp.service.sender;

import irvin.api.bussiness.domain.Event;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author irvin
 * @date Create in 下午7:34 2017/11/14
 * @description MQ生产者
 */
@Component
public class SenderService {
    @Autowired
    private AmqpTemplate amqpTemplate;
//    @Value("${spring.rabbit.exchange}")
//    public String spring_rabbit_exchange;

    /**
     * 消息队列sender
     *
     * @param evt
     * @param queueName
     * @return
     */
    public Event messageSendAndReceive(Event evt, String queueName) {
        return (Event) this.amqpTemplate.convertSendAndReceive(queueName, evt);
    }
}

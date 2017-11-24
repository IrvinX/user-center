//package irvin.uc.common.config;
//
////import com.footprint.cloud.zookeeper.amqp.service.receiver.MSEventReceiver;
//import org.springframework.amqp.core.AcknowledgeMode;
//import org.springframework.amqp.rabbit.annotation.EnableRabbit;
//import org.springframework.amqp.rabbit.annotation.RabbitListenerConfigurer;
//import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
//import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
//import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;
//import org.springframework.amqp.support.converter.ContentTypeDelegatingMessageConverter;
//import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
//import org.springframework.amqp.support.converter.MessageConverter;
//import org.springframework.amqp.support.converter.SimpleMessageConverter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.messaging.converter.MappingJackson2MessageConverter;
//import org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory;
//
///**
// * AMQP消费者配置
// */
//@Configuration
//@EnableRabbit
//public class RabbitConsConfig implements RabbitListenerConfigurer {
//	@Autowired
//	private CachingConnectionFactory cachingConnectionFactory;
//
//	@Value("${concurrent.consumers}")
//	public int concurrent_consumers;
//
//	@Value("${max.concurrent.consumers}")
//	public int max_concurrent_consumers;
//	@Value("${receive.timeout}")
//	public long receive_timeout;
//
////	@Autowired
////	MSEventReceiver receiverService;
//
//	@Bean
//	public DefaultMessageHandlerMethodFactory myHandlerMethodFactory() {
//		DefaultMessageHandlerMethodFactory factory = new DefaultMessageHandlerMethodFactory();
//		factory.setMessageConverter(new MappingJackson2MessageConverter());
//		return factory;
//	}
//
//	@Bean
//	public SimpleRabbitListenerContainerFactory rabbitListenerContainerFactory() {
//		SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
//		factory.setConnectionFactory(this.cachingConnectionFactory);
//		factory.setReceiveTimeout(this.receive_timeout);
//		factory.setConcurrentConsumers(this.concurrent_consumers);
//		factory.setMaxConcurrentConsumers(this.max_concurrent_consumers);
//		factory.setMessageConverter(consumerMessageConverter());
//		// factory.setPrefetchCount(5);
//		factory.setAcknowledgeMode(AcknowledgeMode.AUTO);
//		return factory;
//	}
//
//	/**
//	 * message converter<br>
//	 * 支持文本和json
//	 *
//	 * @return
//	 */
//	@Bean
//	public MessageConverter consumerMessageConverter() {
//		ContentTypeDelegatingMessageConverter messageConverter = new ContentTypeDelegatingMessageConverter();
//		messageConverter.addDelgate("application/json",
//				new Jackson2JsonMessageConverter());
//		messageConverter.addDelgate("text/plain", new SimpleMessageConverter());
//		return messageConverter;
//	}
//
//	@Override
//	public void configureRabbitListeners(
//			RabbitListenerEndpointRegistrar registrar) {
//		registrar.setMessageHandlerMethodFactory(myHandlerMethodFactory());
//	}
//}

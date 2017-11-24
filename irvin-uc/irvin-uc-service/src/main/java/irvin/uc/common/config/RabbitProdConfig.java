//package irvin.uc.common.config;
//
//import org.springframework.amqp.core.Queue;
//import org.springframework.amqp.core.TopicExchange;
//import org.springframework.amqp.rabbit.annotation.EnableRabbit;
//import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
//import org.springframework.amqp.rabbit.connection.ConnectionFactory;
//import org.springframework.amqp.rabbit.core.RabbitAdmin;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// *
// */
//@Configuration
//@EnableRabbit
//public class RabbitProdConfig {
//	@Autowired
//	private CachingConnectionFactory cachingConnectionFactory;
//
//	@Value("${concurrent.consumers}")
//	public int concurrent_consumers;
//
//	@Value("${max.concurrent.consumers}")
//	public int max_concurrent_consumers;
//
//	@Value("${receive.timeout}")
//	public long receive_timeout;
//
//	@Value("${spring.rabbit.exchange}")
//	public String spring_rabbit_exchange;
//
//	@Bean
//    TopicExchange exchange(RabbitAdmin rabbitAdmin) {
//		TopicExchange topicExchange = new TopicExchange(
//				this.spring_rabbit_exchange);
//		rabbitAdmin.declareExchange(topicExchange);
//		return topicExchange;
//	}
//
//	@Bean
//    RabbitAdmin rabbitAdmin(ConnectionFactory connectionFactory) {
//		return new RabbitAdmin(connectionFactory);
//	}
//
//	/**
//	 * 前置校验队列
//	 *
//	 * @return
//	 */
//	@Bean
//	public Queue checkQueue() {
//		Map<String, Object> args = new HashMap<String, Object>();
//		args.put("x-message-ttl", this.receive_timeout);
//		return new Queue("queue.check", false, false, false, args);
//	}
//
//	/**
//	 * 文件处理队列
//	 *
//	 * @return
//	 */
//	@Bean
//	public Queue fileQueue() {
//		Map<String, Object> args = new HashMap<String, Object>();
//		args.put("x-message-ttl", this.receive_timeout);
//		return new Queue("queue.file", false, false, false, args);
//	}
//
//	/**
//	 * 数据同步队列
//	 *
//	 * @return
//	 */
//	@Bean
//	public Queue syncQueue() {
//		Map<String, Object> args = new HashMap<String, Object>();
//		args.put("x-message-ttl", this.receive_timeout);
//		return new Queue("sync", false, false, false, args);
//	}
//
//	/**
//	 * 日志队列
//	 *
//	 * @return
//	 */
//	@Bean
//	public Queue logQueue() {
//		Map<String, Object> args = new HashMap<String, Object>();
//		args.put("x-message-ttl", this.receive_timeout);
//		return new Queue("log", false, false, false, args);
//	}
//
//	/**
//	 * ES处理队列
//	 *
//	 * @return
//	 */
//	@Bean
//	public Queue esQueue() {
//		Map<String, Object> args = new HashMap<String, Object>();
//		args.put("x-message-ttl", this.receive_timeout);
//		return new Queue("queue.es", false, false, false, args);
//	}
//	/**
//	 * ReturnModel处理队列
//	 *
//	 * @return
//	 */
//	@Bean
//	public Queue returnModelQueue() {
//		Map<String, Object> args = new HashMap<String, Object>();
//		args.put("x-message-ttl", this.receive_timeout);
//		return new Queue("queue.returnmodel", false, false, false, args);
//	}
//
//	/**
//	 * BOEvnet处理队列
//	 *
//	 * @return
//	 */
//	@Bean
//	public Queue boEventQueue() {
//		Map<String, Object> args = new HashMap<String, Object>();
//		args.put("x-message-ttl", this.receive_timeout);
//		return new Queue("queue.boevent", false, false, false, args);
//	}
//
//
//	/**
//	 * 回滚队列
//	 *
//	 * @return
//	 */
//	@Bean
//	public Queue rollbackQueue() {
//		Map<String, Object> args = new HashMap<String, Object>();
//		args.put("x-message-ttl", this.receive_timeout);
//		return new Queue("rollback", false, false, true, args);
//	}
//
//	/**
//	 * 缓存队列
//	 *
//	 * @return
//	 */
//	@Bean
//	public Queue cacheQueue() {
//		return new Queue("cache");
//	}
//
//
//	// @Bean
//	// public SimpleRabbitListenerContainerFactory
//	// rabbitListenerContainerFactory() {
//	// SimpleRabbitListenerContainerFactory factory = new
//	// SimpleRabbitListenerContainerFactory();
//	// factory.setConnectionFactory(this.cachingConnectionFactory);
//	// factory.setReceiveTimeout(this.receive_timeout);
//	// factory.setConcurrentConsumers(this.concurrent_consumers);
//	// factory.setMaxConcurrentConsumers(this.max_concurrent_consumers);
//	// factory.setMessageConverter(jsonMessageConverter());
//	// return factory;
//	// }
//
//	// @Bean
//	// public MessageConverter jsonMessageConverter() {
//	// final Jackson2JsonMessageConverter converter = new
//	// Jackson2JsonMessageConverter();
//	// return converter;
//	// }
//}

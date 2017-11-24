//package irvin.uc.common.config;
//
//import com.mongodb.*;
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.NoSuchBeanDefinitionException;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.AutoConfigureAfter;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.data.convert.ReadingConverter;
//import org.springframework.data.mongodb.MongoDbFactory;
//import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
//import org.springframework.data.mongodb.core.convert.*;
//import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
//
//import java.net.UnknownHostException;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Date;
//import java.util.List;
//
///**
// * The Mongo configuration class for this Spring Data MongoDB application.
// */
//@Configuration
//@ConditionalOnClass({ Mongo.class, MongoTemplate.class })
//@AutoConfigureAfter(MongoConfig.class)
//public class MongoConfig extends AbstractMongoConfiguration {
//
//	@Value("${spring.data.mongodb.host}")
//	private String host;
//
//	@Value("${spring.data.mongodb.port}")
//	private Integer port;
//
//	@Value("${spring.data.mongodb.user}")
//	private String user;
//	@Value("${spring.data.mongodb.authentication-database}")
//	private String authdatabase;
//	@Value("${spring.data.mongodb.basename}")
//	private String basename;
//	@Value("${spring.data.mongodb.password}")
//	private String password;
//
//	@Override
//	@Bean
//	public MongoClient mongo() throws Exception {
//		MongoCredential credential = MongoCredential.createScramSha1Credential(
//				user, authdatabase, password.toCharArray());
//		System.out.println("mongo test::" + host + "::" + authdatabase + "::" + basename);
//		return new MongoClient(new ServerAddress(host, port),
//				Arrays.asList(credential));
//	}
//
//	@Bean
//	@ConditionalOnMissingBean(MongoDbFactory.class)
//	public SimpleMongoDbFactory mongoDbFactory(MongoClient mongo)
//			throws Exception {
//		return new SimpleMongoDbFactory(mongo(), getMongoClientDatabase());
//	}
//
//	@Bean
//	@ConditionalOnMissingBean
//	public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory,
//			MongoConverter converter) throws UnknownHostException {
//		return new MongoTemplate(mongoDbFactory, converter);
//	}
//
//	@Bean
//	@ConditionalOnMissingBean(MongoConverter.class)
//	public MappingMongoConverter mappingMongoConverter(MongoDbFactory factory,
//			MongoMappingContext context, BeanFactory beanFactory) {
//		DbRefResolver dbRefResolver = new DefaultDbRefResolver(factory);
//		MappingMongoConverter mappingConverter = new MappingMongoConverter(
//				dbRefResolver, context);
//		try {
//			mappingConverter.setCustomConversions(customConversions());
//			// remove _class
//			mappingConverter.setTypeMapper(new DefaultMongoTypeMapper(null));
//		} catch (NoSuchBeanDefinitionException ex) {
//			// Ignore
//		}
//		return mappingConverter;
//	}
//
//	@Override
//	public String getDatabaseName() {
//		return basename;
//	}
//
//	@Bean
//	@Override
//	public CustomConversions customConversions() {
//		List<Converter<?, ?>> converterList = new ArrayList<Converter<?, ?>>();
//		converterList.add(new LongToDateTimeConverter());
//		converterList.add(new StringToDateTimeConverter());
//		return new CustomConversions(converterList);
//	}
//
//	@ReadingConverter
//	static class LongToDateTimeConverter implements Converter<Long, Date> {
//
//		@Override
//		public Date convert(Long source) {
//			if (source == null) {
//				return null;
//			}
//
//			return new Date(source);
//		}
//	}
//
//	@ReadingConverter
//	static class StringToDateTimeConverter implements Converter<String, Date> {
//
//		@Override
//		public Date convert(String source) {
//			if (source == null) {
//				return null;
//			}
//
//			return new Date(source);
//		}
//	}
//
//	public String getMongoClientDatabase() {
//		if (this.basename != null) {
//			return this.basename;
//		}
//		return new MongoClientURI(this.host).getDatabase();// TODO
//	}
//}

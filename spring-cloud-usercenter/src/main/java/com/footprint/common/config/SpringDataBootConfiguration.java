package com.footprint.common.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import javax.annotation.PostConstruct;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.footprint")
@ComponentScan("com.footprint")
public class SpringDataBootConfiguration {
	private static final Logger log = LoggerFactory
			.getLogger(SpringDataBootConfiguration.class);

	@PostConstruct
	protected void iamAlive() {
		log.info("@PostConstruct " + this.getClass().getName());
	}

}

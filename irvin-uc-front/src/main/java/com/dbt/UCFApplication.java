package com.dbt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * @author irvin
 * @date Create in 下午13:30 2017/9/11
 * @description Spring Boot Eureka Server 应用启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UCFApplication {

	public static void main(String[] args) {
		SpringApplication.run(UCFApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}

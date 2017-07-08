package com.footprint;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by gaofang on 2017/7/4.
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableCaching
@MapperScan("com.footprint.common.dao")
public class UserCenterApplication {

	public static void main(String[] args){
		SpringApplication.run(UserCenterApplication.class, args);
	}

}

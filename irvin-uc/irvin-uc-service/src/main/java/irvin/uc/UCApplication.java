package irvin.uc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author irvin
 * @date Create in 下午15:05 2017/9/11
 * @description Spring Boot Eureka Server 应用启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("irvin.uc.dao")
public class UCApplication {

	public static void main(String[] args) {
		SpringApplication.run(UCApplication.class, args);
	}

}

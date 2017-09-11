package irvin.uc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author irvin
 * @date Create in 下午15:05 2017/9/11
 * @description Spring Boot Eureka Server 应用启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
public class IrvinUCApplication {

	public static void main(String[] args) {
		SpringApplication.run(IrvinUCApplication.class, args);
	}

}

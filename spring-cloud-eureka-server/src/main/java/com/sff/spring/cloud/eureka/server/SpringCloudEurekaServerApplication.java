package com.sff.spring.cloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka 注册中心启动类
 */
@SpringBootApplication
@EnableEurekaServer    //eurake 服务中心
public class SpringCloudEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaServerApplication.class, args);
	}

}

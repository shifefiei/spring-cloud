package com.sff.spring.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudConsumerDept8080 {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsumerDept8080.class, args);
	}

}

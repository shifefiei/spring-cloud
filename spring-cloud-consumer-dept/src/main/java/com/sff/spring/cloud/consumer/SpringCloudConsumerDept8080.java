package com.sff.spring.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudConsumerDept8080 {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsumerDept8080.class, args);
	}

}

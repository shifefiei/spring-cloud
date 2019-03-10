package com.sff.spring.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//启用 feign
@EnableFeignClients
public class SpringCloudConsumerDeptFeign8080 {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerDeptFeign8080.class, args);
    }

}

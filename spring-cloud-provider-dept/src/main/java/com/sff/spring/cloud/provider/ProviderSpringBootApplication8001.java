package com.sff.spring.cloud.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan(value = "com.sff.spring.cloud.provider.dao")
@SpringBootApplication
@EnableEurekaClient     //eureka 服务注册
@EnableDiscoveryClient  //服务发现
public class ProviderSpringBootApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(ProviderSpringBootApplication8001.class,args);
    }

}

package com.sff.spring.cloud.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan(value = "com.sff.spring.cloud.provider.dao")
@SpringBootApplication
@EnableEurekaClient     //将当前的服务 dept 注册到 eureka 服务中心
@EnableDiscoveryClient  //服务发现
public class ProviderSpringBootApplication8002 {

    public static void main(String[] args) {
        SpringApplication.run(ProviderSpringBootApplication8002.class,args);
    }

}

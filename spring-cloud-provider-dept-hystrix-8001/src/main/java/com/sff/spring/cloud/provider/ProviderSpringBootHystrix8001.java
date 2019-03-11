package com.sff.spring.cloud.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@MapperScan(value = "com.sff.spring.cloud.provider.dao")
@SpringBootApplication
@EnableEurekaClient     //将当前的服务 dept 注册到 eureka 服务中心
@EnableDiscoveryClient  //服务发现
@EnableHystrix     //启用熔断器
public class ProviderSpringBootHystrix8001 {

    public static void main(String[] args) {
        SpringApplication.run(ProviderSpringBootHystrix8001.class,args);
    }

}

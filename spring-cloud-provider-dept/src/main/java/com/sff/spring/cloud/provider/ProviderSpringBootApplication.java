package com.sff.spring.cloud.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.sff.spring.cloud.provider.dao")
@SpringBootApplication
public class ProviderSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderSpringBootApplication.class,args);
    }

}

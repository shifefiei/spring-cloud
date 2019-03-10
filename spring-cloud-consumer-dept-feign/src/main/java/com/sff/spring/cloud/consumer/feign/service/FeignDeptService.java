package com.sff.spring.cloud.consumer.feign.service;

import com.sff.spring.cloud.api.Dept;
import com.sff.spring.cloud.consumer.config.FeignServiceConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 微服务rest地址一定要写全，写对
 */
@FeignClient(value = "SPRING-CLOUD-PROVIDER-DEPT", configuration = FeignServiceConfig.class)
public interface FeignDeptService {

    @GetMapping("/cloud/dept/list")
    List<Dept> queryAll();

}

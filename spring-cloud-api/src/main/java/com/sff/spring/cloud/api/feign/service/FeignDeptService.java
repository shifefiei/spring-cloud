package com.sff.spring.cloud.api.feign.service;

import com.sff.spring.cloud.api.config.FeignServiceConfig;
import com.sff.spring.cloud.api.entity.Dept;
import com.sff.spring.cloud.api.hystrix.DeptServiceFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 微服务rest地址一定要写全，写对
 */
//@FeignClient(value = "SPRING-CLOUD-PROVIDER-DEPT", configuration = FeignServiceConfig.class)
@FeignClient(value = "SPRING-CLOUD-PROVIDER-DEPT", configuration = FeignServiceConfig.class,
        fallbackFactory = DeptServiceFactory.class)  //利用面向切面编程思想，将所有的熔断处理放在一个类中，而不用每个
public interface FeignDeptService {

    @GetMapping("/cloud/dept/list")
    List<Dept> queryAll();

}

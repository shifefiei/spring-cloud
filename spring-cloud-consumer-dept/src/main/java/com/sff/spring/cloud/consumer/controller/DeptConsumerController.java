package com.sff.spring.cloud.consumer.controller;

import com.sff.spring.cloud.api.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {

    //只支持单机模式下可直接通过ip访问
    //private static final String REST_URL_PREFIX = "http://localhost:8001";

    /**
     * 微服务名称：SPRING-CLOUD-PROVIDER-DEPT，在集群模式下通过服务暴露的名称来访问
     */
    private static final String REST_URL_PREFIX = "http://SPRING-CLOUD-PROVIDER-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get")
    public List<Dept> consumer() {

        System.out.println("--------------------------------------");
        return restTemplate.getForObject(REST_URL_PREFIX+"/cloud/dept/list",List.class);
    }

}

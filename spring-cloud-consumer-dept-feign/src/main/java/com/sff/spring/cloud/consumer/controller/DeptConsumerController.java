package com.sff.spring.cloud.consumer.controller;

import com.sff.spring.cloud.api.Dept;
import com.sff.spring.cloud.consumer.feign.service.FeignDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {

    @Autowired
    private FeignDeptService feignDeptService;

    @GetMapping("/list")
    public List<Dept> query() {
        System.out.println("//////////////////");
        return feignDeptService.queryAll();
    }

}

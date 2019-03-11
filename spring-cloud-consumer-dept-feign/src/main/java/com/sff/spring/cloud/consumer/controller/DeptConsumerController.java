package com.sff.spring.cloud.consumer.controller;

import com.sff.spring.cloud.api.entity.Dept;
import com.sff.spring.cloud.api.feign.service.FeignDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

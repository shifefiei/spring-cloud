package com.sff.spring.cloud.consumer.controller;

import com.sff.spring.cloud.api.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get")
    public List<Dept> consumer() {

        return restTemplate.getForObject(REST_URL_PREFIX+"/cloud/dept/list",List.class);
    }

}

package com.sff.spring.cloud.provider.controller;

import com.sff.spring.cloud.api.Dept;
import com.sff.spring.cloud.provider.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cloud/dept02")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/list")
    public List<Dept> queryAll() {
        return deptService.selectAll();
    }

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/dis")
    public Object discovery() {
        List<String> serviceLists = discoveryClient.getServices();

        System.out.println(serviceLists);

        List<ServiceInstance> instanceList = discoveryClient.getInstances("provider-server-dept");
        instanceList.forEach((ServiceInstance item) ->
                System.out.print(item.getHost() + "," + item.getUri() + "," + item.getPort()));
        return discoveryClient;
    }
}

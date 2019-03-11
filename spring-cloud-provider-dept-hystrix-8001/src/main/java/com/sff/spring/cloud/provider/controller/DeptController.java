package com.sff.spring.cloud.provider.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sff.spring.cloud.api.entity.Dept;
import com.sff.spring.cloud.provider.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cloud/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/list")
    @HystrixCommand(fallbackMethod = "resultException")
    public List<Dept> queryAll() {

        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return deptService.selectAll();
    }

    /**
     * 熔断方法需有明确的返回
     *
     * @return
     */
    public List<Dept> resultException() {
        System.out.println("<<<<-------------熔断时错误信息提示-------------->>>>");
        return new ArrayList<>();
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

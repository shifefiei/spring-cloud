package com.sff.spring.cloud.consumer;

import com.sff.spring.cloud.ribbon.rule.RibbonRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableDiscoveryClient
//启动主启动类时，去加载自定义的负载均衡规则类，name 针对哪个微服务使用该规则，configuration 指向配置类
@RibbonClient(name = "SPRING-CLOUD-PROVIDER-DEPT", configuration = RibbonRuleConfig.class)
public class SpringCloudConsumerDept8080 {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerDept8080.class, args);
    }

}

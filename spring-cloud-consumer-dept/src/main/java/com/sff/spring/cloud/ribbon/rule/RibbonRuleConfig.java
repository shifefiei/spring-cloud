package com.sff.spring.cloud.ribbon.rule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonRuleConfig {

    @Bean
    public IRule customization() {
        //return new RandomRule();
        return new MyRibbonRule();
    }

}

package com.sff.spring.cloud.api.hystrix;

import com.sff.spring.cloud.api.entity.Dept;
import com.sff.spring.cloud.api.feign.service.FeignDeptService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


/**
 * 利用 Hystrix 对 FeignDeptService 接口方法做熔断处理
 */
@Component
public class DeptServiceFactory implements FallbackFactory<FeignDeptService> {

    @Override
    public FeignDeptService create(Throwable throwable) {

         return new FeignDeptService() {
            @Override
            public List<Dept> queryAll() {
                System.out.println("DeptServiceFactory --------->>>>熔断处理");
                return new ArrayList<>();
            }
        };

    }
}

package com.sff.spring.cloud.ribbon.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.Random;

/**
 * 自定义负载均衡算法，要求每个每台服务要访问5次后换成另外一台服务
 */
public class MyRibbonRule extends AbstractLoadBalancerRule {

    private Random rand;

    private int count = 0;  //标识访问次数，5次

    private int index = 0;  //当前访问服务机器

    public MyRibbonRule() {
        rand = new Random();
    }

    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        }
        Server server = null;

        while (server == null) {
            if (Thread.interrupted()) {
                return null;
            }

            List<Server> upList = lb.getReachableServers();
            List<Server> allList = lb.getAllServers();

            int serverCount = allList.size();
            if (serverCount == 0) {
                return null;
            }

            /**
             * 随机负载均衡的核心处理代码
             */
            //int index = rand.nextInt(serverCount);
            //server = upList.get(index);

            /**
             * 每台访问5次
             */
            if (count < 5) {
                //当前微服务还未放到5次
                server = upList.get(index);
                count++;
                System.out.println(">>>>>>>>>" + count);
            } else {
                count = 0;
                index++;
                System.out.println("++++++++++" + index);
                if (index > upList.size() - 1) {
                    index = 0;
                }
            }

            if (server == null) {
                Thread.yield();
                continue;
            }

            if (server.isAlive()) {
                return (server);
            }

            server = null;
            Thread.yield();
        }
        return server;
    }

    @Override
    public Server choose(Object key) {
        return choose(getLoadBalancer(), key);
    }

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }
}

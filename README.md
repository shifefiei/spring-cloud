# spring-cloud

# Eureka 的自我保护机制

# Ribbon 负载均衡
## 负载均衡策略 IRule
- AvailabilityFilteringRule
- BestAvailableRule
- ClientConfigEnabledRoundRobinRule
- PredicateBasedRule
- RandomRule : 随机
- RetryRule
- RoundRobinRule : 轮询
- WeightedResponseTimeRule
- ZoneAvoidanceRule

## 自定义负载均衡规则
自定义负载均衡配置类不能在```@CompentScan```注解所在的包或者子包下(比如 ```@SpringBootApplication```注解就包含该注解)，否则自定的负载规则
将对所有的 Ribbon 客户端所共享，达不到定制的目的 
- @RibbonClient,主启动类上添加该注解
- 继承 ```AbstractLoadBalancerRule```抽象类

# Feign 
feign是一种盛明师、模板化的http客户端；接口+注解

- feign 集成了ribbon，通过轮询来进行负载均衡

#Hystrix 熔断器
```java
@EnableHystrix
@HystrixCommand
```

- 熔断
- 降级<br/>
定义一个类，实现FallbackFactory接口，并将该类注入到容器中
- 服务监控: HystrixDashborad

#Zuul 
zuul提供了过滤、路由的功能
- 路由：负责将外部请求转发到具体的微服务上去，实现外部访问统一入口的基础
- 过滤：负责对请求的过程进行处理，实现请求校验的功能

#Config 
- 服务端Config
- 客户端Config
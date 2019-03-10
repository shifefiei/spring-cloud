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


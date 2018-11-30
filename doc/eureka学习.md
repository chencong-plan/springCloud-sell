## 介绍Eureka

## 服务注册发现框架Eureka和Zookeeper的区别


## Eureka 调用服务的几种方式


### 直接使用RestTemplate,Url固定

### 利用loadBalancerClient通过应用名获取url,再调用RestTemplate

### 利用@LoadBalanced, 可在restTemplate里使用应用名字

### 使用Feign调用远程服务
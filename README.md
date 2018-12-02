# springCloud-sell


| 服务名称 |服务描述  | 备注 | 时间  |
| --- | --- | --- | --- |
| eureka | 注册中心 | 可部署高可用的服务注册中心 | 2018-11-29 08:42:14 |
| client | 客户端 | 测试使用客户端 | 2018-11-29 08:42:45 |  
| doc | 文档中心 | 记录系列开发使用文档 | 2018-11-29 08:42:14 |
| product | 商品服务 | 提供对商品系列操作服务 | 2018-11-30 19:12:30 |
| order | 订单服务 | 对订单操作 | 2018-12-01 00:30:15 |
| config | 统一配置中心 | 提供对各个服务的配置文件管理，各服务内使用bootstrap.yml | 2018-12-01 23:46:34 |


## MQ应用场景

+ 异步处理
+ 流量消峰
+ 日志处理
+ 应用解耦

## Spring-cloud-stream

应用通过Binder和springCloud-stream进行消息通信，spring-Cloud-Stream对消息队列进一步封装。现支持RabbitMQ和Kafka

[image](https://github.com/chencong-plan/springCloud-sell/blob/master/doc/img/spring-cloud-stream.png)

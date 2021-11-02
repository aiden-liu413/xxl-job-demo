# xxl-job-demo

> 此 demo 主要演示了 Spring cloud 如何集成 XXL-JOB 实现分布式定时任务，并提供绕过 `xxl-job-admin` 对定时任务的管理的方法，包括定时任务列表，触发器列表，新增定时任务，删除定时任务，停止定时任务，启动定时任务，修改定时任务，手动触发定时任务。

<p align="center">
 <img src="https://img.shields.io/badge/xxl%20job%20demo-1.0.0-success.svg" alt="Build Status">
 <img src="https://img.shields.io/badge/Spring%20Cloud-2020.0.3-blue.svg" alt="Coverage Status">
 <img src="https://img.shields.io/badge/Spring%20Cloud%20Alibaba-2021.1-blue.svg" alt="Coverage Status">
 <img src="https://img.shields.io/badge/Spring%20Boot-2.4.2-blue.svg" alt="Downloads">
 <img src="https://img.shields.io/github/license/aiden-liu413/xxl-job-demo"/>
 <img src="https://img.shields.io/github/stars/aiden-liu413/xxl-job-demo">   
</p>


## 系统说明

- 基于 Spring Cloud 2020 、Spring Boot 2.4.2、xxl-job 2.3.0 的 **任务调度系统**demo
- 集成了nacos,feign,能够快速将xxl-job应用于微服务架构中
- 改造了xxl-job-admin的部分接口，方便其他微服务以rest方式调用admin的接口以完成对任务的管理以及调度

### 核心依赖

| 依赖                   | 版本           |
| ---------------------- | ------------- |
| Spring Boot            | 2.4.2         |
| Spring Cloud           | 2020.0.3      |
| Spring Cloud Alibaba   | 2021.1        |
| hutool                 | 5.7.12         |
| xxl-job                   | 2.3.0        |

### 模块说明

```lua

xxl-job-demo
├── admin -- xxl-job-admin 版本为2.3.0
├── common -- 系统公共模块
├── consumer -- 消费者，以openapi调用xxl-job-admin完成任务的调度
├── executor -- 执行器示例
├── docs -- Github Pages && xxl-job架构图
└── sql -- xxl-job-admin的初始化sql
```

## 文档
[《点我查看文档》](https://aiden-liu413.github.io/xxl-job-demo/)

## gitee

[![aiden.liu/xxl-job-demo](https://gitee.com/aiden-liu/xxl-job-demo/widgets/widget_card.svg?colors=ffffff,1e252b,323d47,455059,d7deea,99a0ae)](https://gitee.com/aiden-liu/xxl-job-demo) 

## Stargazers over time

[![Stargazers over time](https://starchart.cc/aiden-liu413/xxl-job-demo.svg)](https://starchart.cc/aiden-liu413/xxl-job-demo)


update


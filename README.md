# xxl-job-demo

> 此 demo 主要演示了 Spring cloud 如何集成 XXL-JOB 实现分布式定时任务，并提供绕过 `xxl-job-admin` 对定时任务的管理的方法，包括定时任务列表，触发器列表，新增定时任务，删除定时任务，停止定时任务，启动定时任务，修改定时任务，手动触发定时任务。

<p align="center">
 <img src="https://img.shields.io/badge/Pig-3.3-success.svg" alt="Build Status">
 <img src="https://img.shields.io/badge/Spring%20Cloud-2020-blue.svg" alt="Coverage Status">
 <img src="https://img.shields.io/badge/Spring%20Boot-2.5-blue.svg" alt="Downloads">
 <img src="https://img.shields.io/github/license/pig-mesh/pig"/>
</p>


## 系统说明

- 基于 Spring Cloud 2020 、Spring Boot 2.5、 OAuth2 的 RBAC **权限管理系统**
- 基于数据驱动视图的理念封装 element-ui，即使没有 vue 的使用经验也能快速上手
- 提供对常见容器化支持 Docker、Kubernetes、Rancher2 支持
- 提供 lambda 、stream api 、webflux 的生产实践

### 核心依赖

| 依赖                   | 版本           |
| ---------------------- | ------------- |
| Spring Boot            | 2.4.2         |
| Spring Cloud           | 2020.0.3      |
| Spring Cloud Alibaba   | 2021.1        |
| hutool                 | 5.7.12         |
| xxl-job-core                   | 2.3.0        |

### 模块说明

```lua

xxl-job-demo
├── admin -- xxl-job-admin clone的版本为2.3.0
├── common -- 系统公共模块
├── consumer -- 消费者，以openapi调用xxl-job-admin完成任务的调度
├── executor -- 执行器示例
├── docs -- Github Pages && xxl-job架构图
└── sql -- xxl-job-admin的初始化sql
```

## 文档
- [《点我查看文档》](https://aiden-liu413.github.io/xxl-job-demo/)

## gitee

[![aiden.liu/xxl-job-demo](https://gitee.com/aiden-liu/xxl-job-demo/widgets/widget_card.svg?colors=ffffff,1e252b,323d47,455059,d7deea,99a0ae)](https://gitee.com/aiden-liu/xxl-job-demo) 


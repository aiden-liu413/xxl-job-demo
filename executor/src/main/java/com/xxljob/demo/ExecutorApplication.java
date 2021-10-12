package com.xxljob.demo;


import com.cloudwise.common.annotation.EnableXxlJob;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author aiden
 * <p>
 * 项目启动类
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableXxlJob
class ExecutorApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExecutorApplication.class, args);
    }

}

package com.xxljob.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author aiden
 * 项目启动类
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
class ConsumerApplication {

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {

        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}

package com.spring.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author wangfeilong
 * @version v1.0
 * @Description //TODO
 * @Date 2020/4/13 16:27
 *
 * @SpringCloudApplication 注解里面包含了一下注解
 *
 *   @SpringBootApplication    SpringBoot项目启动服务
 *   @EnableDiscoveryClient   引进服务发现
 *   @EnableCircuitBreaker    引进断路器
 *
 **/
@SpringCloudApplication

public class ProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }

}

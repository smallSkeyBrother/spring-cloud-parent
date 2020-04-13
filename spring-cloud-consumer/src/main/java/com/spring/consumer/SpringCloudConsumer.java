package com.spring.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wangfeilong
 * @version v1.0
 * @Description //TODO
 * @Date 2020/4/13 16:48
 **/
@SpringCloudApplication
@EnableEurekaClient
public class SpringCloudConsumer {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumer.class, args);
    }
}

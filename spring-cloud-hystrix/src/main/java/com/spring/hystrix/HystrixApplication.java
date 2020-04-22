package com.spring.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author wangfeilong
 * @version v1.0
 * @Description //TODO
 * @Date 2020/4/21 10:41
 *
 * @EanbleHystrix 等同于 @EnableCircuitBreaker
 * 
 **/
@SpringCloudApplication
public class HystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class, args);
    }
}

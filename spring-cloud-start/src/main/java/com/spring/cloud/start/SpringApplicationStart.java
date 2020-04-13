package com.spring.cloud.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangfeilong
 * @version v1.0
 * @Description //TODO
 * @Date 2020/4/13 14:58
 **/
@SpringBootApplication
@RestController
public class SpringApplicationStart {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationStart.class).start();
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}

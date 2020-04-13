package com.spring.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangfeilong
 * @version v1.0
 * @Description //TODO
 * @Date 2020/4/13 16:31
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/say")
    public String sayHello(){
        return "hello world";
    }
}

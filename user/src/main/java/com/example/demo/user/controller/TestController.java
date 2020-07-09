package com.example.demo.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${eureka.instance.instance-id}")
    String instanceId;

    @RequestMapping("/test")
    public String test() {
        return instanceId;
    }
}

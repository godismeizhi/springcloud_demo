package com.example.demo.user.controller;

import com.example.demo.user.response.RCode;
import com.example.demo.user.response.RData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${spring.cloud.consul.discovery.instanceId}")
    String instanceId;

    @Autowired
    private RData.Builer builer;

    @RequestMapping("/test")
    public RData test() {
        return builer.setCode(RCode.SUCCESS).setData(instanceId).bulid();
    }
}

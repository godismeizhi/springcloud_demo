package com.example.demo.video.controller;

import com.example.demo.video.response.VideoCode;
import com.exapmle.demo.common.response.RData;
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
        return builer.setCode(VideoCode.SUCCESS).setData(instanceId).bulid();
    }
}

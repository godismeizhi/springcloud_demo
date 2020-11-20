package com.example.demo.video.controller;

import com.example.demo.video.response.VideoCode;
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


    @RequestMapping("/user")
    public RData users() {

        return builer.setCode(VideoCode.VIDEO_NOT_EXAIT).bulid();
    }
}

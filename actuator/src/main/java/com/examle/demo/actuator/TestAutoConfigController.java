package com.examle.demo.actuator;


import com.example.demo.autoconfig.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAutoConfigController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("/hello")
    public String sayHello() {
        helloWorldService.sayHello();
        return "hello";
    }
}

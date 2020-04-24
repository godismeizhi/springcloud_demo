package com.example.demo.client1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @Autowired
    private MyHealthIndicator myHealthIndicator;

    @RequestMapping("/update")
    public String updateServiceStatus(boolean health) {
        myHealthIndicator.setHealth(health);
        return "完成";
    }
}

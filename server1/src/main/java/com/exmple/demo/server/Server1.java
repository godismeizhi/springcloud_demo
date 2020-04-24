package com.exmple.demo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Server1 {
    public static void main(String[] args) {
        SpringApplication.run(Server1.class, args);
    }
}

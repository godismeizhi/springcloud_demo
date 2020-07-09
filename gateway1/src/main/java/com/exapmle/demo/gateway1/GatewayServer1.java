package com.exapmle.demo.gateway1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayServer1 {
    public static void main(String[] args) {
        SpringApplication.run(GatewayServer1.class, args);
    }
}

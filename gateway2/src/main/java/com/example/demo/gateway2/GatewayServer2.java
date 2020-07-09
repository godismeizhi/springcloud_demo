package com.example.demo.gateway2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayServer2 {
    public static void main(String[] args) {
        SpringApplication.run(GatewayServer2.class, args);
    }
}

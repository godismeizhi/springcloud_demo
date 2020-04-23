package com.example.demo.clinet2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Client2 {
    public static void main(String[] args) {
        SpringApplication.run(Client2.class, args);
    }
}

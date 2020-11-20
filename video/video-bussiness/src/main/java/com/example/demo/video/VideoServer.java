package com.example.demo.video;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VideoServer {
    public static void main(String[] args) {
        SpringApplication.run(VideoServer.class, args);
    }
}

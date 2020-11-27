package com.exapmle.demo.common.config;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
@Data
public class ServerInfoProperties {


    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${spring.cloud.client.ip-address}")
    private String ip;

    @Value("${server.port}")
    private String port;

    @Value("${spring.cloud.consul.discovery.instanceId}")
    private String id;



}

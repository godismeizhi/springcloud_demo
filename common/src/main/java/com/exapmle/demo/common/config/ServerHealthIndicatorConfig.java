package com.exapmle.demo.common.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;


@Slf4j
@ConditionalOnClass(HealthIndicator.class)
@EnableConfigurationProperties(ServerInfoProperties.class)
@Configuration
public class ServerHealthIndicatorConfig {


    @Resource
    private ServerInfoProperties serverInfoProperties;


    @Bean
    public HealthIndicator serverInfo(){

        log.info("======================初始化服务器健康检查返回========================");

        return () -> Health.up()
                    .withDetail("id",serverInfoProperties.getId())
                    .withDetail("applicationName",serverInfoProperties.getApplicationName())
                    .withDetail("ip",serverInfoProperties.getIp())
                    .withDetail("port",serverInfoProperties.getPort())
                    .build();
    }
}

package com.example.demo.user.sysinfo.healthcheck;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class UserHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        return Health.up().withDetail("info", "开始健康检查").build();
    }
}

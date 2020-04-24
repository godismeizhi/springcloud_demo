package com.example.demo.client1;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyHealthIndicator implements HealthIndicator {

    boolean isHealth = true;

    @Override
    public Health health() {
        System.out.println("开启健康检查");
        if (isHealth) {
            return new Health.Builder().up().build();
        } else {
            return new Health.Builder().down().build();
        }
    }

    public boolean isHealth() {
        return isHealth;
    }

    public void setHealth(boolean health) {
        isHealth = health;
    }
}

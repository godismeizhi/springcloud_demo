package com.example.demo.autoconfig;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloWorld.class)
@ConditionalOnProperty(prefix = "helloworld", name = "hello", havingValue = "hello")
public class HelloWorldConfiguration {

    @Autowired
    private HelloWorld helloWorld;

    @Bean
    public HelloWorldService initHelloWorldService() {
        System.out.println("自动化配置完成");
        return new HelloWorldService(helloWorld);
    }
}

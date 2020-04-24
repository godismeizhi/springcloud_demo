package com.example.demo.autoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "helloworld")
public class HelloWorld {

    HelloWorld() {

        System.out.println(Thread.currentThread().getName() + "成功构建HelloWorld对象");
    }

    private String hello;

    private String world;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        System.out.println("给hello赋值");
        this.hello = hello;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        System.out.println("给world赋值");
        this.world = world;
    }
}

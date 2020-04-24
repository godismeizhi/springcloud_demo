package com.example.demo.autoconfig;


public class HelloWorldService {

    private HelloWorld helloWorld;

    public HelloWorldService(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public void sayHello() {
        System.out.println("hello:" + helloWorld.getHello());
        System.out.println("world:" + helloWorld.getWorld());
    }
}

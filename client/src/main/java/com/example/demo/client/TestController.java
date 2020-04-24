package com.example.demo.client;


import com.netflix.loadbalancer.BaseLoadBalancer;
import com.netflix.loadbalancer.LoadBalancerBuilder;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.reactive.LoadBalancerCommand;
import com.netflix.loadbalancer.reactive.ServerOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import rx.Observable;

import java.util.Arrays;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/test")
    public String getServer() {
        return restTemplate.getForObject("http://server/test", String.class);
    }


    @RequestMapping("/test2")
    public String getServer2() {

        List<Server> serverList = Arrays.asList(new Server("localhost", 8081), new Server("localhost", 8082));

        BaseLoadBalancer baseLoadBalancer = LoadBalancerBuilder.newBuilder().buildFixedServerListLoadBalancer(serverList);

        baseLoadBalancer.setRule(new RandomRule());

        Object object = LoadBalancerCommand.builder().withLoadBalancer(baseLoadBalancer).build().submit(
                (Server server) -> {
                    System.out.println("===========" + server.getHost() + ":" + server.getHostPort());
                    return null;
                }
        );

        return "2312312312";
    }
}

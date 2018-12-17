package com.gubin.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloerror")//指定熔断方法
    public String sayhello() {
        //服务提供者注册到Eureka Server上的应用名
        return restTemplate.getForObject("http://springcloud-study-client/hello", String.class);
    }

    //熔断方法
    public String helloerror(){
        return "error" ;
    }
}

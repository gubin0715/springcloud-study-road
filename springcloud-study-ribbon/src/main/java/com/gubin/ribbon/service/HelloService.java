package com.gubin.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;
    public String sayhello() {
        //SPRING-CLOUD-SERVICE为注册到Eureka Server上的应用名
        return restTemplate.getForObject("http://springcloud-study-client/hello", String.class);
    }
}

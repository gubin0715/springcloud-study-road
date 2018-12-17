package com.gubin.hystrix.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceError implements HelloService{
    @Override
    public String sayHello() {
        return "error";
    }
}

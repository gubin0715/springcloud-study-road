package com.gubin.hystrix.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "springcloud-study-client",fallback = HelloServiceError.class)
//服务提供者中定义的服务的名字
public interface HelloService {
    @RequestMapping(value = "/hello")   //服务提供者中定义的服务方法
    public String sayHello();
}

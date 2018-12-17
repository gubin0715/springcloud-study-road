package com.gubin.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix
public class SpringcloudStudyRibbonHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudStudyRibbonHystrixApplication.class, args);
    }

    @Bean
    @LoadBalanced
        // 添加负载均衡支持，很简单，只需要在RestTemplate上添加@LoadBalanced注解，
        // 那么RestTemplate即具有负载均衡的功能,如果不加@LoadBalanced注解的话，
        // 会报java.net.UnknownHostException异常，此时无法通过注册到Eureka Server上的服务名来调用服务，
        // 因为RestTemplate是无法从服务名映射到ip:port的，映射的功能是由LoadBalancerClient来实现的。
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}


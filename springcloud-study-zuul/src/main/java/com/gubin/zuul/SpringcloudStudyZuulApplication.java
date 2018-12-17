package com.gubin.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudStudyZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudStudyZuulApplication.class, args);
    }

}


package com.gubin.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer
public class SpringcloudStudyZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudStudyZipkinApplication.class, args);
    }

}


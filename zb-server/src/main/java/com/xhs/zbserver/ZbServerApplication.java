package com.xhs.zbserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.xhs.zbserver.remote")
public class ZbServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZbServerApplication.class, args);
    }

}

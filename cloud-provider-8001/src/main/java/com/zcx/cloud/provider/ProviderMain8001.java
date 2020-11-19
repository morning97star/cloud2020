package com.zcx.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProviderMain8001 {

    public static void main(String[] args) {
        SpringApplication.run(ProviderMain8001.class,args);
    }
}

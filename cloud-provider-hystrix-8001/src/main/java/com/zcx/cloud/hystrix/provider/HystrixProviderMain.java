package com.zcx.cloud.hystrix.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix //@EnableCircuitBreaker 二者皆可
public class HystrixProviderMain {

    public static void main(String[] args) {
        SpringApplication.run(HystrixProviderMain.class, args);
    }
}

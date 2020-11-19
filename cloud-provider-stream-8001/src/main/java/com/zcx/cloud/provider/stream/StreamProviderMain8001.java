package com.zcx.cloud.provider.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StreamProviderMain8001 {

    public static void main(String[] args) {
        SpringApplication.run(StreamProviderMain8001.class,args);
    }
}

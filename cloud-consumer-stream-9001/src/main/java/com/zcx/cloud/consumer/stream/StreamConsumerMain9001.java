package com.zcx.cloud.consumer.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StreamConsumerMain9001 {

    public static void main(String[] args) {
        SpringApplication.run(StreamConsumerMain9001.class,args);
    }
}

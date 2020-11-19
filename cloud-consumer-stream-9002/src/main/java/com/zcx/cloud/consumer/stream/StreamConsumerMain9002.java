package com.zcx.cloud.consumer.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StreamConsumerMain9002 {

    public static void main(String[] args) {
        SpringApplication.run(StreamConsumerMain9002.class,args);
    }
}

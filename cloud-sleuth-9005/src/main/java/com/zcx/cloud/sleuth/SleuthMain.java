package com.zcx.cloud.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by 郑晨星 in 2020/11/19
 */
@SpringBootApplication
@EnableEurekaClient
public class SleuthMain {

    public static void main(String[] args) {
        SpringApplication.run(SleuthMain.class, args);
    }
}

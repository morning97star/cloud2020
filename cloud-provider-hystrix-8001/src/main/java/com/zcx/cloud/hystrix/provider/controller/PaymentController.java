package com.zcx.cloud.hystrix.provider.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@RestController
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/payment/get")
    public String get() {
        return "hello jack, this is for you: " + UUID.randomUUID() + ", port --> " + port;
    }

    @HystrixCommand(fallbackMethod = "helloFallBack", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    @GetMapping("/payment/hello")
    public String hello() {
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello jack, this is for you: (*^▽^*) " + UUID.randomUUID() + ", port --> " + port;
    }

    public String helloFallBack() {
        return "o(╥﹏╥)o, sorry, the server was down...";
    }

}

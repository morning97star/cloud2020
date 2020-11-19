package com.zcx.cloud.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    private final String PAYMENT_SERVICE_URL = "http://payment-service/";

    @GetMapping("consumer/payment/get")
    public String get() {
        return restTemplate.getForObject(PAYMENT_SERVICE_URL + "payment/get", String.class);
    }

}

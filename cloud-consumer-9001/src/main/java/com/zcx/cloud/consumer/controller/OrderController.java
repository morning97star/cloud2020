package com.zcx.cloud.consumer.controller;

import org.apache.commons.lang.StringUtils;
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


    public static void main(String[] args) {

        System.out.println("r1__> " + StringUtils.equals("", null));
        System.out.println("r2__> " + StringUtils.equals("", ""));
        System.out.println("r3__> " + StringUtils.equals("", "   "));
    }

}

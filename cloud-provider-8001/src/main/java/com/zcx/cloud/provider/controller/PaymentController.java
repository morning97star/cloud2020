package com.zcx.cloud.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/payment/get/{id}")
    public String get(@PathVariable("id") long id) {
        return "hello jack, this is for you: " + UUID.randomUUID() + ", port --> " + port;
    }

}

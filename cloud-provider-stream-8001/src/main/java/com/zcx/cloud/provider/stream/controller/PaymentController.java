package com.zcx.cloud.provider.stream.controller;

import com.zcx.cloud.provider.stream.service.IPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private IPayService payService;

    @GetMapping("/payment/get/{id}")
    public String get(@PathVariable("id") long id) {
        return "hello jack, this is for you: " + payService.send() + ", port --> " + port;
    }

}

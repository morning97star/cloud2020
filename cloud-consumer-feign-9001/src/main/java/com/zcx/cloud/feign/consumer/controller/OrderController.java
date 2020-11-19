package com.zcx.cloud.feign.consumer.controller;

import com.zcx.cloud.feign.consumer.service.IPaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    private IPaymentService paymentService;

    @GetMapping("consumer/payment/get")
    public String get() {
        return paymentService.get();
    }

}

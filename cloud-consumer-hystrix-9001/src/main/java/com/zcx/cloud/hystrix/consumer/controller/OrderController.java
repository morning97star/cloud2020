package com.zcx.cloud.hystrix.consumer.controller;

import com.zcx.cloud.hystrix.consumer.service.IPaymentService;
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

    @GetMapping("consumer/payment/hello")
    public String hello() {
        return paymentService.hello();
    }

}

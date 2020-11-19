package com.zcx.cloud.hystrix.consumer.service;

import com.zcx.cloud.hystrix.consumer.service.fallback.PaymentServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "payment-service", fallback = PaymentServiceFallBack.class)
public interface IPaymentService {

    @GetMapping("/payment/get")
    String get();

    @GetMapping("/payment/hello")
    String hello();
}

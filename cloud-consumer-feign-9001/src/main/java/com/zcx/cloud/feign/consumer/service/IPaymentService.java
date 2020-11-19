package com.zcx.cloud.feign.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("payment-service")
public interface IPaymentService {

    @GetMapping("/payment/get")
    String get();

}

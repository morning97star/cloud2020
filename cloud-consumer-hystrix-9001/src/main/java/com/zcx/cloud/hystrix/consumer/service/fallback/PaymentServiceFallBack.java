package com.zcx.cloud.hystrix.consumer.service.fallback;

import com.zcx.cloud.hystrix.consumer.service.IPaymentService;
import org.springframework.stereotype.Component;

@Component
public class PaymentServiceFallBack implements IPaymentService {

    public String get() {
        return "o(╥﹏╥)o, this is get fallback method";
    }

    public String hello() {
        return "o(╥﹏╥)o, this is hello fallback method";
    }
}

package com.zcx.cloud.provider.stream.service.impl;

import com.zcx.cloud.provider.stream.service.IPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@EnableBinding(Source.class)
public class PayServiceImpl implements IPayService {

    @Autowired
    private MessageChannel output;


    @Output
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        return serial;
    }
}

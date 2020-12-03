package com.zcx.cloud.consumer.stream.receive;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Sink.class)
public class ReceiveMSG {

    @StreamListener(Sink.INPUT)
    public void get(Message<String> message) {
        System.out.println("receive: " + message.getPayload());
    }
}

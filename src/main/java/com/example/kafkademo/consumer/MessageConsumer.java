package com.example.kafkademo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
    @KafkaListener(topics = "sample", groupId = "group1")
    void lisner(String data){
        System.out.println(data);
    }
}

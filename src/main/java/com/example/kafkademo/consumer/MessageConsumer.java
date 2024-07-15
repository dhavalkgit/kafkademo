package com.example.kafkademo.consumer;

import com.example.kafkademo.MessageDto;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
    @KafkaListener(topics = "sample", groupId = "group1")
    void lisner(MessageDto data){
        System.out.println(data.toString());
    }
}

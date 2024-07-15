package com.example.kafkademo;

import com.example.kafkademo.consumer.MessageConsumer;
import com.example.kafkademo.producer.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KafkaDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(KafkaDemoApplication.class, args);
		MessageProducer message = run.getBean("messageProducer", MessageProducer.class);
		MessageDto messageDto = MessageDto.builder()
				.message("Hi this is your first message")
						.build();
		message.sendMessage("sample",messageDto);
	}
}

package com.duocuc.consumer.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @RabbitListener(queues = "testQueue")
    public void receiveMessage(String message) {
        System.out.println("Mensaje Recibido: " + message);
    }
}

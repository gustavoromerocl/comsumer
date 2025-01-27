package com.duocuc.consumer.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duocuc.consumer.model.Message;
import com.duocuc.consumer.repository.MessageRepository;

@Service
public class ConsumerService {

    @Autowired
    private MessageRepository menssageRepository;

    @RabbitListener(queues = "testQueue")
    public void receiveMessage(String message) {
        System.out.println("Mensaje Recibido: " + message);
        Message newMessage = new Message(message);
        menssageRepository.save(newMessage);
    }
}

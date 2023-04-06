package com.example.kafkaprojectpyatakov;

import com.example.kafkaprojectpyatakov.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
    @Autowired
    private KafkaTemplate<String, Message> kafkaTemplate;

    public void sendMessage(String producerId, Message message){
        kafkaTemplate.send("msg", producerId, message);
    }
}

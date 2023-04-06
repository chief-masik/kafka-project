package com.example.kafkaprojectpyatakov;

import com.example.kafkaprojectpyatakov.model.Message;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@EnableKafka
@Component
public class KafkaConsumer {
    @KafkaListener(topics="msg")
    public void msgListener(ConsumerRecord<String, Message> record){
        System.out.println(record.partition());
        System.out.println(record.key());
        System.out.println(record.value());
    }
}

package com.example.kafkaprojectpyatakov.controller;

import com.example.kafkaprojectpyatakov.model.Posting;
import com.example.kafkaprojectpyatakov.KafkaProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
public class MessageController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping
    public void sendOrder(@RequestBody Posting posting) {
        kafkaProducer.sendMessage(posting.getProducerId(), posting.getMessage());
    }
}

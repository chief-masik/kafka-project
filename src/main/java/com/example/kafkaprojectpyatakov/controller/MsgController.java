package com.example.kafkaprojectpyatakov.controller;

import com.example.kafkaprojectpyatakov.DTO.Message;
import com.example.kafkaprojectpyatakov.DTO.Posting;
import com.example.kafkaprojectpyatakov.KafkaProducer;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("msg")
public class MsgController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping
    public void sendOrder(@RequestBody Posting posting) {
        log.warn("ProducerId: " + posting.getProducerId());
        log.warn("Message id: " + posting.getMessage().getId());
        log.warn("Message content: " + posting.getMessage().getContent());
        kafkaProducer.sendMessage(posting.getProducerId(), posting.getMessage());
    }

}

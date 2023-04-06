package com.example.kafkaprojectpyatakov.model;

import lombok.Data;

@Data
public class Posting {
    private String producerId;
    private Message message;
}

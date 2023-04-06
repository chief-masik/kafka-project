package com.example.kafkaprojectpyatakov.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Posting {
    private String producerId;
    private Message message;
}

package com.example.kafkaprojectpyatakov.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
public class Message {
    private String id;
    private String content;
}

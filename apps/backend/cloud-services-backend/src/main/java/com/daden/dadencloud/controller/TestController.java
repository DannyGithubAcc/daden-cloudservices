package com.daden.dadencloud.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.kafka.core.KafkaTemplate;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class TestController {
    
    private final KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/send/{message}")
    public String sendMessage(@PathVariable String message) {
        kafkaTemplate.send("input-topic", message);
        return "Message sent: " + message;
    }
}
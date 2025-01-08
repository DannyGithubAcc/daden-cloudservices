package com.daden.dadenclouds.controller;

import com.daden.dadenclouds.service.KafkaMessageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/kafka")
@RequiredArgsConstructor
public class KafkaTestController {

    private final KafkaMessageService kafkaMessageService;

    @PostMapping("/send")
    public void sendMessage(@RequestBody String message) {
        kafkaMessageService.sendMessage("test-topic", message);
    }
}

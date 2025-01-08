package com.daden.dadenclouds.service;

public interface KafkaMessageService {
    void sendMessage(String topic, String message);
}

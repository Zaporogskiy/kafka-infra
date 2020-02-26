package org.infra.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Consumer {

    @KafkaListener(topics = {"poc-topic", "poc-topic-result"}, groupId = "group_id")
    public void consume(String message) {
        System.out.println();
        log.info("Consumer: message {}", message);
    }

    @KafkaListener(topics = {"poc-topic-result"}, groupId = "group_id")
    public void consume1(String message) {

        log.info("POC Result => message {}", message);
    }
}

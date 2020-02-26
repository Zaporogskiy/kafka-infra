package org.infra.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Consumer {

    @KafkaListener(topics = "poc-topic", groupId = "group_id")
    public void consume(String message) {
        log.info("Consumer: message {}", message);
    }
}

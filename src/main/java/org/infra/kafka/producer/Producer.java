package org.infra.kafka.producer;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Data
public class Producer {
    private final KafkaTemplate<String, String> kafkaTemplate;

//  http://localhost:9000/publish?topic=poc-topic&key=9000&value={ "customId": "9000", "lineItem": "2", "quantity": "4" }
    public void sendMessage(String topic, String key, String value) {
        log.info("Sending: topic: {} , key: {} , value: {}  .", topic, key, value);
        kafkaTemplate.send(topic, key, value);
    }
}

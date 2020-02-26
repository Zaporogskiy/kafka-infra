package org.infra.kafka.controller;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.infra.kafka.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
@Slf4j
public class KafkaFacadeController {

    @Autowired
    private Producer producer;

    @GetMapping("/publish")
    public void greeting(@RequestParam(value = "topic") String topic,
                         @RequestParam(value = "key") String key,
                         @RequestParam(value = "value") String value) {
        producer.sendMessage(topic,key,value);
    }
}

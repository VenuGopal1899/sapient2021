package com.sapient.javakafka.controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.javakafka.consumer.MyTopicConsumer;

import java.util.List;

@RestController
public class KafkaController {

    private KafkaTemplate<String, String> template;
    private MyTopicConsumer myTopicConsumer;

    public KafkaController(KafkaTemplate<String, String> template, MyTopicConsumer myTopicConsumer) {
        this.template = template;
        this.myTopicConsumer = myTopicConsumer;
    }

    @GetMapping("/kafka/produce")
    public void produce(@RequestParam String message) {
        template.send("myTopic", message);
    }

    @GetMapping("/kafka/messages")
    public List<String> getMessages() {
        return myTopicConsumer.getMessages();
    }

}

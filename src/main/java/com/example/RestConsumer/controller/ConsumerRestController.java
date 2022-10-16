package com.example.RestConsumer.controller;

import com.example.RestConsumer.model.Contact;
import com.example.RestConsumer.service.RestConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/consumer")
public class ConsumerRestController {
    @Autowired
    private RestConsumerService consumerService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getInquiries")
    public List<Contact> getInquiries(@RequestParam String status) {
        return consumerService.getInquiries(status);
    }

    @PostMapping("/saveInquiry")
    public ResponseEntity<Contact> save(@RequestBody Contact contact) {
        return consumerService.saveInquiry(contact);
    }
}

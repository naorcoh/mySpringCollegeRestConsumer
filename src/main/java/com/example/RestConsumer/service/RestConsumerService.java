package com.example.RestConsumer.service;

import com.example.RestConsumer.clients.ContactClient;
import com.example.RestConsumer.config.RestConsumerConfiguration;
import com.example.RestConsumer.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RestConsumerService {
    @Autowired
    private ContactClient contactClient;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RestConsumerConfiguration configuration;

    public List<Contact> getInquiries(String status) {
        return contactClient.getInquiriesByStatus(status);
    }

    public ResponseEntity<Contact> saveInquiry(Contact contact) {

        return restTemplate.exchange(
                configuration.getBaseUrl() + configuration.getSaveInquiryUrl(),
                HttpMethod.POST,
                new HttpEntity<>(contact),
                Contact.class
        );

    }


}

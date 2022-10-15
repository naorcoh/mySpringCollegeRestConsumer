package com.example.RestConsumer.clients;

import com.example.RestConsumer.config.FeignConfiguration;
import com.example.RestConsumer.model.Contact;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "contact", url = "http://localhost:8080/api/inquiries", configuration = FeignConfiguration.class)
public interface ContactClient {

    @GetMapping("/getInquiriesByStatus")
    List<Contact> getInquiriesByStatus(@RequestParam String status);
}

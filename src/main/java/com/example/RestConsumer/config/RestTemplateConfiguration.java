package com.example.RestConsumer.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {

    @Autowired
    private RestConsumerConfiguration configuration;

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplateBuilder()
                .basicAuthentication(configuration.getUsername(), configuration.getPassword())
                .build();
    }
}

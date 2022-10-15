package com.example.RestConsumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomHttpResponse {

    private int statusCode;
    private String message;
}

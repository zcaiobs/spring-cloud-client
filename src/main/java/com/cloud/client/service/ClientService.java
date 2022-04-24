package com.cloud.client.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Value("${data.value}")
    private String value;

    public void execute() {
        System.out.println(value);
    }
}

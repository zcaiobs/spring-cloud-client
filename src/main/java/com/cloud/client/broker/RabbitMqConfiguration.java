package com.cloud.client.broker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.endpoint.RefreshEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.function.Consumer;

@Configuration
@Slf4j
public class RabbitMqConfiguration {

    @Autowired
    RefreshEndpoint refreshEndpoint;

    @Bean
    public Consumer<String> eventBuzz1Consumer(){
        return (value) -> refreshEndpoint.refresh();
    }
}

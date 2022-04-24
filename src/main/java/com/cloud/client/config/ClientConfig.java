package com.cloud.client.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.restart.RestartEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class ClientConfig {

    @Bean
    public RestartEndpoint restartApp() {
        return new RestartEndpoint();
    }
}

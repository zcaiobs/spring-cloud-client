package com.cloud.client.controller;

import com.cloud.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;

@RefreshScope
@RestController
@RequestMapping("/api")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @Value("${data.value}")
    private String value;

    private final String success = "Project Client ON - " + UUID.randomUUID();

    @GetMapping("/data")
    public ResponseEntity<?> execute() throws InterruptedException {
        System.out.println(value);
        Thread.sleep(3000);
        return ResponseEntity.ok(success);
    }

    @GetMapping("/data2")
    public ResponseEntity<?> data() throws InterruptedException {
        clientService.execute();
        Thread.sleep(3000);
        return ResponseEntity.ok(success);
    }
}

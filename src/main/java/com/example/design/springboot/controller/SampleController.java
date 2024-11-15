package com.example.design.springboot.controller;

import com.example.design.springboot.aspect.LogExecutionTime;
import com.example.design.springboot.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    @Qualifier("sampleServiceV1")
    private SampleService sampleService;

    @LogExecutionTime
    @GetMapping("/test")
    public String hello() {
        // Simulate some processing time
        try {
            Thread.sleep(200); // Sleep for 200ms
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Hello, World!";
    }
}

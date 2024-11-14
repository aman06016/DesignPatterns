package com.example.design.springboot;

import com.example.design.springboot.aspect.LogExecutionTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

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

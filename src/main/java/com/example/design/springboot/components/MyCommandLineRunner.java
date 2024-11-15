package com.example.design.springboot.components;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Executing startup logic in CommandLineRunner");
        // Initialization logic here
    }
}

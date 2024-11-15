package com.example.design.springboot.components;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class PrototypeService {
    public void execute() {
        System.out.println("Executing PrototypeService");
    }
}

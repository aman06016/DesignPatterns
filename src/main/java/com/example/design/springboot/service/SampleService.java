package com.example.design.springboot.service;

import org.springframework.stereotype.Service;

@Service("sampleServiceV1")
public class SampleService implements ISampleService {


    public String findName(){
        return "aman";
    }
}

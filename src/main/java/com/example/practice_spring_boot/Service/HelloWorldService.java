package com.example.practice_spring_boot.Service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String hello() {
        return "Hello World";
    }
}

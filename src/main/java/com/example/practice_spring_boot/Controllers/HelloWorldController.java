package com.example.practice_spring_boot.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice_spring_boot.Service.HelloWorldService;

@RestController
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/")
    public String hello() {
        return helloWorldService.hello();
    }
}

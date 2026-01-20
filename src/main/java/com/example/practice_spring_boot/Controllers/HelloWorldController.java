package com.example.practice_spring_boot.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice_spring_boot.Service.HelloWorldService;
import com.example.practice_spring_boot.Service.Photo;

@RestController
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    final List<Photo> db = List.of(new Photo("1", "hello.jpg"));

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    // @GetMapping("/ApiCall")
    // public String getMethodName() {
    // return APIController.APICall();
    // }

    @GetMapping("/photo/{id}")
    public List<Photo> get(@PathVariable String id) {
        return this.db;
    }

    @GetMapping("/")
    public String hello() {
        return helloWorldService.hello();
    }
}

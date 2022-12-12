package com.example.tutorial.controller;

import com.example.tutorial.model.HelloWorldModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping(path = "/new-hello-world")
    public String newHelloWorld() {
        return "Hello World!";
    }

    @GetMapping(path = "/hello-world-model")
    public HelloWorldModel helloWorldModel() {
        return new HelloWorldModel("Hello world");
    }
}

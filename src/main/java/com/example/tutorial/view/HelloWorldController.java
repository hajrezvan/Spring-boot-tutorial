package com.example.tutorial.view;

import com.example.tutorial.model.HelloWorldModel;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class HelloWorldController {
    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping(path = "/new-hello-world")
    public String newHelloWorld() {
        return "Hello World!";
    }

    @GetMapping(path = "/hello-world-model/{name}")
    public HelloWorldModel nameHelloWorldModel(@PathVariable String name) {
        return new HelloWorldModel(String.format("Hello %s", name));
    }
}

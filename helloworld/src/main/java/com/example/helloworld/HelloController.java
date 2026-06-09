package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // This maps to any URL like /hello/John or /hello/Sarah
    @GetMapping("/hello/{name}")
    public String sayHelloToUser(@PathVariable String name) {
        return "Hello " + name;
    }
}
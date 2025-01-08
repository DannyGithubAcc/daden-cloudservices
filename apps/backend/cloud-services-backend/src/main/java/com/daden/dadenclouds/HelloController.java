package com.daden.dadenclouds;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        String message = "Hello from Spring Boot API!";
        System.out.println(message); // Output to the terminal
        return message; // Return response to the client
    }
}
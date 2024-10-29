package com.example;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/")
    String hello() {
        return "Hello World!";
    }
}

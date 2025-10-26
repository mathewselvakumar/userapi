package com.example.userAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MathewTest")
public class HelloController {

    @GetMapping("/test")
    public String home() {
        return "Hello Spring Boot!";
    }
}

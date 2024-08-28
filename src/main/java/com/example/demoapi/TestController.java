package com.example.demoapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        System.out.println("Test endpoint hit");
        return "Hello, World! This is a test. This is another test. One more test. Two tests. Three. Four";
    }

}

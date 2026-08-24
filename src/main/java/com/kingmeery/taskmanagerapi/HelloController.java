package com.kingmeery.taskmanagerapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        String message = "YO YO YO";
        return message;
    }

}
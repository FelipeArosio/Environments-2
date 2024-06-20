package com.develhope.Environment_2.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Value("${welcomeMsg}")
    private String welcomeMsg;

    @GetMapping("/")
    public String welcome() {
        return welcomeMsg;
    }
}


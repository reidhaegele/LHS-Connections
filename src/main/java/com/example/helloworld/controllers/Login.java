package com.example.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Login {
    @GetMapping("/")
    public String index() {
        return "names/home";
    }
    @PostMapping("/")
    public String loginAction() {
        // do whatever you do to log in
        return "names/home";
    }
}

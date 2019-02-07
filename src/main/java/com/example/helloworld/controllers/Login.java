package com.example.helloworld.controllers;

import com.example.helloworld.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Login {
    @GetMapping("/")
    public String index() {
        return "names/loginofficial";
    }
    @PostMapping("/")
    public String loginAction(Model model, @RequestParam("uname") String name, @RequestParam("psw") String psw) {
        // do whatever you do to log in
        User user = new User(name, psw);
        model.addAttribute("User", user);
        return "names/home";
    }
}

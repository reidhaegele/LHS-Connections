package com.example.helloworld.controllers;

import com.example.helloworld.model.User;
import com.example.helloworld.model.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "names")
public class IndexController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        UserData.add(new User("John Doe", "password"));
        model.addAttribute("title", "Users");
        return "names/index";
    }
}

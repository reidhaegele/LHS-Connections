package com.example.helloworld.controllers;

import com.example.helloworld.model.User;
import com.example.helloworld.model.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "create")
public class CreateAccountController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        return "createofficial";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String createAcc(Model model, @RequestParam("uname") String uname, @RequestParam("psw") String psw) {
        User user = new User(uname, psw);
        UserData.add(user);
        return "redirect:login";
    }
}
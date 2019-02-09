package com.example.helloworld.controllers;


import com.example.helloworld.model.User;
import com.example.helloworld.model.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "create")
public class CreateAccountController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "names/createofficial";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String createAcc(Model model, @RequestParam("uname") String uname, @RequestParam("psw") String psw, @RequestParam("fname") String fname, @RequestParam("lname") String lname, @RequestParam("contact") String contact) {
        User user = new User(uname, psw);
        UserData.add(user);
        model.addAttribute("User", user);
        return "names/index";
    }
}



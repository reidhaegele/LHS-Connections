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
    public String index() {
        return "createofficial";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String createAcc(Model model, @RequestParam("uname") String uname, @RequestParam("psw") String psw, @RequestParam("grade") String grade, @RequestParam("contact") String contact, @RequestParam("fname") String fname, @RequestParam("lname") String lname, @RequestParam("classes") String classes) {
        ArrayList<String> classList = new ArrayList<String>(0);
        int l = 0;
        while (classes.contains(","))
        {
            classList.add(classes.substring(0, classes.indexOf(",")));
            classes = classes.substring(0, classes.indexOf(","));
        }
        classList.add(classes);
        User user = new User(uname, psw, grade, contact, fname, lname, classList);
        UserData.add(user);
        return "redirect:login";
    }
}



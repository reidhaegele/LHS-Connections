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
@RequestMapping(value = "home")
public class HomeController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        UserData.add(new User("John Doe", "password", "11", "butt@gmail.com", "", "", new ArrayList(0)));
        model.addAttribute("title", "Users");
        model.addAttribute("Users", UserData.getAll());
        return "homeofficial";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String index(@RequestParam("searchParam") String searchParam, Model model) {
        ArrayList<User> users = new ArrayList<>();
        for (User user:UserData.getAll()) {
            for (String course:user.getclasses()) {
                if (searchParam.equalsIgnoreCase(course)) {
                    users.add(user);
                }
            }
        }
        model.addAttribute("SearchedUsers", users);
        return "homeofficial";
    }
}

package com.example.helloworld.controllers;

import com.example.helloworld.model.User;
import com.example.helloworld.model.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;

//Math(Algebra, Geometry, Statistics, Trigonometry, Precalculus, Calculus)
//Science(Physics, Chemistry, Biology, Environmental Science, Physical Science)
//Social Studies(World History, U.S. History, Government, Human Geography, Global Politics, Psychology, Sociology)
//Language Arts(General English, Literature, Language)
//Foreign Language(Spanish, French, German)
//Engineering(Principles, Architecture, Digital Electronics, Networking, Web Design, Programming)

@Controller
@RequestMapping(value = "home")
public class HomeController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("title", "Users");
        model.addAttribute("Users", UserData.getAll());
        return "homeofficial";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String index(@RequestParam("searchParam") String searchParam, Model model) {
        ArrayList<User> users = new ArrayList<>();
        for (User user : UserData.getAll()) {
            for (String course : user.getClasses()) {
                if (searchParam.equalsIgnoreCase(course)) {
                    users.add(user);
                }
            }
        }
        model.addAttribute("SearchedUsers", users);
        return "homeofficial";
    }

    @RequestMapping(value = "/{id}")
    public String profile(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", UserData.getById(id));
        return "userprofileofficial";
    }
}
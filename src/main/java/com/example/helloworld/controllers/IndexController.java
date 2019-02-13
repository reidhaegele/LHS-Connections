package com.example.helloworld.controllers;

import com.example.helloworld.model.User;
import com.example.helloworld.model.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "")
public class IndexController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        UserData.add(new User("John Doe", "password", "11", "butt@gmail.com", "", "", new ArrayList(0)));
        UserData.add(new User("benrieth19", "password", "12", "19benriethmeier@lindberghschools.ws", "Ben", "Riethmeier", new ArrayList<String>())
        UserData.add(new User("REID_HAEGELE", "password", "12", "20reidhaegele@lindberghschools.ws", "Reid", "", new ArrayList<String>()));
        UserData.add(new User("", "", "", "", "", "", new ArrayList<String>()));
        UserData.add(new User("", "", "", "", "", "", new ArrayList<String>()));
        UserData.add(new User("", "", "", "", "", "", new ArrayList<String>()));
        UserData.add(new User("", "", "", "", "", "", new ArrayList<String>()));
        UserData.add(new User("", "", "", "", "", "", new ArrayList<String>()));
        UserData.add(new User("", "", "", "", "", "", new ArrayList<String>()));
        UserData.add(new User("", "", "", "", "", "", new ArrayList<String>()));

        model.addAttribute("title", "Users");
        model.addAttribute("Users", UserData.getAll());
        return "homeofficial";
    }
}

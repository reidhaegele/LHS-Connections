package com.example.helloworld.controllers;

import com.example.helloworld.forms.ProfileForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "search")
public class SearchController {
    @RequestMapping(value="", method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("title", "Users");
        return "search";
    }
    @RequestMapping(value="", method = RequestMethod.POST)
    public String index(Model model, ProfileForm profileForm){
        model.addAttribute("title", "Users");
        return "search";
    }
}

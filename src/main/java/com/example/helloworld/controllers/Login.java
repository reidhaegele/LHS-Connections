package com.example.helloworld.controllers;


import com.example.helloworld.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "login")
public class Login {
    /*
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
    */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        System.out.println("MADE IT TO GET.");
        return "names/loginofficial";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String loginAction(@RequestParam("uname") String name, @RequestParam("psw") String psw) {
        // do whatever you do to log in
        System.out.println("Made it to post");
        System.err.println("Username = " + name);
        System.err.println("Password = " + psw);
        if(name.equalsIgnoreCase("John Doe") && psw.equals("password"))
            return "names/home";
        else return "names/loginofficial";
    }
}



package com.example.helloworld.controllers;


import com.example.helloworld.model.User;
import com.example.helloworld.model.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "login")
public class LoginController {
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
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "names/loginofficial";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String loginAction(@RequestParam("uname") String name, @RequestParam("psw") String psw) {
        // do whatever you do to log in

        for (User user:UserData.getAll()) {
            if (user.getUname().equals(name) && user.getPsw().equalsIgnoreCase(psw))
                return "names/home";
        }
        return "names/loginofficial";
    }
}



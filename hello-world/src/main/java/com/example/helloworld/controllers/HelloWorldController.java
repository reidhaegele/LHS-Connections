package com.example.helloworld.controllers;

import com.example.helloworld.model.Names;
import com.example.helloworld.model.NamesData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "names")
public class HelloWorldController {
    @RequestMapping(value="", method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("names", NamesData.getAll());
        model.addAttribute("title", "Da Names");
        return "names/index";
    }
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddNameForm(Model model) {
        model.addAttribute("title", "Add Names");
        model.addAttribute(new Names());
        return "names/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddNameForm(@ModelAttribute @Valid Names newName,
                                       Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Name");
            return "names/add";
        }

        NamesData.add(newName);
        return "redirect:";
    }

}

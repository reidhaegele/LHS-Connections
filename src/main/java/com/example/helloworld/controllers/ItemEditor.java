package com.example.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "items")
public class ItemEditor
{
    @RequestMapping(value = "/{id}")
    public String show(Model model)
    {
     return "ItemPage";
    }

    @RequestMapping(value = "")
    public String test(Model model)
    {
        return "ItemPage";
    }
}

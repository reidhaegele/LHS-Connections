package com.example.helloworld.controllers;

import com.example.helloworld.model.ItemData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "items")
public class ItemEditor
{
    @RequestMapping(value = "/{id}")
    public String show(@PathVariable("id") String id, Model model)
    {
        model.addAttribute("item", ItemData.getBySer(id));
     return "ItemPage";
    }

    @RequestMapping(value = "")
    public String test(Model model)
    {
        return "ItemPage";
    }
}

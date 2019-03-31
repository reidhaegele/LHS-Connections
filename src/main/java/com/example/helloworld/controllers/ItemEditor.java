package com.example.helloworld.controllers;

import com.example.helloworld.model.Item;
import com.example.helloworld.model.ItemData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "items")
public class ItemEditor
{
    @RequestMapping(value = "/add")
    public String add(Model model)
    {
        return "itemcreate";
    }
    @PostMapping("/add")
    public String add(@RequestParam("ser") String ser, @RequestParam("mod") String mod, @RequestParam("cost") String cost, @RequestParam("price") String price, @RequestParam("dollarVar") String dollVar, @RequestParam("InvSoldOn") String invOn, @RequestParam("soldTo") String soldTo, @RequestParam("shippedTo") String shippedTo,@RequestParam("wStart") String wStart, @RequestParam("spiff") String spiff, @RequestParam("spiffTo") String spiffTo, @RequestParam("freight") String freight, @RequestParam("freightOut") String freightOut)
    {
        Item guy = new Item(ser, mod, cost, price, dollVar, invOn, soldTo,shippedTo, wStart, spiff, spiffTo, freight, freightOut);
        ItemData.add(guy);
        return "redirect:../home";
    }

    @RequestMapping(value = "/{id}")
    public String show(@PathVariable("id") String id, Model model)
    {
        model.addAttribute("item", ItemData.getBySer(id));
     return "ItemPage";
    }
    @PostMapping("/{id}")
    public String update(@PathVariable("id") String id, @RequestParam("cost") String cost, @RequestParam("mod") String mod, @RequestParam("price") String price, @RequestParam("dollarVar") String dollVar, @RequestParam("InvSoldOn") String invOn, @RequestParam("soldTo") String soldTo, @RequestParam("shippedTo") String shippedTo,@RequestParam("wStart") String wStart, @RequestParam("spiff") String spiff, @RequestParam("spiffTo") String spiffTo, @RequestParam("freight") String freight, @RequestParam("freightOut") String freightOut)
    {
        Item guy = ItemData.getBySer(id);
        guy.setCost(cost);
        guy.setModelNum(mod);
        guy.setDollarVar(dollVar);
        guy.setPrice(price);
        guy.setInvSoldOn(invOn);
        guy.setSoldTo(soldTo);
        guy.setShippedTo(shippedTo);
        guy.setWarrantyStart(wStart);
        guy.setSpiff(spiff);
        guy.setSpiffTo(spiffTo);
        guy.setFreightIn(freight);
        guy.setFreightOut(freightOut);
        return "redirect:../home";
    }
    @RequestMapping(value = "/{id}/delete")
    public String del(@PathVariable("id") String id, Model model)
    {
        ItemData.del(id);
        return "redirect:/home";
    }
}

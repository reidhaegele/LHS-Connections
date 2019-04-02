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
    public String add()
    {
        return "itemcreate";
    }
    @PostMapping("/add")
    public String add(@RequestParam("ser") String ser, @RequestParam("mod") String mod, @RequestParam("cost") String cost, @RequestParam("price") String price, @RequestParam("dollarVar") String dollVar, @RequestParam("InvSoldOn") String invOn, @RequestParam("soldTo") String soldTo, @RequestParam("shippedTo") String shippedTo,@RequestParam("wStart") String wStart, @RequestParam("spiff") String spiff, @RequestParam("spiffTo") String spiffTo, @RequestParam("freight") String freight, @RequestParam("freightOut") String freightOut)
    {
        Item edit = new Item(ser, mod, cost, price, dollVar, invOn, soldTo,shippedTo, wStart, spiff, spiffTo, freight, freightOut);
        ItemData.add(edit);
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
        Item edit = ItemData.getBySer(id);
        edit.setCost(cost);
        edit.setModelNum(mod);
        edit.setDollarVar(dollVar);
        edit.setPrice(price);
        edit.setInvSoldOn(invOn);
        edit.setSoldTo(soldTo);
        edit.setShippedTo(shippedTo);
        edit.setWarrantyStart(wStart);
        edit.setSpiff(spiff);
        edit.setSpiffTo(spiffTo);
        edit.setFreightIn(freight);
        edit.setFreightOut(freightOut);
        return "redirect:../home";
    }
    @RequestMapping(value = "/{id}/delete")
    public String del(@PathVariable("id") String id)
    {
        ItemData.del(id);
        return "redirect:/home";
    }
}

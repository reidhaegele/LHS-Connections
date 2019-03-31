package com.example.helloworld.model;


import java.util.ArrayList;
import java.util.LinkedList;

public class ItemData
{

    public static LinkedList<Item> items = new LinkedList<>();

    // getAll
    public static LinkedList<Item> getAll() {
        return items;
    }
    // add
    public static void add(Item newUser) {
        items.add(newUser);
    }

    public static Item getBySer(String ser)
    {
        Item out;
        for(Item item: items)
        {
            if(ser.equalsIgnoreCase(item.getSerNum()))
            {
                out = item;
            }
        }
        out = new Item("", "", "", "", "", "", "", "", "", "", "", "", "");
        return out;
    }
}
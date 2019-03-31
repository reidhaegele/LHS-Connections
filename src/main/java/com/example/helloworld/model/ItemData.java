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
                return out;
            }
        }
        out = new Item("", "", "", "", "", "", "", "", "", "", "", "", "");
        return out;
    }

    public static void del(String id)
    {
        for(int i = 0; i < items.size(); i++)
        {
            if(items.get(i).getSerNum().equalsIgnoreCase(id))
            {
                items.remove(i);
                break;
            }
        }
    }
}
package com.example.helloworld.controllers;

import com.example.helloworld.model.Item;
import java.util.LinkedList;

public class Tree {
    int param;
    ListNode root;
    public Tree(Item root, int param)
    {
        this.root = new ListNode(root);
        this.param = param;
    }
    public void add(Item val)
    {
        root.insert(val, param);
        this.print();
    }
    public LinkedList<Item> print()
    {
        LinkedList<Item> out = new LinkedList<Item>();
        root.printInOrder(out);
        for (Item item:out) {
            System.out.println(param + " dw " + item.getSerNum());
        }
        return out;
    }
}
class ListNode {
    ListNode left, right;
    Item data;

    public ListNode(Item data) {
        this.data = data;
    }

    public void setVal(Item val) {
        this.data = val;
    }

    public void insert(Item val, int param) {
        String[] stuff = val.getAll();
        String[] junk = data.getAll();
        if(param == 5 || param == 6 || param == 9) {
            if (stuff[param].compareTo(junk[param]) <= 0) {
                System.out.println("if " + stuff[param].compareTo(junk[param]));
                if (left == null)
                    left = new ListNode(val);

                else {
                    left.insert(val, param);
                }
            } else {
                System.out.println("else " + stuff[param].compareTo(junk[param]));
                if (right == null)
                    right = new ListNode(val);
                else
                    right.insert(val, param);
            }
        }
        else
        {
            if (Integer.parseInt(stuff[param]) <= Integer.parseInt(junk[param])) {
                System.out.println("if " + stuff[param].compareTo(junk[param]));
                if (left == null)
                    left = new ListNode(val);

                else {
                    left.insert(val, param);
                }
            } else {
                System.out.println("else " + stuff[param].compareTo(junk[param]));
                if (right == null)
                    right = new ListNode(val);
                else
                    right.insert(val, param);
            }
        }
    }
    public void printInOrder(LinkedList<Item> out)
    {
        if (left != null)
            left.printInOrder(out);
        out.add(data);
        if (right != null)
            right.printInOrder(out);
    }
}
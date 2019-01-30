package com.example.helloworld.model;

import java.util.ArrayList;

public class NamesData {

    static ArrayList<Names> names = new ArrayList<>();

    // getAll
    public static ArrayList<Names> getAll() {
        return names;
    }

    // add
    public static void add(Names newCheese) {
        names.add(newCheese);
    }

    // getById
    public static Names getById(int id) {

        Names theCheese = null;

        for (Names candidateCheese : names) {
            if (candidateCheese.getNameId() == id) {
                theCheese = candidateCheese;
            }
        }

        return theCheese;
    }

}

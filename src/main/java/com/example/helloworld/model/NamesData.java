package com.example.helloworld.model;

import java.util.ArrayList;

public class NamesData {

    static ArrayList<Names> names = new ArrayList<>();

    // getAll
    public static ArrayList<Names> getAll() {
        return names;
    }

    // add
    public static void add(Names newName) {
        names.add(newName);
    }

    // getById
    public static Names getById(int id) {

        Names theName = null;

        for (Names candidateName : names) {
            if (candidateName.getNameId() == id) {
                theName = candidateName;
            }
        }

        return theName;
    }
}
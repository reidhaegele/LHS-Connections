package com.example.helloworld.model;

import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.util.ArrayList;

public class UserData {

    static ArrayList<User> user = new ArrayList<>();

    // getAll
    public static ArrayList<User> getAll() {
        return user;
    }

    // add
    public static void add(User newUser) {
        user.add(newUser);
    }

    // getById
    public static User getById(int id) {

        User theUser = null;

        for (User candidateName : user) {
            if (candidateName.getUserId() == id) {
                theUser = candidateName;
            }
        }

        return theUser;
    }
}
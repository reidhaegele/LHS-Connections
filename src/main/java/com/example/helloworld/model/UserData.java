package com.example.helloworld.model;

import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.util.ArrayList;

public class UserData {

    private static ArrayList<User> users = new ArrayList<>();

    // getAll
    public static ArrayList<User> getAll() {
        return users;
    }

    // add
    public static void add(User newUser) {
        users.add(newUser);
    }

}
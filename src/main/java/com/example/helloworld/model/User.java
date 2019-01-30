package com.example.helloworld.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
    @NotNull
    @Size(min = 3, max = 15)
    private String username;

    private int nameId;
    private static int nextId = 1;

    public User(String username) {
        this();
        this.username = username;
    }

    public User() {
        nameId = nextId;
        nextId++;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getNameId() {
        return nameId;
    }

    public void setNameId(int nameId) {
        this.nameId = nameId;
    }


}

package com.example.helloworld.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Names {
    @NotNull
    @Size(min=3, max=15)
    private String name;

    private int nameId;
    private static int nextId = 1;

    public Names(String name) {
        this();
        this.name = name;
    }
    public Names() {
        nameId = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNameId() {
        return nameId;
    }

    public void setNameId(int nameId) {
        this.nameId = nameId;
    }
}

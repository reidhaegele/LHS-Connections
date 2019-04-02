package com.example.helloworld.model;

import org.hibernate.validator.constraints.Email;

import javax.validation.Valid;
import java.util.ArrayList;

public class User {

    private int userId;
    private String uname;
    private String psw;

    private static int nextUserId = 1;

    public User(String uname, String psw) {
        //ID
        userId = nextUserId;
        nextUserId++;
        //REQUIRED INFO
        this.uname = uname;
        this.psw = psw;
    }


    public int getUserId() {
        return userId;
    }

    public String getUname() {
        return uname;
    }

    public String getPsw() {
        return psw;
    }
}

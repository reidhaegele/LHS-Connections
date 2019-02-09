package com.example.helloworld.model;

import javax.validation.constraints.Size;
import java.util.ArrayList;

public class User {
    @Size(min = 9, max = 12)
    private int gradeLevel;
    private String firstName;
    private String lindberghEmail;
    private int userId;
    private String psw;
    private ArrayList<String> Classes;


    private static int nextUserId = 1;


    public User (String firstName, String psw) {
        userId = nextUserId;
        nextUserId++;
        this.psw=psw;
        this.firstName = firstName;
//        this.lastName = lastName;

    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLindberghEmail() {
        return lindberghEmail;
    }

    public int getUserId() {
        return userId;
    }

    public String getPsw() {
        return psw;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLindberghEmail(String lindberghEmail) {
        this.lindberghEmail = lindberghEmail;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public void setClasses(ArrayList<String> classes) {
        Classes = classes;
    }

    public static void setNextUserId(int nextUserId) {
        User.nextUserId = nextUserId;
    }
}

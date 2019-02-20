package com.example.helloworld.model;

import java.util.ArrayList;

public class User {

    private int userId;
    private String uname;
    private String psw;
    private String grade;
    private String contact;
    private String dname;
    private ArrayList<String> classes = new ArrayList<String>(0);

    private static int nextUserId = 1;

    public User(String uname, String psw, String grade, String contact,
                String fname, String lname, ArrayList<String> classes) {
        //ID
        userId = nextUserId;
        nextUserId++;
        //REQUIRED INFO
        this.uname = uname;
        this.psw = psw;
        this.grade = grade;
        this.contact = contact;
        //DISPLAY NAME INFO
        if (fname.equals("") && lname.equals(""))
            dname = uname;
        else if (lname.equals(""))
            dname = fname;
        else if (fname.equals(""))
            dname = lname;
        else
            dname = fname + " " + lname;
        //TUTORING INFO
        if (classes.isEmpty())
            this.classes.add("");
        else
            this.classes = classes;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setFname(String dname) {
        this.dname = dname;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public void setclasses(ArrayList<String> classes) {
        classes = classes;
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

    public String getGrade() {
        return grade;
    }

    public String getContact() {
        return contact;
    }

    public String getDname() {
        return dname;
    }

    public ArrayList<String> getClasses() {
        return classes;
    }
    public static int getNextUserId() {
        return nextUserId;
    }
}

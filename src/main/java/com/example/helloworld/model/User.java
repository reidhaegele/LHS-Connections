package com.example.helloworld.model;

import java.util.ArrayList;

public class User {

    private int userId;
    private String uname;
    private String psw;
    private String grade;
    private String contact;
    private String dname;
    public ArrayList<String> Subjects = new ArrayList<String>(0);
    private ArrayList<String> Classes = new ArrayList<String>(0);

    private static int nextUserId = 1;

    public User(String uname, String psw, String grade, String contact,
                String fname, String lname, ArrayList<String> Subjects, ArrayList<String> Classes) {
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
        if (Subjects.isEmpty()) {
            this.Subjects.add("");
            this.Classes.add("");
        }
        else {
            this.Subjects = Subjects;
            this.Classes = Classes;
        }
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

    public void setSubjects(ArrayList<String> subjects) {
        Subjects = subjects;
    }

    public void setClasses(ArrayList<String> classes) {
        Classes = classes;
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

    public ArrayList<String> getSubjects() {
        return Subjects;
    }

    public ArrayList<String> getClasses() {
        return Classes;
    }

    public static int getNextUserId() {
        return nextUserId;
    }
}

package com.example.helloworld.model;

import java.util.ArrayList;
//Math (Algebra 1, Algebra 2, Geometry, Trigonometry, Calculus)
//Science (Biology, Chemistry, Physics, Environmental Science)
//Social Studies (World History, U.S. History, U.S. Government, Psychology, Sociology, Geography)
//Language Arts (Literature, Language)
//Foreign Language (Spanish, German, French)
//Engineering (Design, Architecture, Digital Electronics, Programming)
public class User {

    private int userId;
    private String grade;
    private String fname;
    private String lname;

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
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

    public static void setNextUserId(int nextUserId) {
        User.nextUserId = nextUserId;
    }

    private String contact;
    private String uname;
    private String psw;
    public ArrayList<String> Subjects;
    private ArrayList<String> Classes;

    private static int nextUserId = 1;

    public User (String firstName, String psw) {
        Subjects.add("Math");
        userId = nextUserId;
        nextUserId++;
        this.psw=psw;
        this.firstName = firstName;
//        this.lastName = lastName;

        //TODO -> add validation for entered lindbergh email (use regex???)
//        this.lindberghEmail = lindberghEmail;
//
//        switch (gradeLevel) {
//            case GL_FRESHMAN:
//                this.gradeLevel = "Freshman";
//                break;
//            case GL_SOPHOMORE:
//                this.gradeLevel = "Sophomore";
//                break;
//            case GL_JUNIOR:
//                this.gradeLevel = "Junior";
//                break;
//            case GL_SENIOR:
//                this.gradeLevel = "Senior";
//                break;
//            default:
//                this.gradeLevel = null;
//        }
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
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
}

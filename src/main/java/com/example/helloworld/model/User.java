package com.example.helloworld.model;

public class User {

    public static final int GL_FRESHMAN = 1;
    public static final int GL_SOPHOMORE = 2;
    public static final int GL_JUNIOR = 3;
    public static final int GL_SENIOR = 4;

    private String gradeLevel;
    private String firstName;
    private String lastName;
    private String lindberghEmail;
    private int userId;
    private String psw;

    private static int nextUserId = 1;

    public User (String firstName, String psw) {
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

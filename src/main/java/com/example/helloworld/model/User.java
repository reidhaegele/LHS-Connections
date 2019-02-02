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

    private static int nextId = 1;

    public User (String firstName, String lastName, String lindberghEmail, int gradeLevel) {
        userId = nextId;
        nextId++;

        this.firstName = firstName;
        this.lastName = lastName;
        this.lindberghEmail = lindberghEmail;

        switch (gradeLevel) {
            case GL_FRESHMAN:
                this.gradeLevel = "Freshman";
                break;
            case GL_SOPHOMORE:
                this.gradeLevel = "Sophomore";
                break;
            case GL_JUNIOR:
                this.gradeLevel = "Junior";
                break;
            case GL_SENIOR:
                this.gradeLevel = "Senior";
                break;
            default:
                this.gradeLevel = null;
        }
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
}

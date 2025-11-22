package com.university.department.cse;

public class Course {
    private String courseName;
    private String code;

    public Course(String courseName, String code) {
        this.courseName = courseName;
        this.code = code;
    }

    public void printDetails() {
        System.out.println("Course: " + courseName + " (" + code + ")");
    }
}

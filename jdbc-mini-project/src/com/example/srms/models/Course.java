package com.example.srms.models;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private Long courseId;
    private String courseName;
    private String courseCode;
    private List<Subject> subjects = new ArrayList<>();

    public Course() {}

    public Course(Long courseId, String courseName, String courseCode) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseCode='" + courseCode + '\'' +
                '}';
    }
}

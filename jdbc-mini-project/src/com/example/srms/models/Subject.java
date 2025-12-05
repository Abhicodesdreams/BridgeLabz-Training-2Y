package com.example.srms.models;

public class Subject {
    private Long subjectId;
    private String subjectName;
    private String subjectCode;
    private int maxMarks;
    private int passMarks;
    private int marksObtained;

    public Subject() {}

    public Subject(Long subjectId, String subjectName, String subjectCode, int maxMarks, int passMarks) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
        this.maxMarks = maxMarks;
        this.passMarks = passMarks;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public int getPassMarks() {
        return passMarks;
    }

    public void setPassMarks(int passMarks) {
        this.passMarks = passMarks;
    }

    public int getMarksObtained() {
        return marksObtained;
    }

    public void setMarksObtained(int marksObtained) {
        this.marksObtained = marksObtained;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                ", subjectCode='" + subjectCode + '\'' +
                ", maxMarks=" + maxMarks +
                ", passMarks=" + passMarks +
                '}';
    }
}

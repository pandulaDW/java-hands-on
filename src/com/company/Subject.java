package com.company;

public class Subject {

    private final String subID;
    private final String name;
    private int maxMarks;
    private int marksObtained;

    public Subject(String subID, String name) {
        this.subID = subID;
        this.name = name;
    }

    public Subject(String subID, String name, int marksObtained) {
        this.subID = subID;
        this.name = name;
        this.marksObtained = marksObtained;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public void setMarksObtained(int marksObtained) {
        this.marksObtained = marksObtained;
    }

    public String getSubID() {
        return subID;
    }

    public String getName() {
        return name;
    }

    public boolean isQualified(int m) {
        return m >= this.maxMarks;
    }

    public String toString() {
        return String.format("\nSubject ID: %s \nName: %s \nMarks Obtained: %s", subID, name, marksObtained);
    }
}















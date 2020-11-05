package com.epam.kaliada.classes.simplestclasses.task3;

public class Student {
    private String lastnameAndInitials;
    private int numberOfGroup;
    private int[] marks = new int[5];

    public Student(String lastnameAndInitials, int numberOfGroup) {
        this.lastnameAndInitials = lastnameAndInitials;
        this.numberOfGroup = numberOfGroup;
    }

    public void setLastnameAndInitials(String lastnameAndInitials) {
        this.lastnameAndInitials = lastnameAndInitials;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public void setMark(int subjectNumber, int mark) {
        marks[subjectNumber - 1] = mark;
    }

    public String getLastnameAndInitials() {
        return lastnameAndInitials;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public int[] getMarks() {
        return marks;
    }
}

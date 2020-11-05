package com.epam.kaliada.classes.simplestclasses.task3;

public class Student {
    private String lastnameAndInitials;
    private int numberOfGroup;
    private int[] marks;

    public Student(String lastnameAndInitials, int numberOfGroup) {
        this.lastnameAndInitials = lastnameAndInitials;
        this.numberOfGroup = numberOfGroup;
    }

    public Student(String lastnameAndInitials, int numberOfGroup, int[] academicPerformance) {

        this.lastnameAndInitials = lastnameAndInitials;
        this.numberOfGroup = numberOfGroup;
        this.marks = academicPerformance;
    }

    public void setMarks(int[] marks) {

        this.marks = marks;
    }
}

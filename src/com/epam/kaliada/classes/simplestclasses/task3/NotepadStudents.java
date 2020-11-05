package com.epam.kaliada.classes.simplestclasses.task3;


public class NotepadStudents {
    private Student[] students;

    public NotepadStudents() {
        students = new Student[10];
    }

    public void studentCreator(String lastnameAndInitials, int numberOfGroup){
        Student student = new Student(lastnameAndInitials, numberOfGroup);
        for (int i = 0; i <= students.length; i++) {
            if (i == students.length){
                System.out.println("Notepad of students is full, create new");
                return;
            }
            if (students[i] == null){
                students[i] = student;
                break;
            }
        }
    }

    public void addStudentMark(String lastnameAndInitials, int numberOfGroup, int subjectNumber, int mark){
        if (subjectNumber < 1 || subjectNumber > 5){
            System.out.println("You entered wrong number of subject");
            return;
        }
        if (mark < 1 || mark > 10){
            System.out.println("You entered wrong mark");
            return;
        }
        boolean studentFound = false;
        int i = 0;
        while (!studentFound){
            if (i == students.length){
                System.out.println("Student not found");
                return;
            }
            if (students[i].getLastnameAndInitials() == lastnameAndInitials && students[i].getNumberOfGroup() == numberOfGroup){
                studentFound = true;
                students[i].setMark(subjectNumber, mark);
            }
            i++;
        }
    }
    public void printExcellentStudents(){
        for (int i = 0; i < students.length; i++) {
            int countExcellentMarks = 0;
            int countOtherMarks = 0;
            for (int j = 0; j < 5; j++) {
                if (students[i].getMarks()[j] == 9 || students[i].getMarks()[j] == 10){
                    countExcellentMarks++;
                }else if (students[i].getMarks()[j] > 0 && students[i].getMarks()[j] < 9){
                    countOtherMarks++;
                }
            }
            if (countExcellentMarks > 0 && countOtherMarks == 0){
                System.out.println(students[i].getLastnameAndInitials() + " " + students[i].getNumberOfGroup());
            }
        }
    }
}

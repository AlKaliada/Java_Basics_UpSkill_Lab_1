package com.epam.kaliada.classes.simplestclasses.task3;


public class NotepadStudents {
    private Student[] students;
    private int numberOfStudents;

    public NotepadStudents() {
        students = new Student[10];
    }

    public void addStudent(String lastnameAndInitials, int numberOfGroup){
        if (lastnameAndInitials == null || lastnameAndInitials.length() == 0 || numberOfGroup < 1){
            System.out.println("You entered wrong data");
            return;
        }
        if (numberOfStudents < students.length){
            Student student = new Student(lastnameAndInitials, numberOfGroup);
            students[numberOfStudents] = student;
            numberOfStudents++;
        }else {
            System.out.println("Notepad of students is full, create new");
        }
    }

    public void addStudentMark(String lastnameAndInitials, int numberOfGroup, int subjectNumber, int mark){
        if (lastnameAndInitials == null || lastnameAndInitials.length() == 0 || numberOfGroup < 1){
            System.out.println("You didn't enter student's lastname and initials");
            return;
        }
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
            if (students[i].getLastnameAndInitials().equals(lastnameAndInitials) && students[i].getNumberOfGroup() == numberOfGroup){
                studentFound = true;
                students[i].setMark(subjectNumber, mark);
            }
            i++;
        }
    }
    public String findExcellentStudents(){
        String listOfExcellentStudents = new String();
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
                listOfExcellentStudents = listOfExcellentStudents + students[i].getLastnameAndInitials() + students[i].getNumberOfGroup() + "\n";
            }
        }
        return listOfExcellentStudents;
    }

}

package com.epam.kaliada.classes.simplestclasses.task3;


public class NotepadStudents {
    private Student[] students;
    private int numberOfStudents;
    private final static int MIN_MARK = 1;
    private final static int MAX_MARK = 10;
    private final static int MIN_SUBJECT_NUMBER = 1;
    private final static int MAX_SUBJECT_NUMBER = 5;

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
        if (subjectNumber < MIN_SUBJECT_NUMBER || subjectNumber > MAX_SUBJECT_NUMBER){
            System.out.println("You entered wrong number of subject");
            return;
        }
        if (mark < MIN_MARK || mark > MAX_MARK){
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
    public String namesAndGroupsOfExcellentStudentsToString(){
        String listOfExcellentStudents = new String();
        for (int i = 0; i < students.length; i++) {
            int countExcellentMarks = 0;
            int countOtherMarks = 0;
            for (int j = 0; j < MAX_SUBJECT_NUMBER; j++) {
                if (students[i].getMarks()[j] == 9 || students[i].getMarks()[j] == MAX_MARK){
                    countExcellentMarks++;
                }else if (students[i].getMarks()[j] >= MIN_MARK && students[i].getMarks()[j] < 9){
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

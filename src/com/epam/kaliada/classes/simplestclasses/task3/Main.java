package com.epam.kaliada.classes.simplestclasses.task3;
//Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
// Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов,
// имеющих оценки, равные только 9 или 10.
public class Main {
    public static void main(String[] args) {
        NotepadStudents notepadStudents = new NotepadStudents();
        notepadStudents.addStudent("Tihanovskiy S.L.", 97);
        notepadStudents.addStudent("Babariko V.D.", 97);
        notepadStudents.addStudent("Tihanovskaya S.G.", 97);
        notepadStudents.addStudent("Babariko E.V.", 97);
        notepadStudents.addStudent("Kolesnikova M.A", 97);
        notepadStudents.addStudent("Znak M.A.", 97);
        notepadStudents.addStudent("Kaliada A.L.", 97);
        notepadStudents.addStudent("Lulu A.G.", 3);
        notepadStudents.addStudent("Kara Y.H.", 3);
        notepadStudents.addStudent("Hrenin V.G.", 3);
        notepadStudents.addStudentMark("Tihanovskiy S.L.", 97, 1, 10);
        notepadStudents.addStudentMark("Tihanovskiy S.L.", 97, 2, 10);
        notepadStudents.addStudentMark("Tihanovskiy S.L.", 97, 3, 10);
        notepadStudents.addStudentMark("Tihanovskiy S.L.", 97, 4, 10);
        notepadStudents.addStudentMark("Tihanovskiy S.L.", 97, 5, 10);
        notepadStudents.addStudentMark("Babariko V.D.", 97, 3, 10);
        notepadStudents.addStudentMark("Babariko V.D.", 97, 1, 9);
        notepadStudents.addStudentMark("Babariko V.D.", 97, 5, 9);
        notepadStudents.addStudentMark("Babariko V.D.", 97, 2, 10);
        notepadStudents.addStudentMark("Lulu A.G.", 3, 1, 1);
        notepadStudents.addStudentMark("Kara Y.H.", 3, 2, 1);
        notepadStudents.addStudentMark("Hrenin V.G.", 3, 4, 2);
        System.out.println(notepadStudents.namesAndGroupsOfExcellentStudentsToString());
    }
}

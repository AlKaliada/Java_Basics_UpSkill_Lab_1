package com.epam.kaliada.classes.simplestclasses.task3;
//Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
// Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов,
// имеющих оценки, равные только 9 или 10.
public class Main {
    public static void main(String[] args) {
        NotepadStudents notepadStudents = new NotepadStudents();
        notepadStudents.studentCreator("Tihanovskiy S.L.", 97);
        notepadStudents.studentCreator("Babariko V.D.", 97);
        notepadStudents.studentCreator("Tihanovskaya S.G.", 97);
        notepadStudents.studentCreator("Babariko E.V.", 97);
        notepadStudents.studentCreator("Kolesnikova M.A", 97);
        notepadStudents.studentCreator("Znak M.A.", 97);
        notepadStudents.studentCreator("Kaliada A.L.", 97);
        notepadStudents.studentCreator("Lukashenko A.G.", 3);
        notepadStudents.studentCreator("Karaev Y.H.", 3);
        notepadStudents.studentCreator("Hrenin V.G.", 3);
        notepadStudents.addStudentMark("Tihanovskiy S.L.", 97, 1, 10);
        notepadStudents.addStudentMark("Tihanovskiy S.L.", 97, 2, 10);
        notepadStudents.addStudentMark("Tihanovskiy S.L.", 97, 3, 10);
        notepadStudents.addStudentMark("Tihanovskiy S.L.", 97, 4, 10);
        notepadStudents.addStudentMark("Tihanovskiy S.L.", 97, 5, 10);
        notepadStudents.addStudentMark("Babariko V.D.", 97, 3, 10);
        notepadStudents.addStudentMark("Babariko V.D.", 97, 1, 9);
        notepadStudents.addStudentMark("Babariko V.D.", 97, 5, 9);
        notepadStudents.addStudentMark("Babariko V.D.", 97, 2, 10);
        notepadStudents.addStudentMark("Lukashenko A.G.", 3, 1, 1);
        notepadStudents.addStudentMark("Karaev Y.H.", 3, 2, 1);
        notepadStudents.addStudentMark("Hrenin V.G.", 3, 4, 2);
        notepadStudents.printExcellentStudents();
    }
}

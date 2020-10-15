package Basics_of_software_code_development.LinearPrograms;
//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
// Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.
public class Task5 {
    public static String transformationTime(int time){
        int hours = time / 60 / 60;
        int minutes = (time - hours * 60 * 60) / 60;
        int seconds = time - hours * 60 * 60 - minutes * 60;
        String result = hours + "ч " + minutes + "мин " + seconds + "с";
        return result;
    }
}

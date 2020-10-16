package com.epam.kaliada.basics_of_software_code_development.linearPrograms;
//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
// Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.
public class Task5 {
    public static String transformationTime(int time){
        final int SECONDS_IN_HOUR = 3600;
        final int SECONDS_IN_MINUTE = 60;
        int hours = time / SECONDS_IN_HOUR;
        int minutes = time * hours % SECONDS_IN_HOUR / 60;
        int seconds = time - hours * SECONDS_IN_HOUR - minutes * SECONDS_IN_MINUTE;
        String result = hours + "ч " + minutes + "мин " + seconds + "с";
        return result;
    }
}

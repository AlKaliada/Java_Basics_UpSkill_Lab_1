package com.epam.kaliada.javabasics.linearprograms;
//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
// Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.
public class Task5 {
    private static final int SECONDS_IN_HOUR = 60 * 60;
    private static final int SECONDS_IN_MINUTE = 60;
    public static String transformateTime(int time){
        int hours = time / SECONDS_IN_HOUR;
        int minutes = time * hours % SECONDS_IN_HOUR / SECONDS_IN_MINUTE;
        int seconds = time - hours * SECONDS_IN_HOUR - minutes * SECONDS_IN_MINUTE;
        String result = hours + "ч " + minutes + "мин " + seconds + "с";
        return result;
    }
}

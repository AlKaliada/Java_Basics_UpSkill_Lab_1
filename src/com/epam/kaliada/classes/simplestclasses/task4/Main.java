package com.epam.kaliada.classes.simplestclasses.task4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;

//Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
// Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
// Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны
// быть упорядочены по времени отправления.
public class Main {
    public static void main(String[] args) {
        String s1 = "23:34";
        LocalTime lk = LocalTime.parse(s1);
        NotepadTrains notepadTrains = new NotepadTrains();
        notepadTrains.addTrain("Minsk",2,lk);
        String time2 = "15:10";
        LocalTime localTime2 = LocalTime.parse(time2);
        notepadTrains.addTrain("Hroda", 1, localTime2);
        Train[] a = notepadTrains.sortTrainsByNumber();

        String[] s = {"Minsk", "mascow", "Kyiv"};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));





    }
}

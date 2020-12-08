package com.epam.kaliada.oop.task4;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
// Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и выбора сокровищ на заданную сумму.
public class Main {
    public static void main(String[] args) {
        try {
            ConsoleApplicationStarter starter = new ConsoleApplicationStarter();
            starter.startApplication();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}

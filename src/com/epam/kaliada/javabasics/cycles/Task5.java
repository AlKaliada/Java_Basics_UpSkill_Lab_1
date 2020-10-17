package com.epam.kaliada.javabasics.cycles;
//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера
public class Task5 {
    public static void writeSymbolsInASCII(){
        for (int i = 0; i <= 127; i++) {
            System.out.println(i + " - " + (char) i);
        }

    }
}

package com.epam.kaliada.javabasics.cycles;


//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
public class Task7 {
    public static void findTheSameDigitsInTwoNumbers(int a, int b){
        int e = b;
        while (a > 0){
            int c = a % 10;
            a = a / 10;
            b = e;
            while (b > 0){
                int d = b % 10;
                b = b / 10;
                if (c == d){
                    System.out.println(c);
                }
            }
        }
    }
}

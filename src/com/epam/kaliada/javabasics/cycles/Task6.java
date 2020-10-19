package com.epam.kaliada.javabasics.cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры
public class Task6 {
    public static void allDivisorsFromMtoN(int m, int n) {

        for (int i = m; i <= n; i++) {
            System.out.println("Divisors of " + i + ":");
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}

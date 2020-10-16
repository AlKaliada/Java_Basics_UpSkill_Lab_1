package com.epam.kaliada.basics_of_software_code_development.cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры
public class Task6 {
    public static void allDivisorsFromMtoN() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

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

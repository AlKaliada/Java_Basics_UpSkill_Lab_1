package Basics_of_software_code_development.Cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа.
public class Task1 {

    public static int sumNumbersFromOneToNumber() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
        }
        return result;
    }

}

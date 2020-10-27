package com.epam.kaliada.javaalgorithmization.decomposition;
//Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
// Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
// Для решения задачи использовать декомпозицию.
public class Task13 {
    public static void findNumbersTwins(int n){
        if (n <= 2){
            System.out.println("You entered wrong data. Enter n more than 2");
            return;
        }
        for (int i = n; i <= 2 * n - 2; i++) {
            if (isNumberPrime(i) && isNumberPrime(i + 2)){
                printNumbersTwins(i, i + 2);
            }
        }
    }
    private static boolean isNumberPrime(int a){
        if (a < 2){
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0){
                return false;
            }
        }
        return true;
    }
    private static void printNumbersTwins(int a, int b){
        System.out.println(a + " and " + b + " are numbers twins");
    }
}

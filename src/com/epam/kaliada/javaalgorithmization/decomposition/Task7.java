package com.epam.kaliada.javaalgorithmization.decomposition;
//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9
public class Task7 {
    public static void findSumFactorialsNotEvenNumbersFromOneToNine(){
        int sum = 0;
        for (int i = 1; i <= 9; i += 2) {
            sum += findFactorial(i);
        }

        System.out.println("Sum factorials not even numbers from one to nine = " + sum);
    }

    private static int findFactorial(int a){
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

package Basics_of_software_code_development.Cycles;

import java.util.ArrayList;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
public class Task7 {
    public static void findTheSameDigitsInTwoNumbers(int a, int b){
        ArrayList<Integer> firstNumber = new ArrayList<>();
        ArrayList<Integer> secondNumber = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        String numberA = "" + a;
        String numberB = "" + b;

        for (int i = 0; i < numberA.length(); i++) {
            firstNumber.add(a % 10);
            a = a / 10;
        }

        for (int i = 0; i < numberB.length(); i++) {
            secondNumber.add(b % 10);
            b = b / 10;
        }

        for (int i = 0; i < firstNumber.size(); i++) {
            for (int j = 0; j < secondNumber.size(); j++) {
                if (firstNumber.get(i) == secondNumber.get(j)){
                    int count = 0;
                    int cell = firstNumber.get(i);
                    for (int k = 0; k < result.size(); k++) {
                        if (result.get(k) == cell){
                            count++;
                            break;
                        }
                    }
                    if (count == 0){
                        result.add(firstNumber.get(i));
                    }
                }
            }
        }

        for (Integer i: result) {
            System.out.print(i + " ");
        }
    }

}

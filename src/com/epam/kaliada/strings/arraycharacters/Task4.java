package com.epam.kaliada.strings.arraycharacters;
//В строке найти количество чисел.
public class Task4 {
    public static void findCountOfNumbers(String string){
        if (string.length() == 0){
            throw new IllegalArgumentException("You entered empty string");
        }

        char[] chars = string.toCharArray();
        int count = 0;
        boolean firstDot = false;
        boolean digitInNumber = false;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i]) && !digitInNumber){
                count++;
                digitInNumber = true;
            }else if (Character.isDigit(chars[i]) && digitInNumber){
            }else if (chars[i] == '.' && digitInNumber && !firstDot){
                firstDot = true;
            }else {
                firstDot = false;
                digitInNumber = false;
            }
        }
        printCountOfNumbers(count);
    }

    private static void printCountOfNumbers(int count){
        System.out.println("String consist " + count + " numbers");
    }
}

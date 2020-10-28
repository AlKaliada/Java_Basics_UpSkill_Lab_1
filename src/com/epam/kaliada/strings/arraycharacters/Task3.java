package com.epam.kaliada.strings.arraycharacters;
//В строке найти количество цифр
public class Task3 {
    public static void findCountOfDigits(String string){
        if (string.length() == 0){
            throw new IllegalArgumentException("You entered empty string");
        }
        char[] chars = string.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])){
                count++;
            }
        }
        printCountOfDigits(count);
    }

    private static void printCountOfDigits(int count){
        System.out.println("String consist " + count + " digits");
    }
}

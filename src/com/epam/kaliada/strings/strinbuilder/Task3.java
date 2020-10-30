package com.epam.kaliada.strings.strinbuilder;
//Проверить, является ли заданное слово палиндромом.
public class Task3 {
    public static boolean isStringPalindromeFirst(String string){
        if (string.length() == 0){
            throw new IllegalArgumentException("You entered empty string");
        }

        int count = 0;
        int a = string.length()/2;

        for (int i = 0; i < (string.length() / 2); i++) {
            if(string.charAt(i) == string.charAt(string.length() - 1 - i)){
                count++;
            }else{
                break;
            }
        }
        return count == a;
    }

    public static boolean isStringPalindromeSecond(String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();
        String stringReverse = stringBuilder.toString();
        return string == stringReverse.intern();
    }
}

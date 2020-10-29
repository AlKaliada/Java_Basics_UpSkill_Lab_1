package com.epam.kaliada.strings.strinbuilder;
//Подсчитать, сколько раз среди символов заданной строки встречается буква “а”
public class Task5 {
    public static void countCharacterAInString(String string){
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println("String contains char a " + count + " times");
    }
}

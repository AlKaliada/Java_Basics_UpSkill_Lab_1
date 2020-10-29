package com.epam.kaliada.strings.strinbuilder;
//Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
public class Task1 {
    public static void findTheGreatestConsecutiveSpaces(String string){
        int max = 0;
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == ' '){
                count++;
            }else {
                count = 0;
            }
//            if (count > 0 && ch != ' '){
//                count = 0;                  //возможно так будет лучше вместо else, чтобы count не переприсваивался 0 каждый раз
//            }
            if (count > max){
                max = count;
            }
        }
        System.out.println("The greatest number of consecutive spaces is " + max);
    }
}

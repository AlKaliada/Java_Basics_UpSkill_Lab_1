package com.epam.kaliada.strings.strinbuilder;

import java.util.Locale;

//Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы.
public class Task9 {
    public static void countLowercaseAndUppercaseLetters(String string){
        int countLettersUpperCase = 0;
        int countLettersLowerCase = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.codePointAt(i) >= 65 && string.codePointAt(i) <= 90){
                countLettersUpperCase++;
            }else if (string.codePointAt(i) >= 97 && string.codePointAt(i) <= 122){
                countLettersLowerCase++;
            }
        }
        System.out.println("Letters in upper case - " + countLettersUpperCase);
        System.out.println("Letters in lower case - " + countLettersLowerCase);
    }

}

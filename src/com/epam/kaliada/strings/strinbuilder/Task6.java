package com.epam.kaliada.strings.strinbuilder;
//Из заданной строки получить новую, повторив каждый символ дважды.
public class Task6 {
    public static String createStringWithTwiceCharacters(String string){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            stringBuilder.append(string.charAt(i));
            stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();
    }
}

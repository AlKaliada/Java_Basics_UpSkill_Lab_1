package com.epam.kaliada.strings.arraycharacters;
// Замените в строке все вхождения 'word' на 'letter'
public class Task2 {
    public static String replaceWordToLetter(String string){
        if (string.length() == 0){
            throw new IllegalArgumentException("You entered empty string");
        }
        char[] chars = string.toCharArray();
        String result = new String();
        for (int i = 0; i < (chars.length - 3); i++) {
            if (chars[i] == 'w' && chars[i + 1] == 'o' && chars[i + 2] == 'r' && chars[i + 3] == 'd'){
                result += "letter";
                i += 3;
            }else {
                result += chars[i];
            }
        }
        return result;
    }
}

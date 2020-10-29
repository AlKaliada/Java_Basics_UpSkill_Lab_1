package com.epam.kaliada.strings.arraycharacters;
//Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы. Крайние пробелы в строке удалить.
public class Task5 {
    public static String deleteExtraSpaces(String string){
        if (string.length() == 0){
            throw new IllegalArgumentException("You entered an empty string");
        }
        char[] chars = string.toCharArray();
        String result = new String();
        int startText = 0;
        int endText = chars.length - 1;
        int a = 0;

        while (chars[a] == ' ' && a < chars.length - 1){
            startText++;
            a++;
        }

        int b = chars.length - 1;
        while (chars[b] == ' ' && b > 0){
            endText--;
            b--;
        }

        for (int i = startText; i <= endText; i++) {
            if (chars[i] != ' '){
                result += chars[i];
            }else if (chars[i] == ' ' && chars[i + 1] != ' '){
                result += chars[i];
            }
        }
        return result;
    }
}

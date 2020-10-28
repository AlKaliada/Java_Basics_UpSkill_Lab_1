package com.epam.kaliada.strings.arrayofcharacters;

import java.util.Arrays;

//Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
public class Task1 {

    public static void transformationStringArrayToSnakeCase(String[] variableNamesArray){
        for (int i = 0; i < variableNamesArray.length; i++) {
            variableNamesArray[i] = transformationStringToSnakeCase(variableNamesArray[i]);
        }
    }

    private static String transformationStringToSnakeCase(String string){
        char[] chars = string.toCharArray();

        if (Character.isUpperCase(chars[0])){
            chars[0] = Character.toLowerCase(chars[0]);
        }
        for (int i = 1; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])){
                chars[i] = Character.toLowerCase(chars[i]);
                char[] chars1;
                chars1 = Arrays.copyOfRange(chars,0,i);
                chars1[i] = '_';
                chars1 = Arrays.copyOfRange(chars, (i + 1), (chars.length - 1));
                chars = chars1;
            }
        }
        return new String(chars);
    }
}
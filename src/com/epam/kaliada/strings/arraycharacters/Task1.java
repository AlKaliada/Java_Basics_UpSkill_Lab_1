package com.epam.kaliada.strings.arraycharacters;


//Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
public class Task1 {
    public static void transformationArrayStringToSnakeCase(String[] variableNamesArray){
        if (variableNamesArray.length == 0){
            System.out.println("You entered an empty array");
            return;
        }
        for (int i = 0; i < variableNamesArray.length; i++) {
        variableNamesArray[i] = transformationStringToSnakeCase(variableNamesArray[i]);
        }
    }
    private static String transformationStringToSnakeCase(String string){
        char[] chars = string.toCharArray();
        String result = new String();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i]) && i != 0){
                result = result + "_" + Character.toLowerCase(chars[i]);
            }else if(Character.isUpperCase(chars[i]) && i == 0){
                result += Character.toLowerCase(chars[i]);
            }else {
                result += chars[i];
            }
        }
        return result;
    }

}

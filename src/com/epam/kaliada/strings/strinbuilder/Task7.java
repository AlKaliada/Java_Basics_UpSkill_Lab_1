package com.epam.kaliada.strings.strinbuilder;
//Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
// Например, если было введено "abc cde def", то должно быть выведено "abcdef".
public class Task7 {
    public static String deleteSpacesAndRecurringCharacters(String string){
        String result = new String();
        for (int i = 0; i < string.length(); i++) {
            if (result.indexOf(string.charAt(i)) == -1 && string.charAt(i) != ' '){
                result += string.charAt(i);
            }
        }
        return result;
    }
}

package com.epam.kaliada.strings.strinbuilder;
//Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
// Случай, когда самых длинных слов может быть несколько, не обрабатывать.
public class Task8 {
    public static void findLongestWord(String string){
        String[] stringsArray = string.split(" ");
        int indexOfLongestWord = 0;
        for (int i = 1; i < stringsArray.length; i++) {
            if (stringsArray[i].length() > stringsArray[indexOfLongestWord].length()){
                indexOfLongestWord = i;
            }
        }
        System.out.println(stringsArray[indexOfLongestWord]);
    }
}

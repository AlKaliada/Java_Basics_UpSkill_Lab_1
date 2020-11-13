package com.epam.kaliada.strings.strinbuilder;
//С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”
public class Task4 {
    public static void transformationInformaticsToCake(){
        String informatics = "информатика";
        char[] cakeCharArray = {'т', 'о', 'р', 'т'};
        String cake = new String();
        for (int i = 0; i < cakeCharArray.length; i++) {
            int indexOfLetter = informatics.indexOf(cakeCharArray[i]);
            cake += informatics.substring(indexOfLetter, (indexOfLetter + 1));
        }
        System.out.println(cake);
    }

}

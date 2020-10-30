package com.epam.kaliada.strings.strinbuilder;
//Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
// восклицательным или вопросительным знаком. Определить количество предложений в строке X.
public class Task10 {
    public static void countSentencesInString(String string){
        if (string.length() == 0){
            System.out.println("You entered an empty string");
            return;
        }
        int countSentences = 0;
        for (int i = 0; i < (string.length() - 1); i++) {
            if ((string.charAt(i) == '.' || string.charAt(i) == '!' || string.charAt(i) == '?') && string.charAt(i + 1) == ' '){
                countSentences++;
            }
        }
        if (string.charAt(string.length() - 1) == '.' || string.charAt(string.length() - 1) == '!' || string.charAt(string.length() - 1) == '?' ){
            countSentences++;
        }
        System.out.println("String consist " + countSentences + " sentences");
    }
}

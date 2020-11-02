package com.epam.kaliada.strings.regepressionstask1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortLexeme {
    private String string;
    private char symbol;
    private SplitString splitString;

    public SortLexeme(String string, char symbol) {
        this.string = string;
        this.symbol = symbol;
    }
    public String sortLexemesByNumberOfEnteredCharacterInSentences(){
        splitString = new SplitString();
        String[] arrayOfSentences = splitString.createArrayOfSentences(string);
        for (int i = 0; i < arrayOfSentences.length; i++) {
            arrayOfSentences[i] = sortSentenceByNumberOfEnteredCharacter(arrayOfSentences[i]);
        }
        return String.join("\n", arrayOfSentences);
    }
    private String sortSentenceByNumberOfEnteredCharacter(String string){
        String[] arrayOfLexemes = splitString.createArrayOfWords(string);
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < (arrayOfLexemes.length - 1); i++) {
                if (countNumberOfEnteredCharacter(arrayOfLexemes[i]) < countNumberOfEnteredCharacter(arrayOfLexemes[i + 1])){
                    String str = arrayOfLexemes[i];
                    arrayOfLexemes[i] = arrayOfLexemes[i + 1];
                    arrayOfLexemes[i + 1] = str;
                    sorted = false;
                }else if (countNumberOfEnteredCharacter(arrayOfLexemes[i]) == countNumberOfEnteredCharacter(arrayOfLexemes[i + 1]) && !checkTwoWordsSortedAlphabetically(arrayOfLexemes[i], arrayOfLexemes[i + 1])){
                    String str = arrayOfLexemes[i];
                    arrayOfLexemes[i] = arrayOfLexemes[i + 1];
                    arrayOfLexemes[i + 1] = str;
                    sorted = false;
                }
            }
        }
        return String.join(" ", arrayOfLexemes);
    }
    private boolean checkTwoWordsSortedAlphabetically(String first, String second){
        String[] strArray = {first.toLowerCase(), second.toLowerCase()};
        Arrays.sort(strArray);
        return first.toLowerCase().equals(strArray[0]);
    }
    private int countNumberOfEnteredCharacter(String string){
        String symbolString = String.valueOf(symbol);
        Pattern pattern = Pattern.compile(symbolString);
        Matcher matcher = pattern.matcher(string);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        return count;
    }
}

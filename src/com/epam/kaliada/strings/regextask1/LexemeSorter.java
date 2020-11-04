package com.epam.kaliada.strings.regextask1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexemeSorter {
    private String text;
    private char symbol;
    private TextSplitter textSplitter;

    public LexemeSorter(String text, char symbol) {
        this.text = text;
        this.symbol = symbol;
    }
    public String sortLexemesByNumberOfEnteredSymbolInSentences(){
        textSplitter = new TextSplitter();
        String[] sentences = textSplitter.splitTextIntoSentences(text);
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sortSentenceByNumberOfEnteredCharacter(sentences[i]);
        }
        return String.join("\n", sentences);
    }
    private String sortSentenceByNumberOfEnteredCharacter(String string){
        String[] arrayOfLexemes = textSplitter.splitTextIntoWords(string);
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < (arrayOfLexemes.length - 1); i++) {
                if (countNumberOfEnteredSymbol(arrayOfLexemes[i]) < countNumberOfEnteredSymbol(arrayOfLexemes[i + 1])){
                    String str = arrayOfLexemes[i];
                    arrayOfLexemes[i] = arrayOfLexemes[i + 1];
                    arrayOfLexemes[i + 1] = str;
                    sorted = false;
                }else if (countNumberOfEnteredSymbol(arrayOfLexemes[i]) == countNumberOfEnteredSymbol(arrayOfLexemes[i + 1]) && !checkTwoWordsSortedAlphabetically(arrayOfLexemes[i], arrayOfLexemes[i + 1])){
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
    private int countNumberOfEnteredSymbol(String string){
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

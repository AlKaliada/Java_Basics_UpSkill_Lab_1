package com.epam.kaliada.strings.regextask1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextSorter {
    public String sortParagraphsBySentencesCount(String[] paragraphs){
        TextSplitter textSplitter = new TextSplitter();
        for (int i = 1; i < paragraphs.length; i++) {
            int k = i;
            while (k > 0 && textSplitter.splitTextIntoSentences(paragraphs[k]).length < textSplitter.splitTextIntoSentences(paragraphs[k - 1]).length){
                String str = paragraphs[k];
                paragraphs[k] = paragraphs[k - 1];
                paragraphs[k - 1] = str;
                k --;
            }
        }
        return String.join("\n", paragraphs);
    }

    public String sortWordsInSentenceByLength(String sentence){
        if (sentence.matches("(.|\\s)*[!.?]+(.|\\s)*")){
            throw new IllegalArgumentException("Your text is not split into sentences");
        }
        TextSplitter textSplitter = new TextSplitter();
        String[] words = textSplitter.splitTextIntoWords(sentence);
        for (int i = 1; i < words.length; i++) {
            int k = i;
            while (k > 0 && (words[k].length() < words[k - 1].length())){
                String str = words[k];
                words[k] = words[k - 1];
                words[k - 1] = str;
                k --;
            }
        }
        return String.join(" ", words);
    }

    public String sortLexemesInSentenceByNumberOfEnteredSymbol(String sentence, char symbol){
        if (sentence.matches("(.|\\s)*[!.?]+(.|\\s)*")){
            throw new IllegalArgumentException("Your text is not split into sentences");
        }
        TextSplitter textSplitter = new TextSplitter();
        String[] arrayOfLexemes = textSplitter.splitTextIntoWords(sentence);
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < (arrayOfLexemes.length - 1); i++) {
                if (countNumberOfEnteredSymbol(arrayOfLexemes[i], symbol) < countNumberOfEnteredSymbol(arrayOfLexemes[i + 1], symbol)){
                    String str = arrayOfLexemes[i];
                    arrayOfLexemes[i] = arrayOfLexemes[i + 1];
                    arrayOfLexemes[i + 1] = str;
                    sorted = false;
                }else if (countNumberOfEnteredSymbol(arrayOfLexemes[i], symbol) == countNumberOfEnteredSymbol(arrayOfLexemes[i + 1], symbol) && !checkTwoWordsSortedAlphabetically(arrayOfLexemes[i], arrayOfLexemes[i + 1])){
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
    private int countNumberOfEnteredSymbol(String string, char symbol){
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

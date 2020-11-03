package com.epam.kaliada.strings.regepressionstask1;

public class SplitString {
    public String[] createsArrayOfParagraphs(String string){
        return string.split("\n\\s?");
    }
    public String[] createArrayOfSentences(String string){
        return string.split("[!?.]+\\s*");
    }
    public String[] createArrayOfWords(String string){
        return string.split("\b");
    }
}

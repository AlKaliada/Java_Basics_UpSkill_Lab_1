package com.epam.kaliada.strings.regextask1;

public class TextSplitter {
    public String[] splitTextIntoParagraphs(String string){
        return string.split("\n\\s?");
    }
    public String[] splitTextIntoSentences(String string){
        return string.split("[!?.]+\\s*");
    }
    public String[] splitTextIntoWords(String string){
        return string.split("[:\\-,;.?!\\s]+");
    }
}

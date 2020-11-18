package com.epam.kaliada.classes.aggregation.task1;

public class Word {
    String word;

    public Word(char...chars) {
        this.word = String.valueOf(chars);
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}

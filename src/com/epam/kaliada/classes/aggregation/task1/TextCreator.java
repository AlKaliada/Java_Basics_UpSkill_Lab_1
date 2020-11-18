package com.epam.kaliada.classes.aggregation.task1;

public class TextCreator {
    public static Text createText(String heading, Sentence...sentences){
        if (sentences == null || sentences.length == 0){
            throw new IllegalArgumentException("You entered wrong data");
        }
        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i] == null || sentences[i].getSentence() == null){
                throw new IllegalArgumentException("You entered wrong data");
            }
        }
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < sentences.length; i++) {
            text.append(sentences[i].getSentence());
        }
        return new Text(heading, text.toString());
    }
}

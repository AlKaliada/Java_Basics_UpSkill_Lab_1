package com.epam.kaliada.classes.aggregation.task1;

public class SentenceCreator {
    public static Sentence createSentence(Word...words){
        if (words == null || words.length == 0){
            throw new IllegalArgumentException("You entered wrong data");
        }
        for (int i = 0; i < words.length; i++) {
            if (words[i] == null || words[i].getWord() == null){
                throw new IllegalArgumentException("You entered wrong data");
            }
        }
        StringBuilder sentence = new StringBuilder(new String());
        for (int i = 0; i < words.length; i++) {
            sentence.append(words[i].getWord()).append(" ");
        }
        sentence = new StringBuilder(sentence.toString().strip() + ". ");
        return new Sentence(sentence.toString());
    }
}

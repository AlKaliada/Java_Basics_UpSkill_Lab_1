package com.epam.kaliada.strings.regepressionstask1;

public class Main {
    public static void main(String[] args) {
        String string = "Hello! How are you!?\n I'm fine. Thank you. And, how about you?\n So-so.";
//        SortString sortString = new SortString(string);
//        System.out.println(sortString.sortStringByCountSentencesInParagraph());

        SortSentences sortSentences = new SortSentences(string);
        System.out.println(sortSentences.sortWordsByLengthInSentences());
//
//        SortLexeme sortLexeme = new SortLexeme(string, 'a');
//        System.out.println(sortLexeme.sortLexemesByNumberOfEnteredCharacterInSentences());


    }
}

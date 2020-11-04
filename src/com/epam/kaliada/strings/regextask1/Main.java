package com.epam.kaliada.strings.regextask1;

public class Main {
    public static void main(String[] args) {
        String string = "Hello! How are you!?\n I'm fine. Thank you. And, how about you?\n So-so.";
//        ParagraphsSorter paragraphsSorter = new ParagraphsSorter(string);
//        System.out.println(paragraphsSorter.sortByCountSentences());

//        WordsSorter wordsSorter = new WordsSorter(string);
//        System.out.println(wordsSorter.sortByLengthInSentences());
//
        LexemeSorter lexemeSorter = new LexemeSorter(string, 'a');
        System.out.println(lexemeSorter.sortLexemesByNumberOfEnteredSymbolInSentences());

    }
}

package com.epam.kaliada.strings.regextask1;

public class Main {
    public static void main(String[] args) {
        try {
            String text = "Hello! How are you!?\n I'm fine. Thank you. And, how about you?\n So-so.";
            TextSplitter textSplitter = new TextSplitter();
            String[] textArrayOfParagraphs = textSplitter.splitTextIntoParagraphs(text);
            TextSorter textSorter = new TextSorter();
            System.out.println(textSorter.sortParagraphsBySentencesCount(textArrayOfParagraphs));

            String[] textArrayOfSentences = textSplitter.splitTextIntoSentences(text);
            for (int i = 0; i < textArrayOfSentences.length; i++) {
                textArrayOfSentences[i] = textSorter.sortWordsInSentenceByLength(textArrayOfSentences[i]);
                System.out.println(textArrayOfSentences[i]);
            }

            System.out.println(textSorter.sortLexemesInSentenceByNumberOfEnteredSymbol(textArrayOfSentences[4], 'a'));


        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }



    }
}

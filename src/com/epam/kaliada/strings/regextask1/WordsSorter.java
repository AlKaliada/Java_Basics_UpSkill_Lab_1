package com.epam.kaliada.strings.regextask1;


public class WordsSorter {
    private String text;
    private TextSplitter textSplitter;

    public WordsSorter(String text) {
        this.text = text;
    }

    public String splitIntoSentencesAndSortByLength(){
        textSplitter = new TextSplitter();
        String[] sentences = textSplitter.splitTextIntoSentences(text);
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sortByLength(sentences[i]);
        }
        return String.join("\n", sentences);
    }
    private String sortByLength(String string){
        String[] words = textSplitter.splitTextIntoWords(string);
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
}

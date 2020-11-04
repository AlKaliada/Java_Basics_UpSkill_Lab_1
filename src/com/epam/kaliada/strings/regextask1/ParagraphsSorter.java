package com.epam.kaliada.strings.regextask1;

public class ParagraphsSorter {
    private String text;

    public ParagraphsSorter(String text) {
        this.text = text;
    }

    public String sortByCountSentences(){
        TextSplitter textSplitter = new TextSplitter();
        String[] paragraphs = textSplitter.splitTextIntoParagraphs(text);
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
}

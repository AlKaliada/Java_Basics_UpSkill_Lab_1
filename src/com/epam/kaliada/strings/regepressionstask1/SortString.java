package com.epam.kaliada.strings.regepressionstask1;

public class SortString {
    private String string;

    public SortString(String string) {
        this.string = string;
    }

    public String sortStringByCountSentencesInParagraph(){
        SplitString splitString = new SplitString();
        String[] arrayOfParagraphs = splitString.createsArrayOfParagraphs(string);
        for (int i = 1; i < arrayOfParagraphs.length; i++) {
            int k = i;
            while (k > 0 && splitString.createArrayOfSentences(arrayOfParagraphs[k]).length < splitString.createArrayOfSentences(arrayOfParagraphs[k - 1]).length){
                String str = arrayOfParagraphs[k];
                arrayOfParagraphs[k] = arrayOfParagraphs[k - 1];
                arrayOfParagraphs[k - 1] = str;
                k --;
            }
        }
        return String.join("\n", arrayOfParagraphs);
    }
}

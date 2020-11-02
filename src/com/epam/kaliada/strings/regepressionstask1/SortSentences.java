package com.epam.kaliada.strings.regepressionstask1;


public class SortSentences {
    private String string;
    private SplitString splitString;

    public SortSentences(String string) {
        this.string = string;
    }

    public String sortWordsByLengthInSentences(){
        splitString = new SplitString();
        String[] arrayOfSentences = splitString.createArrayOfSentences(string);
        for (int i = 0; i < arrayOfSentences.length; i++) {
            arrayOfSentences[i] = sortWordsByLength(arrayOfSentences[i]);
        }
        return String.join("\n", arrayOfSentences);
    }
    private String sortWordsByLength(String string){
        String[] arrayOfWords = splitString.createArrayOfWords(string);
        for (int i = 1; i < arrayOfWords.length; i++) {
            int k = i;
            while (k > 0 && (arrayOfWords[k].length() < arrayOfWords[k - 1].length())){
                String str = arrayOfWords[k];
                arrayOfWords[k] = arrayOfWords[k - 1];
                arrayOfWords[k - 1] = str;
                k --;
            }
        }
        return String.join(" ", arrayOfWords);
    }
}

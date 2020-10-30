package com.epam.kaliada.strings.regepressionstask1;

import java.util.Arrays;

public class SortString {
    public static void createsArrayOfParagraphs(String string){
        String[] strArray = string.split("\n");

        for (int i = 1; i < strArray.length; i++) {
            int k = i;
            while (k > 0 && (countSentencesInParagraph(strArray[k]) < countSentencesInParagraph(strArray[k - 1]))){
                String str = strArray[k];
                strArray[k] = strArray[k - 1];
                strArray[k - 1] = str;
                k --;
            }
        }
        System.out.println(Arrays.toString(strArray));
    }
//    public static int[] createArrayWithQuantitySentencesInParagraphs(String[] strArray){
//        int[] quantitySentencesInParagraphs = new int[strArray.length];
//        for (int i = 0; i < quantitySentencesInParagraphs.length; i++) {
//            quantitySentencesInParagraphs[i] = countSentencesInParagraph(strArray[i]);
//        }
//        return quantitySentencesInParagraphs;
//    }
    public static int countSentencesInParagraph(String string){
        String[] strArray = string.split("[!?.] ");
        return strArray.length;
    }
}

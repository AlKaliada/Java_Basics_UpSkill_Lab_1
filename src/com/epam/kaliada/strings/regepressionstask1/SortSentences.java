package com.epam.kaliada.strings.regepressionstask1;

import java.util.Arrays;

public class SortSentences {
    public static void createArrayOfSentences(String string){
        String[] strArray = string.split("[!?.] ");
        StringBuilder stringBuilder = new StringBuilder(strArray[strArray.length - 1]);
        strArray[strArray.length - 1] = stringBuilder.substring(0, stringBuilder.length() - 1);
        sortSentencesByLength(strArray);
        System.out.println(Arrays.toString(strArray));
    }
    public static void sortSentencesByLength(String[] strArray){
        for (int i = 1; i < strArray.length; i++) {
            int k = i;
            while (k > 0 && (strArray[k].length() < strArray[k - 1].length())){
                String str = strArray[k];
                strArray[k] = strArray[k - 1];
                strArray[k - 1] = str;
                k --;
            }
        }
    }
}

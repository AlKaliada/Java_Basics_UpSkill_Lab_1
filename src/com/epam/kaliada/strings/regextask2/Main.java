package com.epam.kaliada.strings.regextask2;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String stringXml ="<notes>\n" +
                "   <note id = \"1\">\n" +
                "       <to>Вася</to>\n" +
                "       <from>Света</from>\n" +
                "       <heading>Напоминание</heading>\n" +
                "       <body>Позвони мне завтра!</body>\n" +
                "   </note>\n" +
                "   <note id = \"2\">\n" +
                "       <to>Петя</to>\n" +
                "       <from>Маша</from>\n" +
                "       <heading>Важное напоминание</heading>\n" +
                "       <body/>\n" +
                "   </note>\n" +
                "</notes>";

        NotepadXml notepadXml = new NotepadXml();
        notepadXml.parsingXmlDocument(stringXml);
        System.out.println(Arrays.deepToString(notepadXml.getNodes()));
    }
}

package com.epam.kaliada.strings.strinbuilder;
// В строке вставить после каждого символа 'a' символ 'b'.
public class Task2 {
    public static String insertCharacterBAfterEveryCharacterA(String string){
        string = string.replaceAll("a", "ab");
        return string;
    }
}

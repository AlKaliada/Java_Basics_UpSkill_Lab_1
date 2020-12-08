package com.epam.kaliada.oop.task1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
    try {
        Directory directory1 = new Directory("data/s/d");
        FileMy fileMy = new FileMy("name", "text");
        TextFile textFile = new TextFile(fileMy, directory1);
        textFile.createTextFile();
        textFile.renameTextFile("w");
        textFile.printTextFile();
        textFile.addTextFile("qwq");
        textFile.printTextFile();
        textFile.deleteTextFile();
        textFile.createTextFile();
        textFile.renameTextFile("new");
    }catch (IOException e){
        e.printStackTrace();
    }


    }
}

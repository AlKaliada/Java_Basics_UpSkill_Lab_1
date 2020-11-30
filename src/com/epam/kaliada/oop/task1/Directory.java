package com.epam.kaliada.oop.task1;


import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;

public class Directory {
    private String directory;

    public Directory(String directory) {
        this.directory = directory;
        try {
            Files.createDirectories(Paths.get(directory));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getDirectory() {
        return directory;
    }
}

package com.epam.kaliada.oop.task1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class TextFile {
    private FileMy fileMy;
    private Directory directory;
    private Path path;

    public TextFile(FileMy fileMy, Directory directory) {
        this.fileMy = fileMy;
        this.directory = directory;
        path = Paths.get(directory.getDirectory() + "/" + fileMy.getName() + ".txt");
    }

    public void createTextFile() throws IOException{
        if (!Files.exists(path)){
            Files.createFile(path);
            Files.write(path, fileMy.getText().getBytes());
        }
    }

    public void renameTextFile(String name) throws IOException{
        if (Files.exists(Paths.get(directory.getDirectory() + "/" + name + ".txt"))){
            Files.delete(Paths.get(directory.getDirectory() + "/" + name + ".txt"));
        }
        Files.move(path, path.resolveSibling(name + ".txt"));
        path = Paths.get(directory.getDirectory() + "/" + name + ".txt");
    }

    public void printTextFile() throws IOException{
        List<String> list = Files.readAllLines(path);
        for (String str : list) {
            System.out.println(str);
        }
    }

    public void addTextFile(String string) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile(), true))){
            writer.write(string);
        }
    }

    public void deleteTextFile() throws IOException{
        Files.delete(path);
    }
}

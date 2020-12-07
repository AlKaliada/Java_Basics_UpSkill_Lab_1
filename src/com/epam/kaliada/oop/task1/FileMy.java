package com.epam.kaliada.oop.task1;


public class FileMy {
    private String name;
    private String text;

    public FileMy(String name, String text) {
        if (name.matches("[^<>:\\/|?*]+[^<>:\\/|?*.\\s]")){
            this.name = name;
            this.text = text;
        }else {
            throw new IllegalArgumentException("No valid file name (prohibited symbols < > : \\ / | ? * and . and space in the end)");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

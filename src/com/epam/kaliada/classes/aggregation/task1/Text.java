package com.epam.kaliada.classes.aggregation.task1;

public class Text {
    private String heading;
    private String text;

    public Text(String heading, String text) {
        this.heading = heading;
        this.text = text;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public void addText(Sentence sentence){
        text += sentence.getSentence();
    }
    public void addText(Word word){
        text += word.getWord();
    }
    public void printHeading(){
        System.out.println(heading);
    }
    public void printText(){
        System.out.println(text);
    }

}

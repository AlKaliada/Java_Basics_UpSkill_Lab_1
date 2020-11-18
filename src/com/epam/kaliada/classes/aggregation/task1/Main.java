package com.epam.kaliada.classes.aggregation.task1;
//Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на консоль текст, заголовок текста.
public class Main {
    public static void main(String[] args) {
        try {
            Word word1 = new Word('h', 'e', 'l', 'l', 'o');
            Word word2 = new Word('w', 'o', 'r', 'l', 'd');
            Sentence sentence1 = SentenceCreator.createSentence(word1, word2);
            Word word3 = new Word('h', 'i');
            Word word4 = new Word('w', 'o', 'r', 'l', 'd');
            Sentence sentence2 = SentenceCreator.createSentence(word3, word4);

            Text text = TextCreator.createText("new text", sentence1, sentence2);
            text.printHeading();
            text.printText();

            text.addText(sentence2);
            text.printText();

            Word word5 = new Word('n', 'e', 'w');
            text.addText(word5);
            text.printText();
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}

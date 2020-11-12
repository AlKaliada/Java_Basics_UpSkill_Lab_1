package com.epam.kaliada.classes.simplestclasses.task5;
//Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
// Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
// Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
// Написать код, демонстрирующий все возможности класса.
public class Main {
    public static void main(String[] args) {
        Integer[] i = {1, 2, 3, 43, 5};
        printArgCount(7, "No", true, null);
        printArgCount(i, i, i);
        printArgCount(i, 4, 42);
        printArgCount(i);
//        printArgCount(42, 7);

    }
    public static void printArgCount(Object...args){
        System.out.println("Object args: " + args.length);
    }
    public static void printArgCount(Integer[]...args) {
        System.out.println("Integer[] args: " + args.length);
    }
    public static void printArgCount(int...args) {
        System.out.println("int args: " + args.length);
    }

}

package com.epam.kaliada.classes.simplestclasses.task9;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

//Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод  toString().
// Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
//
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//
//Найти и вывести:
//
//a) список книг заданного автора;
//
//b) список книг, выпущенных заданным издательством;
//
//c) список книг, выпущенных после заданного года.
public class Main {
    public static void main(String[] args) {
        try {
            BookCreator bookCreator = new BookCreator();
            Book book1 = bookCreator.createBook("Kalasy", "Polymia", 2020, 444, 20.758, "hardcover", "Karatkevich");
            Book book2 = bookCreator.createBook("Philosovia Java", "SPb", 2019, 1168, 70.65, "punch and bind", "Eckel");
            Book book3 = bookCreator.createBook("Library", "Dialectica", 2020, 976, 46, "hardcover", "Horsman", "Kornel");
            Book book4 = bookCreator.createBook("Programing", "Polymia", 2015, 700, 74.4, "hardcover", "Blinou", "Eckel");

            NotepadBooks notepadBooks = new NotepadBooks(book1, book2, book3, book4);
            List<Book> books = new ArrayList<>();
//            books = notepadBooks.findBooksByAuthor("eckel");
//            books = notepadBooks.findBooksByPublishingHouse("polymia");
            books = notepadBooks.findBooksOverYear(2019);
            for (Book book: books) {
                System.out.println(book.toString());
            }

        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }




    }
}

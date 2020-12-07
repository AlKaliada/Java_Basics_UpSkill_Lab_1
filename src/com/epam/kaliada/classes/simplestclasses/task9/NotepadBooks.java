package com.epam.kaliada.classes.simplestclasses.task9;

import java.util.ArrayList;
import java.util.List;

public class NotepadBooks {
    private Book[] books;

    public NotepadBooks(Book...books) {
        this.books = books;
    }
    public List<Book> findBooksByAuthor(String author){
        List<Book> booksResult = new ArrayList<>();
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books[i].getAuthors().length; j++) {
                if (books[i].getAuthors()[j].equalsIgnoreCase(author)){
                    booksResult.add(books[i]);
                    break;
                }
            }
        }
        return booksResult;
    }
    public List<Book> findBooksByPublishingHouse(String publishingHouse){
        List<Book> booksResult = new ArrayList<>();
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPublishingHouse().equalsIgnoreCase(publishingHouse)){
                booksResult.add(books[i]);
            }
        }
        return booksResult;
    }
    public List<Book> findBooksOverYear(int year){
        List<Book> booksResult = new ArrayList<>();
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPublishingYear() > year){
                booksResult.add(books[i]);
            }
        }
        return booksResult;
    }
}

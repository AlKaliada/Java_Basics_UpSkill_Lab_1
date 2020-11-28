package com.epam.kaliada.classes.simplestclasses.task9;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class BookCreator {
    private static int countBooks;
    Calendar calendar = new GregorianCalendar();
    private int year = calendar.get(Calendar.YEAR);

    public Book createBook(String name, String publishingHouse, int publishingYear, int numberOfPages, double price, Bookbinding bookbinding, String...authors){
        if (name == null || publishingHouse == null || bookbinding == null || authors == null ||
                name.length() == 0 || publishingHouse.length() == 0 || publishingYear < 0 || publishingYear > year ||
                 numberOfPages <= 0 || price <= 0 || authors.length == 0){
            throw new IllegalArgumentException("You entered wrong data");
        }

        for (int i = 0; i < authors.length; i++) {
            if (authors[i] == null || authors[i].length() == 0){
                throw new IllegalArgumentException("You entered wrong data");
            }
        }
        countBooks++;
        price = new BigDecimal(price).setScale(2, RoundingMode.HALF_UP).doubleValue();
        return new Book(countBooks, name, publishingHouse, publishingYear, numberOfPages, price, bookbinding, authors);
    }
}

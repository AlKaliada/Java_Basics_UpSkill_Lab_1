package com.epam.kaliada.classes.simplestclasses.task9;

import java.util.Arrays;

public class Book {
    private int id;
    private String name;
    private String publishingHouse;
    private int publishingYear;
    private int numberOfPages;
    private double price;
    private Bookbinding bindingType;
    private String[] authors;

    public Book(int id, String name,  String publishingHouse, int publishingYear, int numberOfPages, double price, Bookbinding bindingType, String...authors) {
        this.id = id;
        this.name = name;
        this.publishingHouse = publishingHouse;
        this.publishingYear = publishingYear;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
        this.authors = authors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Bookbinding getBindingType() {
        return bindingType;
    }

    public void setBindingType(Bookbinding bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book information:\n" + "id - " + id + "\nName - " + name +
                "\nAuthors - " + Arrays.toString(authors) + "\nPublishing house - " + publishingHouse +
                "\nPublishing year - " + publishingYear + "\nNumber of pages - " + numberOfPages +
                "\nPrice - " + price + "\nBindingType - " + bindingType;
    }
}

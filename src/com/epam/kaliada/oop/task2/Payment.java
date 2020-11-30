package com.epam.kaliada.oop.task2;

public class Payment {
    double totalPrice;
    int totalQuantity;

    public class Toys {

        final double price = 23.45;

        public Toys(int quantity) {
            totalQuantity += quantity;
            totalPrice += quantity * price;
        }

    }
}
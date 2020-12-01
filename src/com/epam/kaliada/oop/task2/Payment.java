package com.epam.kaliada.oop.task2;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private double totalPrice;
    private int totalQuantity;
    private List<String> products = new ArrayList<>();

    public class Product {
        private String product;
        private int quantity;
        private double price;

        public Product(String product, int quantity, double price) {
            this.product = product;
            this.quantity = quantity;
            this.price = price;
        }

        public void addProductForPayment(){
            products.add(product);
            totalQuantity += quantity;
            totalPrice += quantity * price;
        }
    }
}
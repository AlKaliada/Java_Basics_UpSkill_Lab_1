package com.epam.kaliada.oop.task2;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        if (product == null){
            throw new IllegalArgumentException("Your product is null");
        }
        products.add(product);
    }

    public double findTheAmountToPay(){
        double amount = 0.0;
        for (Product product : products) {
            amount = amount + product.getPrice() * product.getQuantity();
        }
        return amount;
    }

    public class Transaction {
        private double amountToPay;

        public Transaction() {
            this.amountToPay = findTheAmountToPay();
        }

        public double getAmountToPay() {
            return amountToPay;
        }

        public double payByCash(double money){
            if (money <= 0){
                throw new IllegalArgumentException("No valid data");
            }
            if ((amountToPay - money) >= 0.0){
                amountToPay -= money;
                return -amountToPay;
            }else {
                amountToPay = 0.0;
                return (money - amountToPay);
            }
        }

        public void payByCreditCard(){
            amountToPay = 0.0;
        }

        public double payByCreditCard(double money){
            if (money <= 0){
                throw new IllegalArgumentException("No valid data");
            }
            if ((amountToPay - money) >= 0.0){
                amountToPay -= money;
                return -amountToPay;
            }else {
                return (money - amountToPay);
            }
        }
    }
}
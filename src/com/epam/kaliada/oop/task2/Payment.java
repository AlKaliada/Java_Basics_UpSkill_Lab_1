package com.epam.kaliada.oop.task2;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        if (product == null){
            System.out.println("Your product is null");
            return;
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

        public void payByCash(double money){
            if ((amountToPay - money) >= 0.0){
                System.out.println("Payed " + money);
                amountToPay -= money;
                System.out.println("Left to pay " + amountToPay);
            }else {
                System.out.println("Your change " + (money - amountToPay));
            }
        }

        public void payByCreditCard(){
            amountToPay = 0.0;
            System.out.println("Thanks for paying");
        }

        public void payByCreditCard(double money){
            if ((amountToPay - money) >= 0.0){
                System.out.println("Payed " + money);
                amountToPay -= money;
                System.out.println("Left to pay " + amountToPay);
            }else {
                System.out.println("You entered too much money");
            }
        }
    }
}
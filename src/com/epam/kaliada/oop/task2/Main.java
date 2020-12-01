package com.epam.kaliada.oop.task2;

public class Main {
    public static void main(String[] args) {
        Product apples = new Product("apple", 2.99, 7);
        Product oranges = new Product("orange", 3.45, 5);
        Payment payment = new Payment();
        payment.addProduct(apples);
        payment.addProduct(oranges);
        System.out.println(payment.findTheAmountToPay());
        Payment.Transaction transaction = payment.new Transaction();
        transaction.payByCash(17);
        transaction.payByCreditCard(21.17);
        transaction.payByCreditCard();

        
    }
}

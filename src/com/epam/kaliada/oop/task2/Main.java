package com.epam.kaliada.oop.task2;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        Payment.Toys toys = payment.new Toys(2);
        System.out.println(payment.totalPrice);
    }
}

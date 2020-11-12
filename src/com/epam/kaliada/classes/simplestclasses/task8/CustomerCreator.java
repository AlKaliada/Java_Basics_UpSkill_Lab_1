package com.epam.kaliada.classes.simplestclasses.task8;


public class CustomerCreator {
    public static int countCustomers;
    public Customer createCustomer(String name, String address, long creditCardNumber, String bankAccountNumber){
        if (String.valueOf(creditCardNumber).length() != 16){
            throw new IllegalArgumentException("You entered wrong credit card number");
        }
        if (!bankAccountNumber.matches("[A-Z]{2}\\d{2}[A-Z]{4}\\d{20}")){
            throw new IllegalArgumentException("You entered wrong bankAccountNumber");
        }
        countCustomers++;
        return new Customer(countCustomers, name, address, creditCardNumber, bankAccountNumber);
    }

}

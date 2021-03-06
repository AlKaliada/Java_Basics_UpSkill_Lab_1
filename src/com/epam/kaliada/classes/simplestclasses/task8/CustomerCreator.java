package com.epam.kaliada.classes.simplestclasses.task8;


public class CustomerCreator {
    public static int countCustomers;
    private static final int MAX_BANK_ACCOUNT_LENGTH = 16;
    public Customer createCustomer(String name, String address, long creditCardNumber, String bankAccountNumber){
        if (name == null || address == null || bankAccountNumber == null || name.length() == 0 || address.length() == 0){
            throw new IllegalArgumentException("You entered wrong data");
        }
        if (String.valueOf(creditCardNumber).length() != MAX_BANK_ACCOUNT_LENGTH){
            throw new IllegalArgumentException("You entered wrong credit card number");
        }
        if (!bankAccountNumber.matches("[A-Z]{2}\\d{2}[A-Z]{4}\\d{20}")){
            throw new IllegalArgumentException("You entered wrong bankAccountNumber");
        }
        countCustomers++;
        return new Customer(countCustomers, name, address, creditCardNumber, bankAccountNumber);
    }

}

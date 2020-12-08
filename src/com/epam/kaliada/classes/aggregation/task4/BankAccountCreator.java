package com.epam.kaliada.classes.aggregation.task4;

public class BankAccountCreator {
    public static int accountNumber;

    public static BankAccount createBankAccount(String ownerName, CurrencyEnum currency){
        if (ownerName == null || ownerName.length() == 0){
            throw new IllegalArgumentException("owner name null or empty");
        }
        accountNumber++;
        return new BankAccount(accountNumber, ownerName, currency);
    }
}

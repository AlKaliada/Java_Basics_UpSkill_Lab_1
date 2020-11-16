package com.epam.kaliada.classes.aggregation.task4;

public class BankAccount implements Comparable<BankAccount>{
    private final int number;
    private final String ownerName;
    private final CurrencyEnum currency;
    private double balance;
    private boolean isAccountBlocked;


    public BankAccount(int number, String ownerName, CurrencyEnum currency) {
        this.number = number;
        this.ownerName = ownerName;
        this.currency = currency;
    }

    public int getNumber() {
        return number;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public CurrencyEnum getCurrency() {
        return currency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void changeBalance(double amount){
        if (!isAccountBlocked){
            balance += amount;
        }else {
            System.out.println("Account blocked");
        }
    }
    public void blockAccount(){
        isAccountBlocked = true;
    }
    public void unblockAccount(){
        isAccountBlocked = false;
    }

    @Override
    public int compareTo(BankAccount o) {
        return this.ownerName.compareTo(o.ownerName);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "number=" + number +
                ", ownerName='" + ownerName + '\'' +
                ", currency=" + currency +
                ", balance=" + balance +
                ", isAccountBlocked=" + isAccountBlocked +
                '}';
    }
}

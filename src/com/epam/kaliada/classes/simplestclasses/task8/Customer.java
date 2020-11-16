package com.epam.kaliada.classes.simplestclasses.task8;

public class Customer implements Comparable<Customer>{
    private int id;
    private String name;
    private String address;
    private long creditCardNumber;
    private String bankAccountNumber;

    public Customer(int id, String name, String address, long creditCardNumber, String bankAccountNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    @Override
    public int compareTo(Customer o) {
        return this.getName().toLowerCase().compareTo(o.getName().toLowerCase());
    }

    @Override
    public String toString() {
        return "Id: " + id + ", name: " + name + ", address: " + address +
                ", credit card: " + creditCardNumber + ", account: " + bankAccountNumber;
    }
}

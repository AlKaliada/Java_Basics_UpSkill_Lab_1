package com.epam.kaliada.classes.aggregation.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NotepadBankAccounts {
    private List<BankAccount> accounts = new ArrayList<>();

    public void addBankAccount(BankAccount bankAccount){
        accounts.add(bankAccount);
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public double findAccountsSum(){
        double result = 0.0;
        for (BankAccount bankaccount : accounts) {
            result += bankaccount.getBalance();
        }
        return result;
    }

    public double findNegativeAccountsSum(){
        double result = 0.0;
        for (BankAccount bankaccount : accounts) {
            if (bankaccount.getBalance() < 0){
                result += bankaccount.getBalance();
            }
        }
        return result;
    }

    public double findPositiveAccountsSum(){
        double result = 0.0;
        for (BankAccount bankaccount : accounts) {
            if (bankaccount.getBalance() > 0){
                result += bankaccount.getBalance();
            }
        }
        return result;
    }
    public List<BankAccount> sortAccountsByOwner(){
        List<BankAccount> result = new ArrayList<>();
        result.addAll(0, accounts);
        Collections.sort(result);
        return result;
    }
    public List<BankAccount> findAccountsByOwner(String name){
        List<BankAccount> result = new ArrayList<>();
        for (BankAccount bankaccount : accounts) {
            if (bankaccount.getOwnerName().equals(name)){
                result.add(bankaccount);
            }
        }
        return result;
    }


}

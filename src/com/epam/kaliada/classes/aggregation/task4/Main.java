package com.epam.kaliada.classes.aggregation.task4;

import java.util.List;

//Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
// Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
// имеющим положительный и отрицательный балансы отдельно
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = BankAccountCreator.createBankAccount("Boznik", CurrencyEnum.BYN);
        BankAccount bankAccount1 = BankAccountCreator.createBankAccount("Pazniak", CurrencyEnum.EUR);
        bankAccount.changeBalance(-1500);
        bankAccount1.changeBalance(2500);
        BankAccount bankAccount2 = BankAccountCreator.createBankAccount("Koleda", CurrencyEnum.BYN);
        bankAccount2.changeBalance(120);

        NotepadBankAccounts notepadBankAccounts = new NotepadBankAccounts();
        notepadBankAccounts.addBankAccount(bankAccount);
        notepadBankAccounts.addBankAccount(bankAccount1);
        notepadBankAccounts.addBankAccount(bankAccount2);

        List<BankAccount> sorted = notepadBankAccounts.sortAccountsByOwner();
        for (BankAccount account : sorted) {
            System.out.println(account.toString());
        }

        List<BankAccount> koleda = notepadBankAccounts.findAccountsByOwner("Koleda");
        for (BankAccount account : koleda) {
            System.out.println(account.toString());
        }

        List<BankAccount> unknown = notepadBankAccounts.findAccountsByOwner("w");
        for (BankAccount account : unknown) {
            System.out.println(account.toString());
        }

    }
}

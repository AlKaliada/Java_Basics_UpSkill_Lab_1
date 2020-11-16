package com.epam.kaliada.classes.simplestclasses.task8;
// Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод  toString().
// Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
//
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//
//Найти и вывести:
//
//a) список покупателей в алфавитном порядке;
//
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
public class Main {
    public static void main(String[] args) {
        CustomerCreator customerCreator = new CustomerCreator();
        Customer customer1 = customerCreator.createCustomer("Pyatrova Anastasia", "Semkovo, 12-2", 1511222233334444L, "BY12AKBB11111111111111111111");
        Customer customer2 = customerCreator.createCustomer("paznyak Yauhen", "Kalinovskogo, 65-43", 1114222233334444L, "BY12AKBB11111111111444111111");
        Customer customer3 = customerCreator.createCustomer("Poznyak Sergei", "Marksa, 15", 4444444444444444L, "AK12AKND12341234123412341234");

        NotepadCustomers notepadCustomers = new NotepadCustomers(customer1, customer2, customer3);
        for (int i = 0; i < notepadCustomers.getCustomersList().length; i++) {
            System.out.println(notepadCustomers.getCustomersList()[i].toString());
        }

        System.out.println();

        Customer[] sortedAlphabetically = notepadCustomers.sortAlphabetically();
        for (int i = 0; i < sortedAlphabetically.length; i++) {
            System.out.println(sortedAlphabetically[i].toString());
        }

        System.out.println();

        Customer[] foundByCreditCardNumber = notepadCustomers.findCustomersByIntervalOfCreditCardNumber(1511222233334440L, 1511222233334449L);
        for (int i = 0; i < foundByCreditCardNumber.length; i++) {
            System.out.println(foundByCreditCardNumber[i].toString());
        }
    }
}

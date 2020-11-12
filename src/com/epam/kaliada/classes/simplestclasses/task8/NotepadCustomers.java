package com.epam.kaliada.classes.simplestclasses.task8;

import java.util.Arrays;

public class NotepadCustomers {
    protected Customer[] customersList;

    public NotepadCustomers(Customer...customersList) {
        this.customersList = customersList;
    }

    public Customer[] getCustomersList() {
        return customersList;
    }

    public Customer[] sortAlphabetically(){
        Customer[] cloneCustomersList = customersList.clone();
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < (cloneCustomersList.length - 1); i++) {
                if (!checkTwoWordsSortedAlphabetically(cloneCustomersList[i].getName(), cloneCustomersList[i + 1].getName())){
                    sorted = false;
                    Customer customer = cloneCustomersList[i];
                    cloneCustomersList[i] = cloneCustomersList[i + 1];
                    cloneCustomersList[i + 1] = customer;
                }
            }
        }
        return cloneCustomersList;
    }
    public Customer[] findCustomersByIntervalOfCreditCardNumber(long start, long finish){
        int count = 0;
        for (long i = start; i <= finish ; i++) {
            for (int j = 0; j < customersList.length; j++) {
                if (customersList[j].getCreditCardNumber() == i){
                    count++;
                }
            }
        }
        Customer[] result = new Customer[count];
        int indexOfResult = 0;
        for (long i = start; i <= finish ; i++) {
            for (int j = 0; j < customersList.length; j++) {
                if (customersList[j].getCreditCardNumber() == i){
                    result[indexOfResult] = customersList[j];
                    indexOfResult++;
                }
            }
        }
        return result;
    }

    private boolean checkTwoWordsSortedAlphabetically(String first, String second){
        String[] strArray = {first.toLowerCase(), second.toLowerCase()};
        Arrays.sort(strArray);
        return first.toLowerCase().equals(strArray[0]);
    }

}

package com.mybank.domain;

/**
 *
 * @author Andrés Mémdez juanias.
 */
public class Bank {

    private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        customers = new Customer[10];
        numberOfCustomers = 0;
    }

    public void addCustomer(String fn, String ln){
        customers[numberOfCustomers++] = new Customer(fn, ln);
    }

    public int getNumberOfCustomers() {
//        return this.customers.length;
        return numberOfCustomers;
    }

    public Customer getCustomer(int index){
        return customers[index];
    }
}

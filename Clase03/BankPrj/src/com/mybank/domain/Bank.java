package com.mybank.domain;

/**
 *
 * @author Andrés Mémdez juanias.
 */
public class Bank {

    private static Customer[] customers;
    private static int numberOfCustomers;

    static {
        customers = new Customer[10];
        numberOfCustomers = 0;
    }

    private Bank() {
    }

    public static void addCustomer(String fn, String ln){
        customers[numberOfCustomers++] = new Customer(fn, ln);
    }

    public static int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public static Customer getCustomer(int index){
        return customers[index];
    }
}

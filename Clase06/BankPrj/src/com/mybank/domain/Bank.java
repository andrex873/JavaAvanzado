package com.mybank.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrés Mémdez juanias.
 */
public class Bank {

    private static List<Customer> customers;

    static {
        customers = new ArrayList<Customer>(10);
    }

    private Bank() {
    }

    public static void addCustomer(String fn, String ln){
        customers.add(new Customer(fn, ln));
    }

    public static int getNumberOfCustomers() {
        return customers.size();
    }

    public static Customer getCustomer(int index){
        return customers.get(index);
    }
}

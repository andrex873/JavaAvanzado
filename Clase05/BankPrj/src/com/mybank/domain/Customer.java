package com.mybank.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrés Méndez Juanias
 */
public class Customer {
    private String firstName;
    private String lastName;

    private List<Account> accounts;



    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        accounts = new ArrayList<Account>(10);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount(int index) {
        return accounts.get(index);
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public int getNumberOfAccounts() {
        return this.accounts.size();
    }

}
package com.mybank.domain;

/**
 *
 * @author Andrés Méndez Juanias
 */
public class Customer {
    private String firstName;
    private String lastName;

    private Account[] accounts;
    private int numberOfAccounts;



    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        accounts = new Account[10];
        numberOfAccounts = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount(int index) {
        return accounts[index];
    }

    public void addAccount(Account account) {
        this.accounts[numberOfAccounts++] = account;
    }

    public int getNumberOfAccounts() {
        return this.numberOfAccounts;
    }

}
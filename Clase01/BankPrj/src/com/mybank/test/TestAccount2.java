package com.mybank.test;


import com.mybank.domain.Account;

/**
 *
 * @author Andrés Méndez Juanias
 */
public class TestAccount2 {

    public static void main(String args[]){
        Account ac = new Account(100.0);
        ac.deposit(47.0);
        ac.withdraw(150.0);
        System.err.println("Final account balance is: " + ac.getBalance());
    }
}

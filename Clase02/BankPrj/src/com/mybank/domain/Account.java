package com.mybank.domain;

/**
 * Clase Account creada para el ejercicio 2 nivel 3.
 * @author Andrés Méndez Juanias
 */
public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public boolean deposit(double amt){
        this.balance += amt;
        return true;
    }

    public boolean withdraw(double amt){
        double temp = this.balance - amt;
        if(temp >= 0){
            this.balance = temp;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

}

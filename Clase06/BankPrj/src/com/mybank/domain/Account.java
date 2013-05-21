package com.mybank.domain;

/**
 * Clase Account creada para el ejercicio 2 nivel 3.
 * @author Andrés Méndez Juanias
 */
public class Account {

    protected double balance;

    protected Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amt){
        this.balance += amt;
    }

    public void withdraw(double amt) throws OverdraftException {
        if(amt <= this.balance){
            this.balance -= amt;
        } else {
            throw new OverdraftException("No hay fondos suficientes.", amt- this.balance);
        }
    }

    public double getBalance() {
        return balance;
    }

}

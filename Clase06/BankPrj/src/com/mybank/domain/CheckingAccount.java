/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybank.domain;

/**
 *
 * @author mint
 */
public class CheckingAccount extends Account{

    private double overdraftAmount;

    public CheckingAccount(double overdraftAmount, double initBalance) {
        super(initBalance);
        this.overdraftAmount = overdraftAmount;
    }

    public CheckingAccount(double initBalance) {
        this(initBalance, 0.0);
    }

    
    public void withdraw(double amount) throws OverdraftException{
        boolean result = true;
        if(balance < amount){
            double overdraftNeeded = amount - balance;
            if(overdraftAmount < overdraftNeeded){
                throw new OverdraftException("No hay fondos suficientes para sobregiro", amount);
            } else {
                balance = 0.0;
                overdraftAmount -= overdraftNeeded;
            }
        } else {
            balance -= amount;
        }
    }


}

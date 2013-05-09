/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybank.domain;

/**
 *
 * @author mint
 */
public class SavingsAccount extends Account{

    private double interestRest;

    public SavingsAccount(double initBalance, double interestRest) {
        super(initBalance);
        this.interestRest = interestRest;
    }



}

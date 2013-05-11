/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybank.domain;

/**
 *
 * @author mint
 */
public class OverdraftException extends Exception {

    private final double deficit;

    public OverdraftException(String msj, double deficit){
        super(msj);
        this.deficit = deficit;
    }

    public double getDeficit() {
        return deficit;
    }

}

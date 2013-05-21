/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybank.data;

import com.mybank.domain.Bank;
import com.mybank.domain.CheckingAccount;
import com.mybank.domain.Customer;
import com.mybank.domain.SavingsAccount;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author mint
 */
public class DataSource {

    private File dataFile;

    public DataSource(String dataFilePath) {
        this.dataFile = new File(dataFilePath);
    }

    public void loadData() throws IOException{
        Scanner input = new Scanner(dataFile);

        Customer customer;
        int numOfCustomers = input.nextInt();
        for(int idx = 0; idx < numOfCustomers; idx++){

            String firstName = input.next();
            String lastName = input.next();
            Bank.addCustomer(firstName, lastName);
            customer = Bank.getCustomer(idx);
            int numOfAccounts = input.nextInt();
            while(numOfAccounts-- > 0){
                char accountType = input.next().charAt(0);
                switch(accountType){
                    case 'S':{
                        float initBalance = input.nextFloat();
                        float interestrate = input.nextFloat();
                        customer.addAccount(new SavingsAccount(initBalance, interestrate));
                        break;
                    }
                    case 'C':{
                        float initBalance = input.nextFloat();
                        float overdraftProtection = input.nextFloat();
                        customer.addAccount(new CheckingAccount(overdraftProtection, initBalance));
                        break;
                    }
                }
            }
            

        }
    }



}

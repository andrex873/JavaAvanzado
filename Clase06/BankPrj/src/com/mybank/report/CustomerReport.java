package com.mybank.report;

import com.mybank.domain.*;

public class CustomerReport {


    public CustomerReport() {
    }

    public void generateReport() {

        // Print report header
        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");

        // For each customer...
        for (int cust_idx = 0;
                cust_idx < Bank.getNumberOfCustomers();
                cust_idx++) {
            Customer customer = Bank.getCustomer(cust_idx);

            // Print the customer's name
            System.out.println();
            System.out.println("Customer: "
                    + customer.getLastName() + ", "
                    + customer.getFirstName());

            // For each account for this customer...
            for (int acct_idx = 0;
                    acct_idx < customer.getNumberOfAccounts();
                    acct_idx++) {
                Account account = customer.getAccount(acct_idx);
                String account_type = "";

                // Determine the account type
                /**
                 * * Use the instanceof operator to test what type of account
                 * *** we have and set account_type to an appropriate value,
                 * such *** as "Savings Account" or "Checking Account". **
                 */
                // YOUR CODE HERE                                
                if (account instanceof SavingsAccount) {
                    SavingsAccount tmpAcc = (SavingsAccount) account;
                    account_type = tmpAcc.getClass().getSimpleName();
                } else if (account instanceof CheckingAccount) {
                    CheckingAccount tmpAcc = (CheckingAccount) account;
                    account_type = tmpAcc.getClass().getSimpleName();
                } else {
                    account_type = "Unkanown Account type";
                }

                System.out.println("The account type is: " + account_type + ". Current balance is: " + account.getBalance());
            }
        }
    }
}

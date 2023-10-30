package com.exceptionhandling;

import org.apache.jasper.tagplugins.jstl.core.If;

public class BankAccount {
	double balance;

	public BankAccount(double balance) {
		
		this.balance = balance;
	}
	public void withdraw(double amount) throws InvalidTransactionException, InsufficientFundsException  {
		
		if (amount<0) {
            throw new InvalidTransactionException("Invalid transaction: Withdrawal amount must be positive.");
		}
		if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds: Your account balance is not enough to withdraw " + amount + " rs.");
        }

        balance -= amount;
        System.out.println("Deduction of " + amount + " rs. is complete.");
	}

}

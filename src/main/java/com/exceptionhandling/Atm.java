package com.exceptionhandling;

import java.util.Scanner;

public class Atm {
	
	

	

	public static void main(String[] args)  {
		Atm atm =new Atm();

		BankAccount bnAccount=new BankAccount(2000);
		
		try {
			bnAccount.withdraw(-800);
		} catch (InvalidTransactionException | InsufficientFundsException e) {
			System.out.println(e);
		}
		
		try {
			bnAccount.withdraw(2500);
		} catch (InvalidTransactionException | InsufficientFundsException e) {
			System.out.println(e);
		}
		try {
			bnAccount.withdraw(800);
		} catch (InvalidTransactionException | InsufficientFundsException e) {
			System.out.println(e);
		}
		
	}
}

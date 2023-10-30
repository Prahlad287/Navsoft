package com.exceptionhandling;

public class InsufficientFundsException extends Exception{

	public InsufficientFundsException(String message) {
		super(message);
		
	}
	
		
}

class InvalidTransactionException extends Exception{

	public InvalidTransactionException(String message) {
		super(message);
		
	}
	
}

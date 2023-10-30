package com.exceptionhandling;

import java.util.Scanner;

public class Banking {
	void withdrawamount(int money) throws UserdifenedException {
		int balance=2000;
		if(money>balance || money <=0)
			throw new UserdifenedException("insufficient funds or invalid transactions");
		else if (money<=balance) {
			System.out.println("withdraw successfully your balance is : "+(balance-money) +" ");
		}
		
		else {
			System.out.println("Invalid");
		}
	}
	public static void main(String[] args)  {
		Banking at=new Banking();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter amount for withdraw");
		int amount=scanner.nextInt();
		try {
			at.withdrawamount(amount);
		} catch (UserdifenedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Last line of code");
	}

}

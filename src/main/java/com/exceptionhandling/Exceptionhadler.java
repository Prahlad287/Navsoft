package com.exceptionhandling;

import java.util.Scanner;

public class Exceptionhadler {
	void checkResult(int marks) throws UserdifenedException {
		if(marks>100 || marks <=0)
			throw new UserdifenedException("number not 0 to less and greater 100");
		else if (marks>60 &&marks<=100) {
			System.out.println("First Divison");
		}
		else if (marks>45 &&marks<=60) {
			System.out.println("second Divison");
		}
		else if (marks>33&&marks<=45) {
			System.out.println("third Divison");
		}
		else {
			System.out.println("fail");
		}
	}
	public static void main(String[] args)  {
		Exceptionhadler exceptionhadler=new Exceptionhadler();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number for check");
		int mark=scanner.nextInt();
		try {
			exceptionhadler.checkResult(mark);
		} catch (UserdifenedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Last line of code");
	}

}

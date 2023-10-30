package com.exceptionhandling;

import java.util.Scanner;

public class Electionage {
 static void checkEligibility(int age) throws NotEligibleException {
	 if (age<=18) {
			throw new NotEligibleException("You are NotEligibleException1 for vote");
		} else {
			System.out.println("you are eligable for vote");
		}
	 }
 public static void main(String[] args) {
	
	 Scanner scanner = new Scanner(System.in);
     System.out.print("Enter your age: ");
     int age = scanner.nextInt();

     try {
         checkEligibility(age);
     } catch (NotEligibleException e) {
         System.out.println("Error: " + e.getMessage());
     }

}
}
class NotEligibleException extends Exception{
	public NotEligibleException(String str) {
		super(str);
	}
}
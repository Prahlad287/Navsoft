package com.test;

import java.util.Scanner;

public class Addtion {
	
	void add(Number arr[]) {
		//Number arr[]= {5,2.3,4.6,10.1,25.0};
		int sumInt=0;
		float sumf=0.0f;
		for(Number num :arr) {
			if(num instanceof Integer) {
				sumInt +=num.intValue();
			}else if (num instanceof Double) {
				sumf +=num.doubleValue();			
			}
		}
		System.out.println("sum of int :"+sumInt);
		System.out.println("sum fo float :"+sumf);
	}
	
	void stringReverse(String string) {
		
		String reverse="";
		for (int i=string.length()-1;i>=0;i--) {
			reverse+= string.charAt(i);
		}
		System.out.println(reverse);
	}
	public static void main(String[] args) {
			Addtion addition=new Addtion();
				Scanner scanner=new Scanner(System.in);
				  while (true) {
				 System.out.println("Choose an operation:");
			     System.out.println("1. Addition of numbers");
			     System.out.println("2. String reversal");
			     System.out.println("3. exit");
			     int key = scanner.nextInt();
			     scanner.nextLine(); 

			     switch (key) {
			         case 1: {
			             System.out.println("Enter numbers separated by spaces:");
			             String input = scanner.nextLine();
			             String[] numberStrings = input.split(" ");
			             Number[] numbers = new Number[numberStrings.length];

			             for (int i = 0; i < numberStrings.length; i++) {
			                 try {
			                     numbers[i] = Integer.parseInt(numberStrings[i]);
			                 } catch (NumberFormatException e) {
			                     numbers[i] = Double.parseDouble(numberStrings[i]);
			                 }
			             }

			             addition.add(numbers);
			             break;
			         }    
			     
				  case 2: {
		                System.out.println("Enter a string to reverse:");
		                String input = scanner.nextLine();
		                addition.stringReverse(input);
		                break;
		            }
				  case 3:
	                    System.out.println("Exiting the program.");
	                    scanner.close();
	                    System.exit(0);
		            default:
		                System.out.println("Invalid choice");
		                break;
		        }	
				  } 
	}

}

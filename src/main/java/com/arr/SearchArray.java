package com.arr;

import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.NA;

public class SearchArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=scanner.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter number fo array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
		}
		
		int positive=0;
		int negative=0;
		int zero=0;
		int odd=0;
		int even=0;
		boolean found=false;
		for(int a:arr) {
			if (a>0) {
					positive++;
			}
			else if (a<0) {
				negative++;
			}
			else {
				zero++;
			}
			 if (a%2==0) {
				even++;
			}else  {
				odd++;
			}
		}
		 System.out.println("Positive number is: " + positive);
	        System.out.println("Negative number is: " + negative);
	        System.out.println("Zero number is: " + zero);
	        System.out.println("Odd number is: " + odd);
	        System.out.println("Even number is: " + even);
		
		
		
	        System.out.println("Enter a number to serch in the array ");
			int number=scanner.nextInt();
			for (int i : arr) {
			if(number==i) {
				found=true;
				break;
			}
			}
		
			if (found) {
	            System.out.println(number + " is present in the array");
	        } else {
	            System.out.println(number + " is not present in the array");
	        }
		}
	
}
		
		
		
	



package com.shapes;

import java.util.Iterator;
import java.util.Scanner;

public class StarPrint {
	static void print(int n) {
		System.out.println("Star Print");
		
		for (int i = 0; i <n; i++) {
			 for (int j = 0; j <=i; j++) {
				 System.out.print("*");
			}
			 System.out.println();
		}
	}
	static void divi() {
		for (int i = 0; i < 100; i++) {
			if(i%2!=0&&i%3!=0) {
				System.out.println(i);
			}
		}
	}
	static void hollowprint(int n) {
		
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=2*i-1; j++) {
				if (j==1||j==2*i-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i =n-1; i>=1; i--) {
			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=2*i-1; j++) {
				if (j==1||j==2*i-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number for piramid");
		/*
		 * int number=scanner.nextInt(); print(number); divi(); hollowprint(number);
		 */
		
		int n=5;
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print(" ");
			}for (int j = 0; j<n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <n-1; j++) {
				System.out.print(" ");
			}for (int j = 0; j<=i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}

package com.shapes;

import java.util.Iterator;
import java.util.Scanner;

public class Reactangle {
	static void rea(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i==0||j==0||j==num-1||i==num-1) {
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
		
		System.out.println("Enter number for ....");
		int num=scanner.nextInt();
		rea(num);
	}
}

package com.shapes;

public class Alfabet {
	
	public static void main(String[] args) {
		int num=8;
		System.out.println("===================== Print X ======================");
		for (int i = 1; i <=num; i++) {
			for (int j = 1; j <=num; j++) {
				if (j==i||j==num+1-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
		}
		System.out.println();
	}
		System.out.println("===================Print H ======================");
		for (int i = 1; i <=num; i++) {
			for (int j = 1; j <=num; j++) {
				if (j==1||j==num||i==(num+1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
		}
		System.out.println();
	}
		System.out.println("===================Print L ======================");
		for (int i = 1; i <=num; i++) {
			for (int j = 1; j <=num; j++) {
				if (j==1||i==num) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
		}
		System.out.println();
	}
		System.out.println("===================Print A ======================");
		for (int i = 1; i <=num; i++) {
			for (int j = 1; j <=num*2; j++) {
					if (j==num+1-i||j==num-1+i||i==(num+1)/2&&j>=(num+1)/2+1&&j<=((num*3)/2)-1) {

					System.out.print("*");
				}else {
					System.out.print(" ");
				}
		}
		System.out.println();
	}
		
		System.out.println("===================Print D ======================");
		for (int i = 1; i <=num; i++) {
			for (int j = 1; j <=num*2; j++) {
			//	if (j==1||i==1&&j<=3||i==num&&j<=3||i>=4&&j==num||i==5&&j==num||i==3&&j==num-1||i==6&&j==num-1||i==2&&j==num-2||i==7&&j==num-2) {
					if (j==1||i==1&&j<=3||i==num&&j<=3||i==4&&j==num||i==5&&j==num||i==3&&j==num-1||i==6&&j==num-1||i==2&&j==num-2||i==7&&j==num-2) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
		}
		System.out.println();
	}
	}
		 
}

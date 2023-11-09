package com.shapes;

public class WriteJavainshape {
	public static void main(String[] args) {
		int n=5;
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <n; j++) {
				if (i==0) {
					System.out.print("*");
				}
				else if (i>=1&&j>=2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		 for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (j == n / 2 || (i == n - 1 && j <= n / 2)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.print("  ");
	            // Loop to print the letter "a"
	            for (int j = 0; j < n; j++) {
	                if ((i == 0 && j != 0 && j != n - 1) || (j == 0 && i != 0) || (j == n - 1 && i != 0)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.print("  ");
	            
	            // Loop to print the letter "v"
	            for (int j = 0; j < n; j++) {
	                if ((j == i || j == n - i - 1) && j < n / 2) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.print("  ");
	            
	            // Loop to print the letter "a" again
	            for (int j = 0; j < n; j++) {
	                if ((i == 0 && j != 0 && j != n - 1) || (j == 0 && i != 0) || (j == n - 1 && i != 0)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            
	            System.out.println(); // Move to the next line for the next row
	        }
	}

}

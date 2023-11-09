package com.io;

public class Revrsearray {
	static void printReverse() {
		int [] Input ={1,2,8,9,5,4};
		int [] output = new int[Input.length];
    
		for (int i =Input.length-1;i>=0; i--) {
		output[Input.length-1-i]=Input[i];
		}
		System.out.println("Intput");

		for (int i : Input) {
			System.out.print(i+" , ");
		}
		System.out.println();
		System.out.println("Output");
		for (int i : output) {
			System.out.print(i+" , ");
		}
		
	}
	public static void main(String[] args) {
		printReverse();
		
	}

}

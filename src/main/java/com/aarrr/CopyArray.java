package com.aarrr;

import java.util.Scanner;

public class CopyArray {
	static void copy(int arr[]) {
		
		int copy[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copy[i]=arr[i];
		}
		System.out.println("Orignal Array");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Copy Array");
		for (int i : copy) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size=scanner.nextInt();
		int[] copy =new int[size];
        System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			copy[i]= scanner.nextInt();
		}
		copy(copy);
	}

}

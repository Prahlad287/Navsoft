package com.aarrr;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.eclipse.jdt.internal.compiler.lookup.ImplicitNullAnnotationVerifier;

public class ElementFrequency {
	static void frequince(int num[]) {
		int length = num.length;
		for (int i = 0; i < length; i++) {
			int c = num[i];
			if (c != ' ') {
				int flag = 1;
				for (int j = i + 1; j < length; j++) {
					int d = num[j];
					if (c == d && (d != ' ')) {
						flag++;
						num[j] = ' ';
					}
				}
				System.out.println("Element : "+ c + "  frequency : " + flag+" times");
			}
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
		frequince(copy);	
	}
}

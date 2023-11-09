package com.shapes;

public class NumberPrint {
public static void main(String[] args) {
	int number=5;
	for (int i = 1; i <=number; i++) {
		System.out.print(i+" ");
	}System.out.println();
	for (int i =number*2; i>=number+1; i--) {
		System.out.print(i+" ");
	}System.out.println();
	for (int i =number*2+1; i<=number*3; i++) {
		System.out.print(i+" ");
	}System.out.println();
	for (int i =number*4; i>=number*3+1; i--) {
		System.out.print(i+" ");
	}System.out.println();
	
	
	}
}

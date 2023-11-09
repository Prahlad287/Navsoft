package com.aarrr;

import java.util.Iterator;

public class Frequence {
	public static void main(String[] args) {
		int arr[]= {0,1,2,1,2,0};
		int []Input= {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i = 0; i < Input.length; i++) {
			for (int j = i; j < Input.length; j++) {
				if (Input[i]>Input[j]) {
					int temp1=Input[j];
					Input[j]=Input[i];
					Input[i]=temp1;
				}
			}
		}
		for (int i : Input) {
			System.out.print(i+" ");
		}
	}

}


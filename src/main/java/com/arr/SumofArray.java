package com.arr;

import java.util.Arrays;
import java.util.Scanner;

public class SumofArray {
	void sum(int num[]) {
		int total=0;
	for(int i=0;i<num.length;i++) {
		total+=num[i];
	}
	System.out.println("Sum by for loop");
	System.out.println("total : "+total);
	}
	void forsum(int num[]) {
		int sum = 0;
	for(int n:num) {
	sum+=n;
		
	}
	 System.out.println("Sum by foreach loop:");
	    System.out.println("Total: " + sum);
	
	}
	int sum(int num[], int index) {
        if (index < 0) {
            return 0;
        }
        return num[index] + sum(num, index - 1);
    }
	
public static void main(String[] args) {
	SumofArray sumofArray=new SumofArray();
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Size of Array: ");
	int size=scanner.nextInt();
	int []arr=new int[size];
	System.out.println("Enter number for addtion of Array");
	for(int i=0;i<size;i++) {
		arr[i]=scanner.nextInt();
		System.out.println("arr"+i+" : "+arr[i]);
	}
	sumofArray.sum(arr);
	sumofArray.forsum(arr);
	int total=sumofArray.sum(arr, size-1);
	 System.out.println("Sum by recursion");
     System.out.println("Total : " + total);	
     
     int total1 = Arrays.stream(arr).sum();

     System.out.println("Sum by Stream API");
     System.out.println("Total: " + total1);
}
}

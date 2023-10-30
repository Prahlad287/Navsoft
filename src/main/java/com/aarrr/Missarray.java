package com.aarrr;

import java.util.HashSet;

import jakarta.el.ArrayELResolver;

public class Missarray {
	public static void main(String[] args) {
		 int arr[] = {16,18,19,21,22,26};
	       
	        	int missing=1;
	        for (int i = 0; i < arr.length; i++) {
	            if (missing != arr[i]) {
	            	while (missing<arr[i]) {
	            		 System.out.println("Missing element: " + (missing));
	            		 missing++;
					}
	               
	                
	            }
	            missing++;
	        }
	        
	        
	        int n = arr.length + 1; // n is the expected length of the sequence
	        System.out.println(n);
	        int sumOfN = (n * (n + 1)) / 2; // Sum of first N natural numbers
	        System.out.println(sumOfN);
	        int actualSum = 0;
	        for (int num : arr) {
	            actualSum += num;
	        }
	        System.out.println(actualSum);
	        
	        int missingElement = sumOfN - actualSum;
	        System.out.println("Missing element: " + missingElement);
	        
	        
	        //using Hashing
	        
	        HashSet<Integer> hashSet=new HashSet<Integer>();
	        for(int a:arr) {
	        	hashSet.add(a);
	        }
	      
	        for (int i = 21; i <= arr[arr.length - 1]; i++) {
	            if (!hashSet.contains(i)) {
	                System.out.println("Missing element: " + i);
	                break; // Exit the loop after finding the first missing element
	            }
	        }
	
	        
	        
	}

}

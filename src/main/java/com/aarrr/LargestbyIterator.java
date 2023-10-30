package com.aarrr;

public class LargestbyIterator {
	

	public static void main(String[] args) {
		LargestbyIterator lf=new LargestbyIterator();
		
		
		int arr[]= {4,8,2,9,25,6};
		
		int largest=arr[0];
		int bottom=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>largest) {
				largest=arr[i];
			}
			if (arr[i]<bottom) {
				bottom=arr[i];
			}
			
		}
		System.out.println(largest);
		System.out.println(bottom);
		
		
		

	}

}

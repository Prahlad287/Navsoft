package com.aarrr;

import java.util.Arrays;

public class Command {
	static void sum(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		/*
		 * int a[]=new int[10]; for (int i = 0; i < a.length; ++i) { a[i]='i';
		 * System.out.println(a[i]);
		 * 
		 * }
		 * 
		 * int arr[][]=new int[3][]; arr[0]=new int[1]; arr[1]=new int [2]; arr[2]=new
		 * int [3]; int sum=0; for (int i = 0; i < 3; i++) { for (int j = 0; j < i+1;
		 * j++) { arr[i][j]=j+1; // System.out.println(arr); } } for (int i = 0; i < 3;
		 * i++) { for (int j = 0; j < i+1; j++) { System.out.println(sum); sum
		 * +=arr[i][j]; System.out.println(sum); } } System.out.println(sum);
		 * System.out.println(a); System.out.println("Enter x value"); int
		 * x=Integer.parseInt(args[0]); System.out.println("Enter y value"); int
		 * y=Integer.parseInt(args[1]); sum(x, y);
		 */
		
		
		  char array_variable [] = new char[10];
		    for (int i = 0; i < 10; ++i)
	            {
	                array_variable[i] = 'i';
	                System.out.print(array_variable[i] + "");
	            }
		    
		    int array_variable1[][] = {{ 1, 2, 3}, { 4 , 5, 6}, { 7, 8, 9}};
            int sum = 0;
            for (int i = 0; i < 3; ++i)
                for (int j = 0; j <  3 ; ++j)
                    sum = sum + array_variable1[i][j];
            System.out.print(sum / 5);
            int arr[] = new int [5];
            System.out.print(arr);
            
            
			/*
			 * Object[] names = new String[3]; names[0] = new Integer(0);
			 */
            
            String[] nums = new String[] { "1", "9", "10" };
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
            int array_variable2 [] = new int[10];
    		for (int i = 0; i < 10; ++i)
    		{
    			array_variable2[i] = i;
    			System.out.print(array_variable2[i] + " ");
    			i++;
    			
    		}
    		
    		
    		{
    			int arr2[] = new int[] {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};
    			int n = 6;
    			n = arr2[arr2[n] / 2];
    			System.out.println(n);
    		}	
    		
    		
    		
    		int arr1[] = { 1, 2, 3 };
    		int arr2[] = { 1, 2, 3 };
    		if (arr1 == arr2)
    			System.out.println("Same");
    		else
    			System.out.println("Not same");
    		{
    			  int a[][] = new int[3][];
    	            a[0] = new int[1];
    	            a[1] = new int[2];
    	            a[2] = new int[3];   
    	            System.out.println("--------------------------------------------------------");
    		    int sum1 = 0;
    		    for (int i = 0; i < 3; ++i) 
    		    {
    		        for (int j = 0; j < i + 1; ++j)
    		        {
    	                    a[i][j] = j + 1; // 00=1 / 10=1, 11=2/ 20=1, 21=2, 22=3
    	            }
    		    }
    		    for (int i = 0; i < 3; ++i) 
    		    {
    		        for (int j = 0; j < i + 1; ++j) 
    		        {
    	                    sum1 += a[i][j]; //
    	             }
    		    }
    		    System.out.print(sum1); 
    		    	
    		}
	}

}




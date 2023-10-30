package com.swappingnumber;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.SocketTimeoutException;

public class Swap2number {
	void withThirdvaraible() {
		int a = 10;
		int b = 5;
		int c = a;
		a = b;
		b = c;
		System.out.println("a is : " + a);
		System.out.println("b is : " + b);
	}

	public static void main(String[] args) {
		Swap2number swap2number = new Swap2number();
	//	swap2number.withThirdvaraible();

		
		  try
          {
              int i, sum;
              sum = 10;
              for (i = -1; i < 3 ;++i)
              {
            	  System.out.println(i);
                  sum = (sum / i);
                  System.out.print(i);
              }
          }
          catch(ArithmeticException e)
          {     	
              System.out.print("0");
          }
	
		
		
		
		/*try {

			int array_variable[] = new int[10];
			for (int i = 0; i < 10; ++i) {
				array_variable[i] = i / 2;
				array_variable[i]++;
				System.out.print(array_variable[i] + " ");
				i++;
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			System.out.println("this is d ");
			InputStreamReader is=new InputStreamReader(System.in);
			BufferedReader bf=new BufferedReader(is);
			int z=Integer.parseInt(bf.readLine());
			
			
			int a = 10;
			int b = 5;
			a = a + b;
			b = a - b;
			a = a - b;
			System.out.println("a is : " + a);
			System.out.println("b is : " + b);
			System.out.println("this is d  ");
			int d = a / 0;
			
			
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("Hello ");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("this is exception");
		}
		System.out.println("this is last line of code");*/
	}
}

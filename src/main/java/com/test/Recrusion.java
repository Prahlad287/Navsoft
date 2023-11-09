package com.test;

import java.util.Scanner;

public class Recrusion {
		static int fact(int num) {
		if (num==0) {
			return 1;
		}else {
		return num*fact(num-1);
		}
	}
 
	static void comString(String string) {
	int count=1;
	StringBuffer sBuffer=new StringBuffer();
	for (int i = 0; i < string.length(); i++) {
		if(i<string.length()-1&&string.charAt(i)==string.charAt(i+1)) {
			count++;
		}else {
			sBuffer.append(string.charAt(i));
			sBuffer.append(count);
			count=1;
		}
	
	}
	System.out.println(sBuffer);
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	//	System.out.println("Enter a number");
	//	int num=scanner.nextInt();
	//	int result=fact(num);
	//	System.out.println(result);
		
		String string="aabbbcc";
		StringBuffer resultString=new StringBuffer();
		int count=0;
		String string2="";
		System.out.println("start");
		for (int i = 0; i < string.length(); i++) {
			
			for (int j = i; j < string.length(); j++) {
				if(string.charAt(i)==string.charAt(j))
				{	
					count++;
					if (j==string.length()-1) {
						i=j;
						break;	
					}
				}else {			
					i=j-1;
					break;
				}
			}
			System.out.println(i);
			string2=string2+string.charAt(i)+count;
			
			count=0;
		}
		System.out.println(string2);
		System.out.println("end");
		
	}		
}

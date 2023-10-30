package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class Checkfrequences {
	static	void checkword(String str) {
		char[] w=str.toCharArray();
		 Arrays.sort(w);
		 System.out.println(w);
		StringBuffer sb=new StringBuffer();
		String wordString="";
		for (int i = 0; i < str.length(); i++) {
			char c=w[i];
			
			for (int j= i+1; j <str.length(); j++) {
				char d=w[j];
				
				 if (c==d) {
					sb.append(c);
					sb.append(d); 
					w[i]=' ';
					w[j]=' ';
					sb.append(w);
				}
				  wordString=new String(sb);
			}
		}
		StringBuffer Result = new StringBuffer();
        for (int i = 0; i < wordString.length(); i++) {
            char ch = wordString.charAt(i);
            if (ch != ' ') {
                Result.append(ch);
            }
        }
        System.out.println(Result);
	}
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a word :");
		String word=scanner.nextLine();
		checkword(word);
	}
}

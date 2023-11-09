package com.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Streamio {
	public static void main(String[] args) throws IOException {
		
		
			
			File file=new File("First.txt");
			FileWriter fileWriter = new FileWriter("First.txt");;
			 try {
				 if (file.createNewFile()) {
					System.out.println("file create successfully" );
					 
				}else {
					System.out.println("already ");
				}
				
			} catch (IOException e) {
				System.out.println(e);
				e.printStackTrace();
			}
			  Scanner sc=new Scanner(System.in);
		      System.out.println("================================");
		      for(int i=0;i<3;i++){
		          String s1=sc.next();
		          int x=sc.nextInt();
		          System.out.printf("%-15s%03d%n", s1, x);
		       //  fileWriter.write(s1);
		         fileWriter.append(s1);
		      }
		      fileWriter.close();
		      System.out.println("================================");

		

	}
}

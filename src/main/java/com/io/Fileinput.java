package com.io;

import java.io.FileInputStream;

public class Fileinput {
	public static void main(String[] args) throws Exception {
		int size;
		FileInputStream f = new FileInputStream("E:\\Sts_Project\\Project_Pratice\\TestJava\\InputOutputExceptionProgram\\src\\com\\io\\FileInputStreamDemo.java");
		System.out.println("Total Avilable Bytes: " + (size = f.available()));
		System.out.println("First " + size + " bytes of the one read () at a time");
		for (int i = 0; i < size; i++) {
			System.out.print((char) f.read());
		}
		System.out.println("\nStill Avilable: " + f.available());
	}
}

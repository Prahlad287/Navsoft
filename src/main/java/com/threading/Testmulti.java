package com.threading;

import java.util.stream.Stream;

import org.eclipse.jdt.internal.compiler.batch.Main;

public class Testmulti {

	public static void main(String[] args) throws InterruptedException {
		Sleepjoin t1=new Sleepjoin();
		JavaName t2=new JavaName();
		JavaName.tmThread=Thread.currentThread();
	
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main");
			
		}
	}

}

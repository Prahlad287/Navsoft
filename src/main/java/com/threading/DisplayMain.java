package com.threading;

public class DisplayMain {

	public static void main(String[] args) {
		Display d=new Display();
		Display d2=new Display();
		DisplayThread t1=new DisplayThread(d);
		DisplayThread2 t2=new DisplayThread2(d2);
		t1.start();
		t2.start();
	}

}

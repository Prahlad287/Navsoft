package com.threading;

public class Multithreading extends Thread {
	@Override
	public void run() {
		System.out.println("Thread generate  "+ currentThread().getName());
		for (int i = 0; i < 5; i++) {
			System.out.println("this is multithreading run()");
		}
	}
	public static void main(String[] args) {
		Multithreading m=new Multithreading();
		m.start();
		System.out.println("Thread is :"+ currentThread().getName());
		System.out.println("Main");
		//m.run();
	}

}

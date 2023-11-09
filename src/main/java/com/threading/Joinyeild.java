package com.threading;

public class Joinyeild extends Thread{
	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
				System.out.println(i);
				if (i>=3) {
					currentThread().stop();
				}
				try {
					sleep(500);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		
		

		Joinyeild j=new Joinyeild();
		
	
		
		Joinyeild t1=new Joinyeild();
		Joinyeild t2=new Joinyeild();
		Joinyeild t3=new Joinyeild();
		Multithreading mt=new Multithreading();
	mt.start();
		mt.join();
		
		t1.start();
		System.out.println("Main");
		//t1.join();
		//]t2.join();
		
		
		
		
	}
	
}

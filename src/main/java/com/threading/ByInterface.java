package com.threading;

public class ByInterface implements Runnable {
	
		public void run() {
			System.out.println("Hello");
			System.out.println(Thread.currentThread().getName());
		}
	public static void main(String[] args) {
		ByInterface b=new ByInterface();
		b.run();
		Thread thread=new Thread( b);
		thread.start();
		
		StringBuilder sb1 = new StringBuilder("123456");
		System.out.println(sb1.subSequence(2, 4));
		System.out.println(sb1);
		sb1.deleteCharAt(3);
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		String s = "java2s".replace('a', 'Z').trim().concat("Aa");
	    s.substring(0, 2);
	    System.out.println(s);
	 
	    int myArray[];
	   
	    System.out.println(Integer.toHexString(47));
	}

}

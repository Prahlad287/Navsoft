package com.threading;

public class JavaName extends Thread{
 static Thread tmThread;
	@Override
	public void run() {
		
		try {
			tmThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] nameString= {"Prahlad","Avinash","Ajay"};
		for (int i = 0; i < nameString.length; i++) {
			System.out.println(nameString[i]);
		}
	}
	static Thread tmThread1=null;
	

}

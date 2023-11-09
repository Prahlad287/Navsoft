package com.threading;

import java.util.Iterator;

public class Cardveneu extends Thread{

	@Override
	public void run() {
		CardPrinting cp=new CardPrinting();
		
		cp.start();
		cp.interrupt();
		for (int i = 5; i >0; i--) {
			
			try {
				System.out.println("this is veneu of card");
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
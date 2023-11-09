package com.threading;

public class CardDistribute {
	public static void main(String[] args) throws InterruptedException {
		CardPrinting cp=new CardPrinting();
		Cardveneu cv=new Cardveneu();
		
		
		cv.start();
		cv.join();
		cp.start();
		
		
		
		
	}

}

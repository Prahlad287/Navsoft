package com.threading;

import java.awt.geom.Point2D;

public class Sleepjoin extends Thread {
	static Thread tmThread=null;
	@Override
	public void run() {
		
		JavaName t3=new JavaName();
		try {
			t3.join();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		for (int i = 0; i <5; i++) {
			System.out.println("Id : "+i);
		}
		
	}
	
}

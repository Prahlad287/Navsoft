package com.threading;

public class DisplayThread extends Thread{
	Display display;
	public DisplayThread(Display d) {
		this.display=d;
	}
	@Override
	public  void run() {
		display.showInt();
	}
}

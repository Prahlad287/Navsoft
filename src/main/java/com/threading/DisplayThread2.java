package com.threading;

public class DisplayThread2 extends Thread{
	Display display;
	public DisplayThread2(Display d) {
		this.display=d;
	}
	@Override
	public void run() {
		display.showChar();
	}
}
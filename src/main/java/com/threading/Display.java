package com.threading;

import java.util.Iterator;

public class Display {
		static synchronized void showInt() {
			for (int i = 0; i < 5; i++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		static synchronized	void showChar() {
			for (int i = 65; i < 75; i++) {
				System.out.print((char)i);
			}
			System.out.println();
		}
}

package com.test;

public class Testing {
	int a, b;

	void abc(int x,int y) {
		a=x;
		b=y;
	}
	void show() {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		try {
			
		}
		finally {
			System.out.println(" ");
		}
		
		Testing n=new Testing();
//		n.abc(5, 7);
		n.show();
		}

}
 abstract class hello{
	abstract void show();
}

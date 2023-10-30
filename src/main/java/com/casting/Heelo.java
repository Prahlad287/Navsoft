package com.casting;

public class Heelo extends Cyzz{
	public Heelo(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	void show() {
		System.out.println("this is last class method "+x+ "  "+y);
	}
	public static void main(String[] args) {
//		Abcc abc=new Abcc(10);
		int g=3;
		System.out.println(++g*8);
		double r,pi,a;
		r=9.8;
		pi=3.14;
		a=pi*r*r;
		System.out.println(a);
		char c[]=new char[10];
		for(int i=0;i<10;i++) {
			c[i]='i';
			System.out.println(c[i]);
			i++;
		}
		char aa='A';
		aa++;
		System.out.println((int)aa);
		boolean var1=true;
		boolean var2=false;
		
			System.out.println((var1&var2));
		
		/*
		 * Abcc abc2=new Cyzz(25, 45); abc2.show(); Abcc abc3=new Heelo(30, 40);
		 * abc3.show(); Heelo heelo=(Heelo) new Abcc(25); heelo.show();
		 */
	
	}
	enum Levels{
		
	}
}
class Abcc {
	int x;
	int y;
	public Abcc(int x) {
		this.x=x;
	
	}
	void show() {
		System.out.println("this is Abc class method "+ x);
	}

}

class Cyzz extends Abcc{
	int y;
	public Cyzz(int x, int y) {
		super(x);
		this.y=y;
		// TODO Auto-generated constructor stub
		
	}
	void show() {
		System.out.println("this is second class method "+ y);
	}
}
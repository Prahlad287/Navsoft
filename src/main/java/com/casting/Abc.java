package com.casting;

public class Abc {
	int x;
	int y;
	public Abc(int x) {
		this.x=x;
	
	}
	void show() {
		System.out.println("this is Abc class method"+ x);
	}

}

class Cyz extends Abc{
	int y;
	public Cyz(int x) {
		super(x);
		// TODO Auto-generated constructor stub
		
	}
	void show() {
		System.out.println("this is second class method "+ y);
	}
}
class Main extends Cyz{

	public Main(int x, int y) {
		super(x);
		// TODO Auto-generated constructor stub
	}
	void show() {
		System.out.println("this is last class method ");
	}
	public static void main(String[] args) {
	Abc abc=new Abc(10);
	abc.show();
	Abc abc2=new Cyz(15);
	abc2.show();
	Abc abc3=new Main(30, 40);
	abc3.show();
}
}

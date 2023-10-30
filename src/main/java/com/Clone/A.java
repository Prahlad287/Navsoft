package com.Clone;

public class A implements Cloneable{
	int x;
	B b;
	A(int y,B b){
		this.x=y;
		this.b=b;
		
	}
	public Object clone() throws CloneNotSupportedException
	{
		B b2=new B(b.y);
		A a=new A(x, b2);
		return a;
		
	}
	
}

package com.test;

public class Obj {
	int a;
	public Obj(int b) {
		a=b;
	}
public static void main(String[] args) {
	Obj obj=new Obj(10);
	Obj obj2=new Obj(10);
	
	System.out.println(obj==obj2);
	System.out.println(obj.equals(obj2));
}
}

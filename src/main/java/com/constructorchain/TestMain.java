package com.constructorchain;

public class TestMain extends Xyz{
	public static void main(String[] args) {
		TestMain main=new TestMain();
		main.show();
		
		
		
		Xyz xyz=new Xyz();
		xyz.show();
		
		
		Abc abc=new Abc();
		abc.show();
		
		Abc abc2=new Xyz();
		abc2.show();
		abc2.x=10;
	}

}

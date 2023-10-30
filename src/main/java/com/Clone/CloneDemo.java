package com.Clone;

public class CloneDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		B b=new B(20);
		
		A a1=new A(25, b);
		System.out.println(a1.x+ "  :   "+a1.b.y);
		
		A a2=(A) a1.clone();
		
		a2.x=555; a2.b.y=666;
		System.out.println(a2.x+ "  :   "+a2.b.y);
		System.out.println(a1.x+ "  :   "+a1.b.y);
		
		 // Iterate through the mixedArray and calculate the sums
     

	}

}

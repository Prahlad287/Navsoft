package com.shapes;

public class Test {
	 public Test(int i) {
		// TODO Auto-generated constructor stub
	}
	int Test(int a) {
		return a;
		
	}
	 void show() {
		 System.out.println("hello");
	 }
	 
	
	  
	 int func (int n)
     {
         int result;
         if (n == 1)
             return 1;
         result = func (n - 1)*n;
         return result;
     }
	 
	 public static void main(String[] args) {
		Test test=new Test(10);
		   System.out.println(test.func(1));
		int result=test.Test(10);
		System.out.println(result);
		test.show();
		
	}

}

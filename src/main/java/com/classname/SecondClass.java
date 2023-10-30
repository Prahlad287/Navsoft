package com.classname;

import java.lang.reflect.Method;

public class SecondClass extends GetclassName{
	public static void main(String[] args) {
		Class <?> class1=SecondClass.class;
		Class<?>  class2=class1.getSuperclass();
				
		System.out.println("Current class Name :"+class1.getName());
		System.out.println("Super class is : "+class2.getName());
		
		
		
		Method[] method=class2.getDeclaredMethods();
		System.out.println("super class method");
		for(Method method2: method) {
		System.out.println("Super class method is : "+method2.getName());
		}
		if(method.length>0) {
			System.out.println(method[0].getName());
		}else {
			System.out.println("there are no method in the class");
		}
		 
	}
}

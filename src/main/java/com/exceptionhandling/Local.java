package com.exceptionhandling;

class Myexception extends Exception
{
int detail;
    Myexception(int a)
    {
        detail = a;
}
public String toString()
    {
	System.out.println(detail);
    return "detail";
}
}
class Local {
	static void compute (int a) throws Myexception
    {
		System.out.println(a);
     throw new Myexception(a);	 
}
public static void main(String args[]) 
    {
        try
        {
            compute(3);
        }
       catch(Myexception e)
       {
           System.out.print("Exception");
       }
        
        
        try
        {
            System.out.print("A");

            throw new NullPointerException ("Hello");
        }
        catch(ArithmeticException e)
        {
    	System.out.print("B");        	
        }
}
}

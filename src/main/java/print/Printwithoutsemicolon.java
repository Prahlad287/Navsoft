package print;

import java.util.Scanner;

public class Printwithoutsemicolon {
	
	void oddeven(int number) {
		switch (number%2){
		 case 0:
             System.out.println("Even");
             break;
         case 1:
         case -1: // This covers both positive and negative odd numbers
             System.out.println("Odd");
             break;
         default:
             System.out.println("Invalid input");
     }
		 String result = (number % 2 == 0) ? "Even" : "Odd";
	        System.out.println("this is by ternary operator:  "+result);
	}
	
	static void printnumber(int start) {
		if(start<=10) {
			System.out.println(start);
			printnumber(start+1);
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number for chech odd even ");
		int num=scanner.nextInt();
		
		System.out.println("Enter start number for print  ");
		int start=scanner.nextInt();
		printnumber(start);
		Printwithoutsemicolon p=new Printwithoutsemicolon();
		p.oddeven(num);
		System.out.println("**************************************************");
		if(System.out.append("Hello, world") !=null) {
			
		}
		 
		
		System.out.println();
		System.out.println("**************************************************");
		
		 StringBuilder message = new StringBuilder();
	        message.append("Hello, world");
	        System.out.println(message.toString());
	        
	        
	        System.out.println("**************************************************");
	        if ("Hello, world".equals("Hello, world")) {
	            System.out.println("Hello, world");
	        }
	        
	        
	        {
	        	   int []x[] = {{1,2}, {3,4,5}, {6,7,8,9}};
	        	   int [][]y = x;
	        	   System.out.println(y[2][1]);
	        	   }
	        
	        
	        
	        String[] elements = { "for", "tea", "too" };
	          String first = (elements.length > 0) ? elements[0]: null;
	      System.out.println(first);
	      
	      
	      
	     
	              B obj2 = new B();
	              obj2.i = 1;
	              obj2.j = 2;
	              A r=(A) obj2;
	           //   r = obj2;
	           //   r.display();    
	      
	              B b=null;
	              b.display();
	 
	}

}

class A
{
  static  int i;
    public static void display()
    {
        System.out.println(i);
    }    
}    
class B extends A
{
  static  int j;
    public static void display()
    {
        System.out.println("Hello");
    }
}    



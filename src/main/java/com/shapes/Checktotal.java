package com.shapes;

public class Checktotal {
	public static void main(String[] args) {
		 final float costperUnit = 100;
		Circle circle=new Circle();
		System.out.println("this Answer is Circle class");
		float area=circle.getArea();
		float total1= circle.getTotalCost(costperUnit, area);
		System.out.println(total1);
		
		Rectangle rectangle=new Rectangle(15.0f, 10.2f);
		System.out.println("--------------------------------------------------------------");
		System.out.println("this Answer is Rectangle class");
		float area1=rectangle.getArea();
		System.out.println(area1);
		float total=rectangle.getTotalCost(costperUnit, area1);
		System.out.println("Total cost of Rectangle : "+total);
	}

}

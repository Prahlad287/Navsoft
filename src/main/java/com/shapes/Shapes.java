package com.shapes;


interface CheckArea1{
	 public static final float costperUnit = 100;
	float getArea();
	float getTotalCost(float a, float b);
	
	
}

public abstract class Shapes implements CheckArea1{
	@Override
	public float getTotalCost(float a,float b) {
		float total=a*b;
		return total;
		
	}
	

}
class Circle extends Shapes{
	float r;
	float Radius=3.14f;

	@Override
	public float getArea() {
		
		return Radius*r*r;
	}
	public int Circle(Float rr) {
		this.r=rr;
		return 0;
	}
		
}
class Rectangle extends Shapes{
	
	float length;
	float width;
	@Override
	public float getArea() {
		
		return length*width;
	}
	public Rectangle(float length, float width) {
		this.length=length;
		this.width=width;
	}
	
}



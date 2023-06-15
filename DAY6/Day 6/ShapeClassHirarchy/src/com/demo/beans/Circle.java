package com.demo.beans;

public class Circle extends Shape{
	private int radius;

	public Circle() {
		super();
	}

	public Circle(String c,int radius) {
		super(c);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return super.toString()+"Circle [radius=" + radius + "]";
	}
	public float calculateArea() {
		return (float)(Math.PI)*radius*radius;
	}
	public float calculatePerimeter() {
		return 2*(float)(Math.PI)*radius;
	}

}

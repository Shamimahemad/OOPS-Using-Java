package com.demo.beans;

public abstract class Shape {
	private static int cnt;
	static {
		cnt=1;
	}
	private int id;
	
	private String color;

	public Shape() {
		super();
		id=cnt++;
	}

	public Shape(String color) {
		super();
		id=cnt++;
		this.color = color;
	}
	public int getId() {
		return id;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public abstract float calculateArea();
	public abstract float calculatePerimeter();

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	

}

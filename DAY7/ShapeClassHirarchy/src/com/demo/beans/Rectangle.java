package com.demo.beans;

public class Rectangle extends Shape {
  private int base,height;

public Rectangle() {
	super();
}

public Rectangle(String c,int base, int height) {
	super(c);
	this.base = base;
	this.height = height;
}

public int getBase() {
	return base;
}

public void setBase(int base) {
	this.base = base;
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}

@Override
public String toString() {
	return super.toString()+"Rectangle [base=" + base + ", height=" + height + "]";
}
public float calculateArea() {
	return this.base*this.height;
}
public float calculatePerimeter() {
	return 2*(this.base+this.height);
} 
}

package com.demo.beans;

public class MyClass {
	private int id;
	private String name;
	
	public MyClass() {
		super();
	}

	public MyClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
  public int method1(int n) {
	  System.out.println("in merthod 1 "+n);
	  return n+12;
  }
  
	@Override
	public String toString() {
		return "MyClass [id=" + id + ", name=" + name + "]";
	}

}

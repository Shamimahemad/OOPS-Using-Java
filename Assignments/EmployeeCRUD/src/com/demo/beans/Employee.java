package com.demo.beans;

public class Employee {
	
	private int empid;
	private String ename;
	private String location;
	private float sal;
	public Employee() {
		super();
	}
	public Employee(int empid, String ename, String location, float sal) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.location = location;
		this.sal = sal;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", location=" + location + ", sal=" + sal + "]";
	}

}

package com.demo.beans;

public class Employee {
	private int empid;
	private String ename;
	private double sal;
	public Employee() {
		super();
	}
	public Employee(int empid, String ename, double sal) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
	}
	
	@Override
	public int hashCode() {
		System.out.println("in employee hashcode "+this.empid);
		return empid;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("in employee equals "+this.empid+"----"+((Employee)obj).empid);
		return empid==((Employee)obj).empid;
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
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", sal=" + sal + "]";
	}
	

}

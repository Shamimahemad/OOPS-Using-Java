package com.demo.beans;

public class Employee {
	private int empid;
	private String ename;
	private String desg;
	private double sal;
	public Employee() {
		super();
	}
	public Employee(int empid, String ename, String desg, double sal) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.desg = desg;
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
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", desg=" + desg + ", sal=" + sal + "]";
	}
	

}

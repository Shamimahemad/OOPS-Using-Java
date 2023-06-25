package com.demo.beans;

import java.io.Serializable;

public class Student implements Serializable {
	private int sid;
	private String sname;
	transient private double sal;
	public Student() {
		super();
	}
	public Student(int sid, String sname, double sal) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sal = sal;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sal=" + sal + "]";
	}
	

}

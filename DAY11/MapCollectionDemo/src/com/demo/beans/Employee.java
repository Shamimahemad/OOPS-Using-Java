package com.demo.beans;

public class Employee implements Comparable<Employee>{
	private int empid;
	private String ename;
	private double sal;
	private String email;
	public Employee() {
		super();
	}
	public Employee(int empid) {
		this.empid=empid;
		this.ename = null;
		this.sal = 0;
		this.email=null;
	}
	public Employee(int empid, String ename, double sal,String email) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
		this.email=email;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/*@Override
	public int hashCode() {
		System.out.println("in employee hashcode "+this.empid);
		return empid;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("in employee equals "+this.empid+"----"+((Employee)obj).empid);
		return empid==((Employee)obj).empid;
	}*/
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
		return "Employee [empid=" + empid + ", ename=" + ename + ", sal=" + sal + ", email=" + email + "]";
	}
	@Override
	public int compareTo(Employee o) {
		System.out.println("in compareTo method"+this.sal+","+o.sal);
		if(this.sal<o.sal) {
			return -1;
		}
		else if(this.sal==o.sal) {
			if(this.empid<o.empid)
				return -1;
			else if(this.empid==o.empid)
				return 0;
			else
				return 1;
					
		}
		else
			return 1;
	}
	
	

}

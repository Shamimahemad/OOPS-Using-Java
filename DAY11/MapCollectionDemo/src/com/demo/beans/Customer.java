package com.demo.beans;

public class Customer {
 private int custid;
 private String cname;
public Customer() {
	super();
}
public Customer(int custid, String cname) {
	super();
	this.custid = custid;
	this.cname = cname;
}
public int getCustid() {
	return custid;
}
public void setCustid(int custid) {
	this.custid = custid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}

@Override
public int hashCode() {
	System.out.println("in hashcode" + this.custid+"----" +this.cname);
	return custid+cname.hashCode();
}
@Override
public boolean equals(Object obj) {
	Customer c=(Customer)obj;
	System.out.println("in equals" + this.custid+"----" +this.cname+","+c.custid+"----"+c.cname);
	
	return this.custid==c.custid && this.cname.equals(c.cname);
}
@Override
public String toString() {
	return "Customer [custid=" + custid + ", cname=" + cname + "]";
}
 
}

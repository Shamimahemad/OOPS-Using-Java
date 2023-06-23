package com.demo.beans;

public class Product implements Comparable<Product> {
private int pid;
private String pname;
private int catid;
public Product() {
	super();
}
public Product(int pid, String pname, int catid) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.catid = catid;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getCatid() {
	return catid;
}
public void setCatid(int catid) {
	this.catid = catid;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", catid=" + catid + "]";
}
@Override
public int compareTo(Product o) {
	if(this.pid<o.pid)
		return -1;
	else if (this.pid==o.pid)
		return 0;
	else
		return 1;
}

}

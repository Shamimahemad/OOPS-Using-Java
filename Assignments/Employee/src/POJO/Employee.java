package POJO;

public class Employee {
   private int empid;
   private String ename;
   private String Location;
   private float sal;

@Override
public String toString() {
	return "Employee [empid=" + empid + ", ename=" + ename + ", Location=" + Location + ", sal=" + sal + "]";
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
	return Location;
}
public void setLocation(String location) {
	Location = location;
}
public float getSal() {
	return sal;
}
public void setSal(float sal) {
	this.sal = sal;
}
public Employee(String ename, String location, float sal) {
	super();

	this.ename = ename;
	Location = location;
	this.sal = sal;
}
}

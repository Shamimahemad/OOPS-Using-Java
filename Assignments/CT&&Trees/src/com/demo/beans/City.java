package com.demo.beans;
import java.util.ArrayList;
public class City implements Comparable{
	private String cname;
	
   private ArrayList<String> tl;
  
   public City() {
	   this.cname=null;
	   tl=new ArrayList<>();
   }
   public City(String cname,ArrayList<String> tn) {
	   this.cname=cname;
	   this.tl=tn;
   }
@Override
public String toString() {
	 
	return "City [cname=" + cname + ", TreeName=" + tl + "]";
}
@Override
public int compareTo(Object o) {
	
	return this.getCname().compareTo(((City)o).getCname());
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
   
}

package com.demo.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.Product;

public class TestProductSets {
public static void main(String[] args) {
	Set<Product> p=new TreeSet<>();
	p.add(new Product(13,"lays",1));
	p.add(new Product(17,"nachos",1));
	p.add(new Product(15,"pringles",1));
	p.add(new Product(10,"maggi",2));
	p.add(new Product(14,"pasta",2));
	p.forEach(ob->System.out.println(ob));
	
	//TreeSet
	
	Comparator<Product> c=(o1,o2)->{
		if(o1.getCatid()<o2.getCatid())
			return -1;
		else if(o1.getCatid()==o2.getCatid()) {
			
			  if(o1.getPid()<o2.getPid())
				  return -1;
			  else if(o1.getPid()==o2.getPid())
			       return 0;
			  else 
				  return 1;
			 }
		else
			return 1;
	};
	System.out.println("********************************************************");
	TreeSet<Product> ts=new TreeSet<>(c);
	ts.addAll(p);
	ts.forEach(ob->System.out.println(ob));
	System.out.println("********************************************************");
	//List 
	List<Product> plist=new ArrayList<>();
	plist.addAll(p);
	plist.sort(c);
	plist.forEach(ob->System.out.println(ob));
}
}

package com.demo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class TestIterator {

	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<>();
		lst.add(23);
		lst.add(5);
		lst.add(2);
		lst.add(51);
		for(Integer ob:lst) {
			//do not modify list in for each loop
			/*if(ob==5) {
				lst.remove(new Integer(ob));
			}*/
			System.out.println(ob);
		}
		Iterator<Integer> it=lst.iterator();
		while(it.hasNext()) {
			Integer d=it.next();
			if(d==5) {
				it.remove();
			}
		}
		//these are used for navigating in both directions
		ListIterator<Integer> lit=lst.listIterator();
		lit.previous();
		//enumeartors are used only in vector
		Vector<Integer> v=new Vector<>();
		v.add(3);
		v.add(5);
		v.add(31);
		v.add(51);
		v.add(13);
		v.add(53);
		Enumeration<Integer> e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		

	}

}

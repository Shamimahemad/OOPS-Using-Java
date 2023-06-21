package com.demo.comparators;

import java.util.Comparator;

import com.demo.beans.Employee;

public class MyNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// it uses compareTo function of string class
		//and gets the o/p as -1, 0, 1
		System.out.println("in Compare name method"+o1.getEname()+"----"+o2.getEname());
		return o1.getEname().compareTo(o2.getEname());
	}
	
	

}

package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	private static List<Employee> elist;
	static {
		elist=new ArrayList<>();
		elist.add(new Employee(1,"Rajan","game designer",88888));
		elist.add(new Employee(2,"revati","ux designer",99999));
		elist.add(new Employee(3,"Rajan","Analyst",7777));
	}
	
	@Override
	public void save(Employee e) {
		elist.add(e);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		return elist;
	}
	

}

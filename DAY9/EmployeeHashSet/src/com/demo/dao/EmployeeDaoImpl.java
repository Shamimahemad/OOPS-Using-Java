package com.demo.dao;

import java.util.HashSet;
import java.util.Set;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private static Set<Employee> empset;
	static {
		empset=new HashSet<>();
		empset.add(new Employee(12,"Rajan",4444));
		empset.add(new Employee(13,"Atharv",5555));
		
	}
	@Override
	public void save(Employee e) {
		empset.add(e);
		
	}
	@Override
	public Set<Employee> getAll() {
		return empset;
	}

}

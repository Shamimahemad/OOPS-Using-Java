package com.demo.service;

import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao edao;

	public EmployeeServiceImpl() {
		super();
		this.edao = new EmployeeDaoImpl();
	}

	@Override
	public void addnewEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter empid");
	    int empid=sc.nextInt();
	    System.out.println("enter ename");
	    String nm=sc.next();
	    System.out.println("enter Salary");
	    double s=sc.nextDouble();	
	    Employee e=new Employee(empid,nm,s);
	    edao.save(e);
		
	}

	@Override
	public Set<Employee> displayAll() {
		return edao.getAll();
	}
	

}

package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
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
		System.out.println("enter designation");
		String desg=sc.next();
		System.out.println("enter Salary");
		double s=sc.nextDouble();
		Employee e=new Employee(empid,nm,desg,s);
		edao.save(e);
		
	}


	@Override
	public List<Employee> displayAll() {
		return edao.getAllEmployee();
	}

}

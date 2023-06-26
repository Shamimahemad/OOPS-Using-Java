package com.demo.service;

import java.util.List;

import com.demo.Dao.EmployeeDao;
import com.demo.Dao.EmployeeDaoImpl;
import com.demo.beans.Employee;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao edao;

	public EmployeeServiceImpl() {
		super();
		this.edao = new EmployeeDaoImpl();
	}

	@Override
	public void addnewEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empid");
		int id = sc.nextInt();
		System.out.println("Enter Emloyee name...");
		String enm = sc.next();
		System.out.println("Enter Location..");
		String loc = sc.next();
		System.out.println("Enter salary..");
		float sal = sc.nextFloat();
		Employee e = new Employee(id, enm, loc, sal);
		edao.save(e);
	}

	@Override
	public boolean deleteById(int empid) {

		return edao.deletById(empid);
	}

	
	@Override
	public List<Employee> displayAll() {

		return edao.displayAll();
	}

	@Override
	public Employee displayById(int empid) {

		return edao.displayById(empid);
	}

	@Override
	public void closeConnection() {

		edao.closeConnection();

	}

	@Override
	public List<Employee> displaySorted() {

		return edao.SortBySal();
	}

	@Override
	public boolean updateEmp(int empid, float sal) {
		
		return edao.UpdateEmp(empid, sal);
	}

}

package com.demo.service;

import java.util.Map;
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
	    System.out.println("enter email");
	    String em=sc.next();
	    System.out.println("enter Salary");
	    double s=sc.nextDouble();	
	    Employee e=new Employee(empid,nm,s,em);
	    edao.save(e);
		
	}

	@Override
	public Map<Integer, Employee> displayAll() {
		return edao.getAll();
	}

	// it will search the object and ask user do you want to delete it
	//if user says yes then it will delete it, otherwise it will return false
	@Override
	public boolean deleteById(int id) {
		Scanner sc=new Scanner(System.in);
		//find object with given id
		Employee ob=edao.searchById(id);
		//if found
		if(ob!=null) {
			System.out.println("do you want to delete"+ob.getEmpid()+","+ob.getEname());
			String ans=sc.next();
			if(ans.equals("y"))
				return edao.removeById(id);
		}

	return false;
		
	}

	@Override
	public boolean modifySal(int id, double newsal) {
		return edao.modifySalary(id,newsal);
	}

	@Override
	public Employee displayById(int id) {
		return edao.searchById(id);
	}

	@Override
	public Set<Employee> displayByName(String nm) {
		return edao.searchByName(nm);
	}

	@Override
	public Set<Employee> sortBySal() {
		return edao.sortData();
	}

	@Override
	public Set<Employee> sortByName() {
		return edao.sortByName();
	}
	

}

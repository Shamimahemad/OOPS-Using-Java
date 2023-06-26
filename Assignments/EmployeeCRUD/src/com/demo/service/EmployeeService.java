package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	void addnewEmployee();

	boolean deleteById(int empid);





	List<Employee> displayAll();

	Employee displayById(int empid);

	void closeConnection();

	List<Employee> displaySorted();

	

	boolean updateEmp(int empid, float sal);

}

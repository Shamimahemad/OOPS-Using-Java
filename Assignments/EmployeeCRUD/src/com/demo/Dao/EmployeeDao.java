package com.demo.Dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void save(Employee e);

	void closeConnection();

	boolean deletById(int id);

	List<Employee> displayAll();

	Employee displayById(int empid);



	boolean UpdateEmp(int empid, float sal);

	List<Employee> SortBySal();

}

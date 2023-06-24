package com.demo.dao;

import java.util.Map;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void save(Employee e);

	Map<Integer, Employee> getAll();

	Employee searchById(int id);

	boolean removeById(int id);

	

	boolean modifySalary(int id, double newsal);

	Set<Employee> searchByName(String nm);

	Set<Employee> sortData();

	Set<Employee> sortByName();

}

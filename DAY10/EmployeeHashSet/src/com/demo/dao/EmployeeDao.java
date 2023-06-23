package com.demo.dao;

import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void save(Employee e);

	Set<Employee> getAll();

	boolean removeById(int id);

	Employee searchById(int id);

	boolean modifySalary(int id, double newsal);

	Set<Employee> searchByName(String nm);

	Set<Employee> sortData();

	Set<Employee> sortByName();

}

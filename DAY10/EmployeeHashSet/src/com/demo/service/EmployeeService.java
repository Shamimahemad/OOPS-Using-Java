package com.demo.service;

import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeService {

	void addnewEmployee();

	Set<Employee> displayAll();

	boolean deleteById(int id);

	boolean modifySal(int id, double newsal);

	Employee displayById(int id);

	Set<Employee> displayByName(String nm);

	Set<Employee> sortBySal();

	Set<Employee> sortByName();

}

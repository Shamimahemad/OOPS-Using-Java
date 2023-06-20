package com.demo.dao;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
   private static Map<Integer,Employee> hm;
   static {
	   hm=new HashMap<>();
	   hm.put(111,new Employee(111,"Ashu",888888,"a@ff"));
	   hm.put(112,new Employee(112,"Deepa",6666,"a@ff"));
	   hm.put(113,new Employee(113,"Babita",888888,"a@ff"));
   }
@Override
public void save(Employee e) {
	hm.put(e.getEmpid(), e);
	
}
@Override
public Map<Integer, Employee> getAll() {
	return hm;
}
@Override
public Employee searchById(int id) {
	return hm.get(id);
}
@Override
public Set<Employee> searchByName(String nm) {
	Set<Employee> es=new HashSet<>();
	for(Integer ob:hm.keySet()) {
		if(hm.get(ob).getEname().equals(nm))
			es.add(hm.get(ob));
	}
	if(es.size()>0) {
		return es;
	}
	return null;
	
	
}
@Override
public Set<Employee> sortData() {
	TreeSet<Employee> tssal=new TreeSet<>();
	for(Integer ob:hm.keySet()) {
		tssal.add(hm.get(ob));
	}
	return tssal;
}
@Override
public Set<Employee> sortByName() {
	Comparator<Employee> c=(o1,o2)->{
		return o1.getEname().compareTo(o2.getEname());
	};
	TreeSet<Employee> tsname=new TreeSet<>(c);
	for(Integer ob:hm.keySet()) {
		tsname.add(hm.get(ob));
	}
	return tsname;
}
@Override
public boolean modifySalary(int id, double newsal) {
	Employee e=hm.get(id);
	if(e!=null) {
		e.setSal(newsal);
		return true;
	}
	return false;
			
}
@Override
public boolean removeById(int id) {
	if(hm.remove(id)!=null)
		return true;
	return false;
}
   
}

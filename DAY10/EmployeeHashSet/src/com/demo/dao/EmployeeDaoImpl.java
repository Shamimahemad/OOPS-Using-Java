package com.demo.dao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private static Set<Employee> empset;
	static {
		empset=new HashSet<>();
		empset.add(new Employee(12,"Rajan",4444,"rr@g"));
		empset.add(new Employee(13,"Atharv",5555,"rr123@g"));
		
	}
	@Override
	public void save(Employee e) {
		empset.add(e);
		
	}
	@Override
	public Set<Employee> getAll() {
		return empset;
	}
	@Override
	public boolean removeById(int id) {
		
		return empset.remove(new Employee(id));
	}
	@Override
	public Employee searchById(int id) {
		for(Employee ob:empset) {
			if(ob.getEmpid()==id)
				return ob;
		}
		return null;
	}
	@Override
	public boolean modifySalary(int id, double newsal) {
		Employee e=searchById(id);
		if(e!=null) {
			e.setSal(newsal);
			return true;
		}
		return false;
	}
	@Override
	public Set<Employee> searchByName(String nm) {
		//Set<Employee> hset=new HashSet<>();
		/*for(Employee ob:empset) {
			if(ob.getEname().equals(nm)) {
				hset.add(ob);
			}
		}*/
		Set<Employee> hset=empset.stream().filter(ob->ob.getEname().equals(nm)).collect(Collectors.toSet());
		if(hset.size()>0)
			return hset;
	    return null; 
	}
	@Override
	public Set<Employee> sortData() {
		Set<Employee> tset=new TreeSet<>();
		for(Employee ob :empset) {
			tset.add(ob);
		}
		return tset;
		
	}
	@Override
	public Set<Employee> sortByName() {
		Comparator<Employee> c=(o1,o2)->{
			System.out.println("in comparator for name");
			return o1.getEname().compareTo(o2.getEname());
		};
		Set<Employee> eset=new TreeSet<>(c);
		for(Employee ob:empset) {
			eset.add(ob);
		}
		return eset;
	}

}

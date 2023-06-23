package com.demo.test;
import java.util.HashSet;
import java.util.Set;

import com.demo.beans.Employee;
public class TestHashSetEmployee {
	public static void main(String[] args) {
		Set<Employee> s=new HashSet<>();
		s.add(new Employee(12,"xxx",4567,"a"));
		s.add(new Employee(13,"yyyy",4567,"a"));
		s.add(new Employee(12,"aaaa",555,"a"));
		s.add(new Employee(12,"bbbb",777,"a"));
		System.out.println(s);
	}

}

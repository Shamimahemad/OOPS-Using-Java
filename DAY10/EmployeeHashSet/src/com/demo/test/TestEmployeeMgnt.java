package com.demo.test;

import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeMgnt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService es=new EmployeeServiceImpl(); 
		int choice=0;
		do {
		System.out.println("1. Add new Employee\n2. Display all\n 3. Disaly by id\n 4. Display by name");
		System.out.println("5. sort by sal\n 6. sort by name\n 7. modify sal\n 8. delete by id\n 9.exit");
		System.out.println("choice : ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			es.addnewEmployee();
			break;
		case 2:
			Set<Employee> s=es.displayAll();
			s.forEach(a->{System.out.println(a);});
			break;
		case 3:
			System.out.println("enetr id");
			int id=sc.nextInt();
			Employee e=es.displayById(id);
			if(e!=null) {
				System.out.println(e);
			}
			else {
				System.out.println("not found");
			}
			break;
		case 4:
			System.out.println("enetr name");
			String nm=sc.next();
			Set<Employee> eset=es.displayByName(nm);
			if(eset!=null) {
				eset.forEach(a->{System.out.println(a);});
			}
			else {
				System.out.println("not found");
			}
			break;
		case 5:
			eset=es.sortBySal();
			eset.forEach(a->{System.out.println(a);});
			break;
		case 6:
			eset=es.sortByName();
			eset.forEach(a->{System.out.println(a);});
		case 7:
			System.out.println("enetr id");
			id=sc.nextInt();
			System.out.println("enter new salary");
			double newsal=sc.nextDouble();
			boolean status=es.modifySal(id,newsal);
			if(status) {
				System.out.println("modify successfully");
			}
			else {
				System.out.println("not found");
			}
			break;
		case 8:
			System.out.println("enter id");
			 id=sc.nextInt();
			status=es.deleteById(id);
			if(status) {
				System.out.println("deleted successfully");
			}
			else {
				System.out.println("not found");
			}
			break;
		case 9:
			sc.close();
			System.out.println("Thank you for visiting ....");
			break;
		default:
			System.out.println("wrong choice");
				
		
		}
		
		}while(choice!=9);
	}

}

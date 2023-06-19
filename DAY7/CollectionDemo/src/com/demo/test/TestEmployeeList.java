package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeList {

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
			List<Employee> list=es.displayAll();
			//java 5 
			/*for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}*/
			//java 7
			/*for(Employee ob:list)
			{
				System.out.println(ob);
			}*/
			//java 8
			list.forEach(ob->{System.out.println(ob);});
			break;
		case 3:
			break;
		case 9:
			sc.close();
			System.out.println("Thank you for visiting.....");
			break;
		default:
				
		}
		
		}while(choice != 9);

	}

}

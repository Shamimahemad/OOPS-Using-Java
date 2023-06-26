package com.demo.test;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

import java.util.List;
import java.util.Scanner;
public class TestEmp {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int choice=0; 
		EmployeeService es=new EmployeeServiceImpl();
	    System.out.println("hiiiii");
		do {
			System.out.println("\n1.AddEmployee \n2.DeleteEmpById \n3.ModifyEmp \n4.DisplayAll");
			System.out.println("\n5.DisplayById \n6.Display in Sorted \n7.Exit");
			 choice=sc.nextInt();
			switch(choice) {
			case 1:
				es.addnewEmployee();
				break;
			case 2:
				System.out.println("enter empid..");
				int empid=sc.nextInt();
				boolean status=es.deleteById(empid);
				if(status) {
					System.out.println("emplyee deleted..");
				}else {
					System.out.println("employee not found..");
				}
				break;
			case 3:
				System.out.println("Enter empid");
				empid=sc.nextInt();
				System.out.println("Enter Emloyee name...");
				String ename=sc.next();
				System.out.println("Enter Location..");
				String loc=sc.next();
				System.out.println("Enter salary..");
				float Sal=sc.nextFloat();
				boolean sts=es.updateEmp( empid, Sal);
				if(sts) {
					System.out.println("Employee update successfully..");
				}else {
					System.out.println("Employee not found..");
				}
				break;
			case 4:
				  List<Employee> elist=es.displayAll();
				  elist.forEach(System.out::println);
				break;
			case 5:
				System.out.println("Enter empid..");
				empid=sc.nextInt();
				Employee e=es.displayById(empid);
				if(e!=null) {
					System.out.println(e);
				}else {
					System.out.println("Employee not found..");
				}
				break;
			case 6:
				elist=es.displaySorted();
				elist.forEach(System.out::println);
				break;
			case 7:
				es.closeConnection();
				System.out.println("Thank you for visiting.....");
				break;
			}
		}while(choice!=7);
		System.out.println("helo");

	}

	
}

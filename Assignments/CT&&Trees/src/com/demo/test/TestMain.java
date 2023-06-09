package com.demo.test;
import java.util.*;

import com.demo.beans.City;
import com.demo.service.CTService;
import com.demo.service.CTServiceImpl;
public class TestMain {

	public static void main(String[] args) {
		CTService cs=new CTServiceImpl();
		Scanner sc=new Scanner(System.in);
		int choice=0;
         do {
        	 System.out.println("\n1.Add City Name \n2.Display All \n3.exit ");
        	 choice=sc.nextInt();
        	 switch(choice) {
        	 case 1:
        		
        		 cs.addCity();
        		 break;
        	 case 2:
        		 Set<City> cts = cs.displayAll();
        		 cts.forEach(c->System.out.println(c));
        		 break;
        	 case 3:
        		 sc.close();
        		 System.out.println("Thank you for visiting....");
        		 break;
        	 }
         }while(choice!=3);
	}

}

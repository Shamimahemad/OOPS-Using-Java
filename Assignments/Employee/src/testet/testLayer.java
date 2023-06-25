package testet;
import java.util.Scanner;

import Dao.EmployeeDaoImpl;
public class testLayer {

	public static void main(String[] args) {

      try (Scanner sc=new Scanner(System.in);)
      {
    	  EmployeeDaoImpl dao=new EmployeeDaoImpl();
    	  System.out.println("Enter Emp Id :");
    	  dao.getEmpDetailsById(sc.nextInt()).forEach(System.out::println);
		
	} catch (Exception e) {
		
	}

	}

}

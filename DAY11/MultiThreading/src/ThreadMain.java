import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreadMain {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Thread1 [] th=new Thread1[3];
  
    for(int i=0;i<3;i++) {
    	System.out.println("Enter Id : ");
    	int id=sc.nextInt();
    	System.out.println("Enter Name : ");
    	String name=sc.next();
    	th[i]=(new Thread1(id,name));
    	
    }
    for(int i=0;i<3;i++) {
    	th[i].start();
    }
    	
    }
   

}

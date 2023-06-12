import java.util.Scanner;

public class TestPersonArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		System.out.println("1. add new data \n 2. Display all\n 3. Calculate percentage marks\n 4. find grades\n5. exit");
		System.out.println("Choice : ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("1. PHD student\n 2. MAster student\n3. Faculty\n choice: ");
			int ch=sc.nextInt();
			PersonService.addnewdata(ch);
			break;
		case 2:
			PersonService.displayall();
		case 3:
			System.out.println("enetr student id");
			String id=sc.next();
			int marks=PersonService.findPerscentage(id);
			if(marks!=-1) {
				System.out.println("percentage : "+marks);
			}
			else {
				 System.out.println("not found");
			}
			break;
		case 5:
			sc.close();
			System.out.println("Thank you for visiting");
			break;
		default:
			System.out.println("wrong choice");
		}
		}while(choice!=5);
	}

}

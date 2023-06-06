import java.util.Scanner;

public class TestPersonArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		   System.out.println("1. add new Person\n 2.Search by id\n 3. search by name\n");
		   System.out.println("4. display all employee\n 5.display by birth month\n 6. exit\nChoice: ");
		   choice=sc.nextInt();
		   switch(choice) {
		   case 1:
			   PersonService.addnewPerson();
			   break;
		   case 2:
			   System.out.println("enter pid");
			   int pid=sc.nextInt();
			   Person p=PersonService.searchById(pid);
			   if(p!=null) {
				   System.out.println(p);
			   }
			   else {
				   System.out.println("not found");
			   }
			   break;
		   case 3:
			   System.out.println("enter name");
			   sc.nextLine();
			   String nm=sc.nextLine();
			   int cnt=PersonService.searchByName(nm);
			   //check whether found data
			   if(cnt!=0) {
				   System.out.println(cnt+"Number of person with name "+nm);
			   }else {
				   System.out.println("not found");
			   }
			   break;
		   case 4:
			  PersonService.displayAll();
			  break;
		   case 5:
			   System.out.println("enter month for searching");
			   int month=sc.nextInt();
			   cnt=PersonService.searchByMonth(month);
			   if(cnt!=0) {
				   System.out.println(cnt+"Number of person has bday in month"+month);
			   }else {
				   System.out.println("not found");
			   }
			   break;
		   case 6:
			   sc.close();
			   //System.exit(0);
			    System.out.println("Thank you for visiting.....");
			   break;
			   
		   default:
			   System.out.println("Wrong choice");
		}
		   
		   
		}while(choice!=6);
	}

}

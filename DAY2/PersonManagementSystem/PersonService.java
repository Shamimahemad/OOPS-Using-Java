import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PersonService {
	private static Person[] perarr;
	private static int cnt;
	static {
		perarr=new Person[50];
		perarr[0]=new Person(12,"Rajan","33333",new Date());
		perarr[1]=new Person(13,"Revati","4444",new Date());
		perarr[2]=new Person(14,"Atharv","5555",new Date());
		cnt=3;
	}
	public static void addnewPerson() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pid");
		int pid=sc.nextInt();
		sc.nextLine();
		System.out.println("enter pname");
		String pname=sc.nextLine();
		System.out.println("enter mobile");
		String m=sc.next();
		System.out.println("enter bdate dd/mm/yyyy");
		String bdt=sc.next();
		SimpleDateFormat sdt=new SimpleDateFormat("dd/MM/yyyy");
		Date dt=null;
		try {
		  dt=sdt.parse(bdt);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		perarr[cnt]=new Person(pid,pname,m,dt);
		cnt++;
		
		
	}
	//display objects till cnt
	public static void displayAll() {
		for(int i=0;i<cnt;i++) {
			System.out.println(perarr[i]);
		}
		/*for(Person ob:perarr) {
			if(ob!=null)
				System.out.println(ob);
			else
				break;
		}*/
		
	}
	//search by id and return object if found otherwise return null
	public static Person searchById(int pid) {
		for(int i=0;i<cnt;i++) {
			if(perarr[i].getPid()==pid) {
				return perarr[i];
			}
		}
		return null;
	}
	public static int searchByName(String nm) {
		int cnt1=0;
		for(int i=0;i<cnt;i++) {
			if(perarr[i].getPname().equals(nm)) {
				System.out.println(perarr[i]);
				cnt1++;		
			}
		}
		
		return cnt1;
	}
	public static int searchByMonth(int month) {
		int cnt1=0;
		for(int i=0;i<cnt;i++) {
			int m=perarr[i].getBdate().getMonth();
			if(m==month) {
				System.out.println(perarr[i]);
				cnt1++;
			}
		}
		return cnt1;
	}

}

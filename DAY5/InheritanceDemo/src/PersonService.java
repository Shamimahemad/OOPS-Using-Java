import java.util.Scanner;

public class PersonService {
	private static Person[] perarr;
	private static int cnt;
	static {
		perarr=new Person[20];
		cnt=0;
	}

	public static void addnewdata(int ch) {
		
		Person ob=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pid");
		int pid=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter mobile");
		String mob=sc.next();
		if(ch<3) {
			//accept student details
			System.out.println("enter m1");
			int m1=sc.nextInt();
			System.out.println("enter m2");
			int m2=sc.nextInt();
			System.out.println("enter m3");
			int m3=sc.nextInt();
			if(ch==1) {
				System.out.println("enter sp_sub marks");
				int spmks=sc.nextInt();
				System.out.println("enter thesis name");
				String th=sc.next();
				perarr[cnt]=new PHDStudent("p", nm, mob, m1, m2, m3, th, spmks);
			}
			else {
				System.out.println("enter sp_sub marks");
				int spcoursemks=sc.nextInt();
				System.out.println("enter m4");
				int m4=sc.nextInt();
				System.out.println("enter m5");
				int m5=sc.nextInt();
				perarr[cnt]=new MasterStudent("m", nm, mob, m1, m2, m3, m4, m5, spcoursemks);
			}
			
			
		}else {
			//accept faculty details
			//perarr[cnt]=ob;=new Faculty();
		}
		
		
	}

	
	public static void displayall() {
		for(int i=0;i<perarr.length;i++) {
			System.out.println(perarr[i]);
			//PHDStudent pd=new PHDStudent();
			//System.out.println(pd);
		}
		
	}

	public static int  findPerscentage(String id) {
		Student ob=serchById(id);
		if(ob!=null) {
			return ob.calculateGrade();
		}
		return -1;
		
	}

	private static Student serchById(String id) {
		for(int i=0;i<cnt;i++) {
			if(perarr[i].getPid().equals(id)) {
				if(perarr[i] instanceof Student)
				     return (Student)perarr[i];
				else
					return null;
			}
		}
		return null;
	}

}

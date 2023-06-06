import java.util.Date;

public class TestPerson {
 public static void main(String[] args) {
	Person ob=new Person(12,"Rajan","3444",new Date());
	System.out.println(ob);
	//parameterized constructor 
	Person ob1=new Person(12,"Revati","5555",new Date());
	System.out.println(ob1);
	//default constructor and setter methods
	Person ob2=new Person();
	ob2.setPid(23);
	ob2.setPname("Atharv");
	ob2.setMobile("33333");
	ob2.setBdate(new Date());
	
	System.out.println(ob2);
	System.out.println("name : "+ob2.getPname());
	ob2.setMobile("5555");
	System.out.println(ob2);
}
}

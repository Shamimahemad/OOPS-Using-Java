
public class TestStudent {

	public static void main(String[] args) {
		Student s=new Student();
		Student s1=new Student("s","Rajan","3333",99,98,97);
		System.out.println(s1);
		s1.m1();
		PHDStudent ps1=new PHDStudent("p","Rajan","3333",99,98,97,"xxx",89);
        MasterStudent ms1=new MasterStudent("m","Revati","3333",99,98,97,89,77,77);
        System.out.println(ms1);
        System.out.println(ps1);
	}

}

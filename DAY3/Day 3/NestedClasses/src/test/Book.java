package test;

public class Book {  
	private int bkid;
	int cnt=0;
	private String bkname;
	Lesson lesson;
	public Book(int bid,String name,Lesson l) {
		this.bkid=bid;
		this.bkname=name;
		this.lesson=l;
	}
	
	public void m1() {
		System.out.println("in book class method");
	}
	public void m3() {
		lesson.m2();
		//m2() //error;
	}                         
	
	public void setLesson(Lesson l) {
		this.lesson=l;
	}
	public String toString() {
		return " Book id : "+this.bkid + "book name: "+this.bkname+" Lesson : "+ lesson;	
				}
	

}
public class Lesson{  
	int cnt=10;
	private int lessonid;
	private String lname;
	public void m2() {
		System.out.println(cnt);
		System.out.println("in Lesson class method");
		m1();
	}
	
}
import test.Book;
import test.Book.Lesson;

import static test.Book.*;

public class TestBookClass {
	public static void main(String[] args) {
	   Book b=new Book(12,"xxx",null);
	   Lesson l=b.new Lesson();
	   b.setLesson(l);
	   l.m2();
	   System.out.println(b);
	   ParentClass p=new ParentClass();
	   ParentClass.ChildClass ob=new ParentClass.ChildClass(); //bcaz of child class is static

	   // parrent.childClass ob=p.new childClass(); // --for non static child class

	   //Book.Lesson pb=b. new Lesson();//
	   
	}
}

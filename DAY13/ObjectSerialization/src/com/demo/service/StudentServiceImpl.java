package com.demo.service;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Student;

public class StudentServiceImpl implements StudentService {
      private static List<Student> lst;
      static {
    	  lst=new ArrayList<>();
    	  lst.add(new Student(12,"xxxx",45678));
    	  lst.add(new Student(13,"yyyy",45555));
    	  lst.add(new Student(14,"zzzz",6666));
      }
	@Override
	public void writeFile() {
		System.out.println("in writeFile");
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("test.txt"))){
			for(Student ob:lst) {
				oos.writeObject(ob);
			}
			
		}catch(IOException e){
			System.out.println("error");
			e.printStackTrace();
		}
		
	}
	@Override
	public void readFile() {
		System.out.println("in readFile");
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("test.txt"))){
			while(true) {
				Student s=(Student) ois.readObject();
				System.out.println(s);
			}
			
		}catch(EOFException e){
			System.out.println("exit");
		
		} catch(IOException e){
			System.out.println("exit");
		
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
      
      
}










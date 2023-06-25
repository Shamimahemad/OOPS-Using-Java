package com.demo.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.demo.beans.Student;

public class TestStudentDIS {
public static void main(String[] args) {
	Student s=new Student(12,"xxx",54646);
	try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("emp.txt"));
			DataInputStream dis=new DataInputStream(new FileInputStream("emp.txt"));) {
		//write student data in the file
		dos.writeInt(s.getSid());
		dos.writeUTF(s.getSname());      
		dos.writeDouble(s.getSal());
		
		//read data
		System.out.println("sid: "+dis.readInt());
		System.out.println("sname: "+dis.readUTF());
		System.out.println("sal: "+dis.readDouble());
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}
}

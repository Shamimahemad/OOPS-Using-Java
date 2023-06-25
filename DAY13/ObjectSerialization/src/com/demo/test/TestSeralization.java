package com.demo.test;

import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;


public class TestSeralization {
	
	public static void main(String[] args) {
		StudentService ss=new StudentServiceImpl();
		ss.writeFile();
		ss.readFile();
	}

}

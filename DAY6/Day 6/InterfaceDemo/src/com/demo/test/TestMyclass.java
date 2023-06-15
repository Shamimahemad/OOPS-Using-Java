package com.demo.test;

import com.demo.beans.MyClass;
import com.demo.interfaces.I1;
import com.demo.interfaces.I2;

public class TestMyclass {

	public static void main(String[] args) {
		I1 ob=new MyClass();
		ob.m11();
		((MyClass)ob).m21();
		I1.methiodstatic();
		System.out.println(I1.i);
		//I1.i=45;  //error
		
	}

}

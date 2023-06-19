package com.demo.test;

import com.demo.beans.MyClass;
import com.demo.interfaces.I1;
import com.demo.interfaces.I2;
import com.demo.interfaces.MyfunctionalInterface;

public class TestMyclass {

	public static void main(String[] args) {
		I1 ob=new MyClass();
		ob.m11();
		((MyClass)ob).m21();
		I1.methiodstatic();
		System.out.println(I1.i);
		//I1.i=45;  //error
		
		MyfunctionalInterface<String> strinterface=(x,y)->{
			return x.length()>y.length()?x:y;
		};
		String s=strinterface.mycompare("Hello" , "Welcome");
		System.out.println(s);
		
		MyfunctionalInterface<Integer> intinterface=(x,y)->{
			return x>y?x:y;
		};
		
		
		int n=intinterface.mycompare(20, 30);
		System.out.println(n);
	}

}

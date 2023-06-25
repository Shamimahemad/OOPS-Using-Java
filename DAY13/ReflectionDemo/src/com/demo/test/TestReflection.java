package com.demo.test;

import java.lang.reflect.Method;

import com.demo.beans.MyClass;

public class TestReflection {

	public static void main(String[] args) {
		MyClass ob=new MyClass(12,"xxx");
        Class cls=ob.getClass();
        Method[] marr=cls.getMethods();
        for(Method m:marr) {
        	System.out.println(m.getName());
        }
        
	}

}

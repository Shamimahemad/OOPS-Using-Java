package com.demo.beans;
import com.demo.Interface.FunctionalInterface;
public class GenericClass1 implements FunctionalInterface<String>  {
	public String compare(String x,String y) {
		return x.length()>y.length()?x:y;
	}

}

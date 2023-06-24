package com.demo.beans;
import com.demo.Interface.FunctionalInterface;
public class GenericClass implements FunctionalInterface<Integer>{

	@Override
	public Integer compare(Integer x, Integer y) {
		
		return x>y?x:y;
	}
	


	
}

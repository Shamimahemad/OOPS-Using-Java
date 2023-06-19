package com.demo.test;

import com.demo.beans.MyClass;
import com.demo.interfaces.MyGeneric;
import com.demo.interfaces.MyGeneric2;
import com.demo.interfaces.MyInter2;
import com.demo.interfaces.Myinter1;

public class TestMyClass {

	public static void main(String[] args) {
		Myinter1 ob=new MyClass();
		ob.test(12, 15);
		Myinter1 ob2=(a,b)->a+b;
		ob2.test(0, 0);
		
		MyInter2 ob1=(x,y)->x+y;
		
		MyGeneric<String> first=(x,y)->{
			return x+y;
		};
		MyGeneric<Integer> intfirst=(x,y)->{
			return x+y;
		};
		MyGeneric2<Long, Integer> ob=()->{};

	}

}

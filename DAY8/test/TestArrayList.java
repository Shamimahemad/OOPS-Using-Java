package com.demo.test;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> alist=new ArrayList<>();
		alist.add(5);
		
		for(int i=0;i<10;i++) {
			alist.add(i+100);
		}
		alist.add(100);
		System.out.println(alist);

	}

}

package com.demo.test;

import java.util.Set;
import java.util.TreeSet;

public class TestBackedCollection {

	public static void main(String[] args) {
		TreeSet<Integer> s=new TreeSet<>();
		s.add(12);
		s.add(20);
		s.add(34);
		s.add(40);
		Set<Integer> s1=s.headSet(34);
		System.out.println("Complete set : "+s);
		System.out.println("Head Set : "+s1);
		s.add(15);
		System.out.println("Complete set after 15 : "+s);
		System.out.println("Head Set : "+s1);
		Set<Integer> s2=s.tailSet(34);
		Set<Integer> s3=s.tailSet(34,false);
		System.out.println("Complete set : "+s);
		System.out.println("Tail set : "+s2);
		System.out.println("Tail set after false : "+s3);
		s.add(45);
		System.out.println("After adding 45"+s);
		System.out.println(s2);

	}

}

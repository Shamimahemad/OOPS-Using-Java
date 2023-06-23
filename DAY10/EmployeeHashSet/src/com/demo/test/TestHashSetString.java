package com.demo.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestHashSetString {
  public static void main(String[] args) {
	Set<String> s=new HashSet<>();
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<10;i++) {
		System.out.println("enter string");
		String str=sc.next();
		s.add(str);
	}
	System.out.println(s);
}
}

package com.demo.test;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(23);
		s.add(10);
		s.push(11);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

}

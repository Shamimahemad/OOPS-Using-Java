package com.demo.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestCollections {

	public static void main(String[] args) {
		List<Integer> lst=Arrays.asList(12,12,3,4,12,20);
		Collections.sort(lst);
		System.out.println(lst);
		System.out.println("min value "+Collections.min(lst));
		Collections.shuffle(lst);
		System.out.println(lst);
		Collections.shuffle(lst);
		System.out.println(lst);
	}

}

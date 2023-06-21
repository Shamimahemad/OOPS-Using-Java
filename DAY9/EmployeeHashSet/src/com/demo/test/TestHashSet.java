package com.demo.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

public class TestHashSet {

	public static void main(String[] args) {
		Set<Integer> hset=new HashSet<>();
		hset.add(12);
		hset.add(10);
		hset.add(50);
		for(int i=0;i<10;i++) {
			hset.add(i+10);
		}
		if(hset.add(10)) {
			System.out.println("added");
		}
		else {
			System.out.println("not added");
		}
		System.out.println(hset);
		Predicate<Integer> p=num->num>15;
		hset.removeIf(p);
		System.out.println(hset);
		
		//to navigate through hashset
		/*Iterator<Integer> it=hset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		for(Integer ob:hset) {
			System.out.println(ob);
		}*/
		hset.forEach(a->{System.out.println(a);});

	}

}

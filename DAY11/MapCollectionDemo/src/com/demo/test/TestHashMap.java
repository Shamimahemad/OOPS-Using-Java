package com.demo.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestHashMap {
public static void main(String[] args) {
	Map<String,Integer> hm=new HashMap<>();
	//add data
	hm.put("DAC", 300);
	hm.put("DBDA", 60);
	hm.put("DAI", 70);
	hm.put("DTISS",120);
	//to get value based on key
	System.out.println("Value of DAC" +hm.get("DAC"));
	int num=70;
	//display all the keys from the map with values>70
	Set<String> s=hm.keySet();
	for(String k:s) {
		if(hm.get(k)>num) {
			System.out.println(k);
		}
	}
	System.out.println("****************************");
	//display all the keys from the map with values>70
	Set<Map.Entry<String,Integer>> s1=hm.entrySet();
	for(Map.Entry<String,Integer> entry:s1 ) {
		if(entry.getValue()>num) {
			System.out.println(entry.getKey());
		}
	}
	System.out.println("****************************");
	//display all the values from the map
	//Set<Map.Entry<String,Integer>> s1=hm.entrySet();
	for(Map.Entry<String,Integer> entry:s1 ) {
		System.out.println(entry.getKey()+"----->"+entry.getValue());
		
	}
	//display all the values from the map
	System.out.println("****************************");
	for(String k:s) {
		System.out.println(k+"--------"+hm.get(k));
		
	}
	
	Map<String,Integer> tm=new TreeMap<>(hm);
	System.out.println(tm);
	
	
}
}

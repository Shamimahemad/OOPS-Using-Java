package com.demo.test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class TestHashMap11 {

	public static void main(String[] args) {
		Map<String,Integer> hm=new HashMap<>();
		hm.put(null, null);
		hm.put("xxx", null);
		hm.put("yyyy", null);
		hm.put("xxx", 30);
		System.out.println(hm);
		if(!hm.containsKey("xxx"))
				hm.put("xxx", 50);
		if(!hm.containsKey("vvv"))
			hm.put("vvv", 50);
		System.out.println(hm);
		hm.remove("vvv")
		
		//null key is not allowed in HAshtable
		Map<String,Integer> ht=new Hashtable<>();
		ht.add(null,null);
		
	}

}

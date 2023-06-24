package com.demo.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public class TestHashMapCustomer {
	public static void main(String[] args) {
		Map<Customer,ArrayList<Item>> cm=new HashMap<>();
		ArrayList<Item> arr=new ArrayList<>();
		arr.add(new Item(1,"Chair",2));
		arr.add(new Item(2,"Table",2));
		cm.put(new Customer(100,"xxx"), arr);
		ArrayList<Item> arr1=new ArrayList<>();
		arr1.add(new Item(1,"Chair",2));
		arr1.add(new Item(3,"Shelf",3));
		cm.put(new Customer(101,"xxx"), arr1);
		System.out.println(cm);
	}

}

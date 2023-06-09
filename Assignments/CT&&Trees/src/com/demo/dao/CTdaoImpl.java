package com.demo.dao;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.City;
public class CTdaoImpl implements CTdao {
	
    static Set<City> ctset;
    
 //   al.Add
      static {
    	  ctset=new TreeSet<>();
 //   	  cset.add(new City("Pune", al));
      }
	@Override
	public void addCity() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		ArrayList<String> al= new ArrayList<>();
		System.out.println("Enter City name");
		String ct= sc.next();
		System.out.println("How many trees you want to add");
		int cnt=sc.nextInt();
		for(int i=0;i<cnt;i++) {
			System.out.println("Enter "+i+" Tree name:");
			String tr = sc.next();
			al.add(tr);
		}
		System.out.println("outside for llop");
		ctset.add(new City(ct, al));
		
	}
	@Override
	public Set<City> displayAll() {
		// TODO Auto-generated method stub
		return ctset;
	}
	
}

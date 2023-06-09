package com.demo.service;

import java.util.Set;

import com.demo.beans.City;
import com.demo.dao.CTdao;
import com.demo.dao.CTdaoImpl;

public class CTServiceImpl implements CTService {
    CTdao cd=new CTdaoImpl();
	@Override
	public void addCity() {
	cd.addCity();
		
	}
	@Override
	public Set<City> displayAll() {
		// TODO Auto-generated method stub
		return cd.displayAll();
	}

}

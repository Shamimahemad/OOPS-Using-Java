package com.demo.interfaces;

public interface I2 {
	void m21();
	void m22();
	default int m31(int x) {
		System.out.println("in default method 31"); 
		return x+10;
		
	}
}

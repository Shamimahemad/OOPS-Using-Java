package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Circle;
import com.demo.beans.Rectangle;
import com.demo.beans.Shape;
import com.demo.beans.Triangle;

public class ShapeService {
	private static Shape[] sarr;
	private static int cnt;
	static {
		sarr=new Shape[20];
		cnt=0;
	}
	

	public static void addnewShape(int ch) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter color");
		String c=sc.next();
		switch(ch) {
		case 1:
			System.out.println("enter base");
			int b=sc.nextInt();
			System.out.println("enter height");
			int h=sc.nextInt();
			System.out.println("enter side 1");
			int s1=sc.nextInt();
			System.out.println("enter side 2");
			int s2=sc.nextInt();
			sarr[cnt]=new Triangle(c,b,h,s1,s2);
			break;
		
		case 2:
			System.out.println("enter base");
			b=sc.nextInt();
			System.out.println("enter height");
			h=sc.nextInt();
			sarr[cnt]=new Rectangle(c,b,h);
			break;
		case 3:
			System.out.println("enter radius");
			int r=sc.nextInt();
			sarr[cnt]=new Circle(c,r);
		}
		cnt++;
		
		
	}


	public static void displayAll() {
		for(int i=0;i<cnt;i++) {
			System.out.println(sarr[i]);
		}
		
	}
    
	public static int searchById(int id) {
		for(int i=0;i<cnt;i++) {
			if(sarr[i].getId()==id) {
				return i;
			}
		}
		return -1;
	}

	public static String CalculateDetails(int id) {
		int pos=searchById(id);
		if(pos!=-1) {
			float area=sarr[pos].calculateArea();
			float perimeter=sarr[pos].calculatePerimeter();
			return area+","+perimeter;
		}else {
			return null;
		}
		
		
	}


	public static String calculateNumber() {
		int tcnt=0,ccnt=0,rcnt=0;
		for(int i=0;i<cnt;i++) {
			if(sarr[i] instanceof Triangle) {
				tcnt++;
			}else {
				if(sarr[i] instanceof Circle)
					ccnt++;
				else
					rcnt++;
			}
		}
		return "Triangle :"+tcnt+", Circle : "+ccnt+", reactangle: "+rcnt;
		
	}

}

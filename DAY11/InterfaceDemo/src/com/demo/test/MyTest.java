package com.demo.test;
import com.demo.beans.*;
import com.demo.Interface.FunctionalInterface;
public class MyTest{

	public static void main(String[] args) {
		
      FunctionalInterface obj=new GenericClass1();
//     int t= (int) obj.compare(12, 44);
//      System.out.println(t);
     System.out.println(obj.compare("hello", "welcome"));
     
     FunctionalInterface <Integer> intcom=(x,y)->{
    	 return x>y?x:y;
     };
     int n =intcom.compare(14, 25);
     System.out.println(n);
     
     
     
     FunctionalInterface <String> strcom=(x,y)->{
    	 return  x.length()>=y.length()?x:y;
     };
     String str1=strcom.compare("Shamim","Ganesh balki");
     System.out.println(str1);
	
     FunctionalInterface <Integer> factcom=(x,y)->{
    	 int fact=1;
    	
    	 for(int i=1;i<=x;i++)
    		  fact=fact*i;
    	 return fact;
     };
     int fact=factcom.compare(6,null);
     System.out.println(fact);
	}    
}

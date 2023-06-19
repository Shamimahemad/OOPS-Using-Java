package com.demo.interfaces;

@FunctionalInterface
public interface MyfunctionalInterface<T> {
      T mycompare(T x,T y);
     
      public static void mystatic1() {
    	  System.out.println("In mystatic1 method");
      }
      public static void mystatic2() {
    	  System.out.println("In mystatic1 method");
      }
     default void mym1() {
    	  System.out.println("In mystatic1 method");
      }
     default void mym2() {
   	  System.out.println("In mystatic1 method");
     }
}

package com.demo.interfaces;

//T is bounded variable, T can be any child class of Number only,
//cannot be any other data type
public interface MyGeneric2<T extends Number,F> {
	F compare(T x,T y);

}

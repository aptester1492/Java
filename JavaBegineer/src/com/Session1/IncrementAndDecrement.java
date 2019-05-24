package com.Session1;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		int i=1;							   //post increment
		int j=i++;		
		System.out.println(i);
		System.out.println(j);
	    System.out.println("**************");
	    
		int b=1;							   //pre increment
		int c=++b;
		System.out.println(b);
		System.out.println(c); 
		System.out.println("**************");
		
		int v=1;							   //pre increment	
		int h=++v;
		System.out.println(v);
		System.out.println(h);
		System.out.println("**************");
		
		int d=1;    						   //post decrement
		int r=d--;
		System.out.println(d);
		System.out.println(r);
		System.out.println("**************");
		
		int y=1;									//pre decrement
		int z=--y;
		System.out.println(y);
		System.out.println(z);
	}
}

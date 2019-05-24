package com.Session1;

public class ArrayConcept {

	
	public static void main(String[] args) {
		
		int i[]=new int[4];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
//		for(int j=0;j<i.length;j++)
//		System.out.println(i[j]);
		
		for(int x=0;x<i.length;x++) {
			System.out.println(i[x]);
		}
   		

		 double d[]= new double [3];
		 d[0]=20;
		 d[1]=30;
		 d[2]=40;
		 
		 String st[]=new String[4];
		 st[0]="90";
		 st[3]="50";
		 
		char c[]=new char[3];
		c[1]='3';
		c[2]='4';
	System.out.println("*********");	
	//to overcome the similar data type problem  use Object	 class in Array
		Object ob[]=new Object[5];
		ob[2]=34;
		ob[3]='e';
		ob[1]="string";
		ob[0]=10.30;
		ob[4]=70;
		for(int p=0;p<ob.length;p++) {
			System.out.println(ob[p]);
		}
		System.out.println(ob.length);
		
	}
}

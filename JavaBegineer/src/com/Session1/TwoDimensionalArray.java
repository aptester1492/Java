package com.Session1;

public class TwoDimensionalArray {
	
	public static void main(String[] args) {
		String st[][]=new String[3][4];
		st[0][0]="Hello";
		st[0][1]="Namaste";
		st[0][2]="Sasriyekal";
		
		
		st[1][0]="Hello";
		st[1][1]="Namaste";
		st[1][2]="Sasriyekal";
		
		st[2][0]="Hello";
		st[2][1]="Namaste";
		st[2][2]="Sasriyekal";
		
		
		for (int row=0;row<st.length;row++) {
			for(int col=0;col<st[0].length;col++) {
				System.out.println(st[row][col]);
			}
		}
		
		System.out.println("**************");
		
		System.out.println(st.length);
		System.out.println(st[0].length);
		
	}

}

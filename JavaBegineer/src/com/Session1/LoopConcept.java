package com.Session1;

public class LoopConcept {
	
	public static void main(String[] args) {
		
	//while loop use for iterate 
		//         disadvantage if we not increment or decrement infinite loop will generate		
		int i=10;		
		while(i>=1) {
			System.out.println(i);
			i--;
		}
	System.out.println("**********************");	
		//for loop  (declaration part, condition, incre or decremental part)
		
		for(int i1=10;i1>=1;i1--) {
			System.out.println(i1);
		}
		System.out.println("******************");
		for(int j=20;j<=30;j++) {
			System.out.println(j);
		}
	}

}

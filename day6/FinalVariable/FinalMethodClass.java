package com.day6.FinalVariable;

public class FinalMethodClass {
			
			//constructor
			FinalMethodClass(){
				System.out.println("This is Default constructor");
			}
			
			final int a= 100;
			
			// Final method
			
			final void show() {
				System.out.println("Value of a : "+ a);
			}

}

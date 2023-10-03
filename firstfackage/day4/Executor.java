package com.firstfackage.day4;

public class Executor {
public static void main(String[] args) {
		
		//assessing same package class
		Base b1=new Base();
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		
		b1.varDefault=11;
		b1.methodDefault();
		
		//private can't accessible
		
		b1.varProtected=31;
		b1.methodProtected();
		
		b1.varPublic=41;
		b1.methodPublic();
		
		//instance of operator
		System.out.println(b1 instanceof Base);  //return type
		

	}


}

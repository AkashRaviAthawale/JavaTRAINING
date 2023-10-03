package com.thirdfackage.day4;

public class PrivateConstructor {

	public static void main(String[] args) {
		//m1 private Constructor
		
		MyClass m= MyClass.getObject();
		//m.setId(10);
		
		MyClass m1 = MyClass.getObject();
		
		System.out.println(m);
		System.out.println(m1);
		
		

	}

}

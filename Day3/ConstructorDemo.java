package com.Day3;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		int id;
		
		System.out.println("Enter customer id:");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter customer name:");
		name=sc.nextLine();
		
		//System.out.println("Enter customer city:");
		//city=sc.nextLine();
		
	   Customer c1=new Customer (); //default
	   //c1.setCustomername("name");
	   c1.setCustomerId(id);
	   //c1.setCustomercity("city");
		System.out.println("c1");		
		
		System.out.println("Enter customer id:");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter customer name:");
		name=sc.nextLine();
		
		//System.out.println("Enter customer city:");
		//city=sc.nextLine();
		
		//Customer c2=new Customer("name","id","city");
		//System.out.println(c2);
		
		

	}

}

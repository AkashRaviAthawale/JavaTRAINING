package com.firstfackage.day4;

import java.util.Scanner;

public class PersonDemo {
	public static void main(String[] args) {
	
		Person p1 = new Person();
		
		Scanner sc = new Scanner(System.in);
		String city,name;
		int age;
		System.out.println("Enter Person Detail : Name,age and city");
		name=sc.nextLine();
		age=sc.nextInt();
		sc.nextLine();
		city=sc.nextLine();
		p1.setPersonName(name);
		p1.setPersonAge("age");
		p1.setPersonCity(city);
		
		System.out.println("Person Detail Name :"+ p1.getPersonName()+"\t Age:" +p1.getPersonAge()+"\tCity:"+p1.getPersonCity());	
		System.out.println("Enter Person Detail : Name,age and city");
		name=sc.nextLine();
		age=sc.nextInt();
		sc.nextLine();
		city=sc.nextLine();
		
		p1 = new Person(name,age,city);
		System.out.println("Person Detail Name :"+ p1.getPersonName()+"\t Age:" +p1.getPersonAge()+"\tCity:"+p1.getPersonCity());	
		
	}

}

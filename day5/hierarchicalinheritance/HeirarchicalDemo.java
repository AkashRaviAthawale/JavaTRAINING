package com.day5.hierarchicalinheritance;

public class HeirarchicalDemo {

	public static void main(String[] args) {
		
		Person p1=new Person();
		System.out.println(p1);
		
		
		Person p;
		
		p=new Person("akash","Akola");
		if(p instanceof Person)
			System.out.println("person Details"+p);
		
		p=new Employee("akjhil","amravti",131,50000,"iit");
		if(p instanceof Employee)
			System.out.println("Employee Details"+p);
	}

}

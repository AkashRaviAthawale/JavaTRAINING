package com.day5.association.isa;

public class IsADemo {

	public static void main(String[] args) {
		
		Employee emp=new Employee("akash",101,"IT");
		Manager mger=new Manager("shrutika",102,"Hr",10);
		
		System.out.println(emp);
		System.out.println(mger);

	}

}

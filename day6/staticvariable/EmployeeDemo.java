package com.day6.staticvariable;

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee e = new Employee ("akhil", 100);
		System.out.println(e);
		
		System.out.println(Employee.companyName);
		
		e = new Employee ("kumar", 200);
		System.out.println(e);
	}

}

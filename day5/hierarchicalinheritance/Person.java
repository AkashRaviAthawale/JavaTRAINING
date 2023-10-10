package com.day5.hierarchicalinheritance;

public class Person {
	private String name;
	private String city;
	
	public Person() {
		System.out.println("Person class default constrctor");
		name="Akash";
		city="Akola";
	}
	
	public Person(String nmae,String city) {
		
		this.name=name;
		this.city=city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	
	
}

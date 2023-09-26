package com.Day3.b;

public class Person {

	//Data members
	private String name;
	private int income;
	private String gender;
	private int age;
	private int tax;
	                                           
	//Getter and setter 
	
	public int getTax() {
		return tax;
	}
	
	public void setTax(int tax) {
		this.tax=tax;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getIncome() {
		return income;
	}
	
	public void setIncome(int income) {
		this.income=income;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender=gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age= age;
	}
	
	@Override
	public String toString() {
		return "Preson [name="+name +", income="+income +", gender="+gender +", age="+age+"]";
	}
	
}

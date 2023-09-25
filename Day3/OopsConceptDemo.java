package com.Day3;

public class OopsConceptDemo {
	
	private int serialNum;
	private String name;
	private int age;
	
	public void getSerialNum() {
		//return serialNum;
	}
	
	public void setSerialNum(int serialNum) {
		this.serialNum=serialNum;
	}
	
	public String getName() {
		return name;
		
	}
	public int getAge() {
		
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	@Override
	public String toString() {

		return "OopsConceptDemo[Serial Number="+serialNum +", name="+name +", age="+age +"]";
	}

}

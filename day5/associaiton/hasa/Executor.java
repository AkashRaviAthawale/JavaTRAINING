package com.day5.associaiton.hasa;

public class Executor {

	public static void main(String[] args) {
		Address address = new Address("100 enclave","Akola","maharastra","45555");
		Person person = new Person("akash",address);
		person.displayInfo();

	}

}

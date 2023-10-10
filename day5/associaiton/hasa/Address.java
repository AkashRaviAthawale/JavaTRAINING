package com.day5.associaiton.hasa;

public class Address {
	
	private String street;
	private String city;
	private String state;
	private String postalCode;
	
	public Address() {
		super();
	}
	
	public Address(String street ,String city, String state, String postalCode) {
		
		super();
		this.street=street;
		this.city=city;
		this.street=state;
		this.postalCode=postalCode;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setCity(String street) {
		this.street=street;
	}
	
	public String getState() {
		return state;
	}
	
	public void setStreet(String state) {
		this.state=state;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setcity(String city) {
		this.city=city;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	
	public void setPostalCode(String postalCode ) {
		this.postalCode=postalCode;
	}
	
	

}

package com.htc.spring4.beans;

public class Address {
	private String doorno;
	private String city;
	private String street;
	private String pincode;
	public String getDoorno() {
		return doorno;
	}
	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", city=" + city + ", street=" + street + ", pincode=" + pincode + "]";
	}
	public Address() {
		
	}
	public Address(String doorno, String city, String street, String pincode) {
		super();
		this.doorno = doorno;
		this.city = city;
		this.street = street;
		this.pincode = pincode;
	}
	
	
}

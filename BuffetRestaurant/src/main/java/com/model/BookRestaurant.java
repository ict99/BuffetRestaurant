package com.model;

//pojo class with required attributes,getters and setters 
public class BookRestaurant {
	
	private String customerName; 
	private String contactNumber;
	private String hallType;
	private int adultVegCount;
	private int kidsVegCount;
	private int adultNonVegCount;
	private int kidsNonVegCount;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getHallType() {
		return hallType;
	}
	public void setHallType(String hallType) {
		this.hallType = hallType;
	}
	public int getAdultVegCount() {
		return adultVegCount;
	}
	public void setAdultVegCount(int adultVegCount) {
		this.adultVegCount = adultVegCount;
	}
	public int getKidsVegCount() {
		return kidsVegCount;
	}
	public void setKidsVegCount(int kidsVegCount) {
		this.kidsVegCount = kidsVegCount;
	}
	public int getAdultNonVegCount() {
		return adultNonVegCount;
	}
	public void setAdultNonVegCount(int adultNonVegCount) {
		this.adultNonVegCount = adultNonVegCount;
	}
	public int getKidsNonVegCount() {
		return kidsNonVegCount;
	}
	public void setKidsNonVegCount(int kidsNonVegCount) {
		this.kidsNonVegCount = kidsNonVegCount;
	}	

}

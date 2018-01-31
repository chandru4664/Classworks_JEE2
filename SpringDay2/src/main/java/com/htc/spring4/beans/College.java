package com.htc.spring4.beans;

public class College {

	private String collegeName;
	private String collegeAddress;
	
	public College(){}

	public College(String collegeName, String collegeAddress) {
		super();
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegeAddress() {
		return collegeAddress;
	}

	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}

	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", collegeAddress="
				+ collegeAddress + "]";
	}
	
}

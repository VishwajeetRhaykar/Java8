package com.pro.studentproblem;

public class Student {

	private String name;
	private String address;
	private int mobileNo;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String address, int mobileNo) {
		super();
		this.name = name;
		this.address = address;
		this.mobileNo = mobileNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", mobileNo=" + mobileNo + "]";
	}
	

}

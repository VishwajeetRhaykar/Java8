package com.pro.map;

public class Person //implements Comparable  
{

	private int id;
	private String name;
	private String address;
	
	public Person() {
		super();
	}
	public Person(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
//	@Override
//	public int compareTo(Object o) {
//			Person p1 =(Person) o;
//			
//			Integer num1 =this.getId();
//			Integer num2 =p1.getId();
//			
//			return -num1.compareTo(num2);
//	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}

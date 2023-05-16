package com.pro.equals;

public class Test {

	public static void main(String[] args) {

		Student s1 = new Student(10,"Ram");
		
		Student s2 = new Student(10,"Ram");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		Student s3 =s1;
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		
	}

}

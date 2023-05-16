package com.pro.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfSalaries {

	public static void main(String[] args) {
		
		Person p1 = new Person(10,"Ram",5000); 
		Person p2 = new Person(30,"Sham",4000); 
		Person p3 = new Person(20,"Hari",6000); 
		Person p4 = new Person(50,"Umesh",5300); 
		Person p5 = new Person(40,"Nilesh",8000); 
		Person p6 = new Person(60,"Nitin",3200); 
		Person p7 = new Person(70,"Vaibhav",4500); 
		Person p8 = new Person(80,"Ketan",3600); 
		
		List<Person> list = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8);
		
		int sum = list.stream().collect(Collectors.summingInt(Person :: getSalary));
		
		System.out.println("Total Salary is :"+sum);
		
		int sumOfSelected = list.stream().filter(a -> a.getSalary() > 5000).collect(Collectors.summingInt(Person :: getSalary));
		
		System.out.println("Total Salary os person whos salary is greater than 5000 :"+sumOfSelected);
		
	
	} 

}

package com.pro.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalary {

	public static void main(String[] args) {
		Person p1 = new Person(10,"Ram",5000); 
		Person p2 = new Person(30,"Sham",4000); 
		Person p3 = new Person(20,"Hari",6000); 
		Person p4 = new Person(50,"Umesh",5000); 
		Person p5 = new Person(40,"Nilesh",6000); 
		Person p6 = new Person(60,"Nitin",3000); 
		Person p7 = new Person(70,"Vaibhav",4000); 
		Person p8 = new Person(80,"Ketan",3000); 
		
		List<Person> list = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8);
		
//		Grouping by Salary
		
		double avg = list.stream()
				.collect(Collectors.averagingInt(Person :: getSalary));
		
		System.out.println(avg);
		
		Map<Integer,Long > map1 = list.stream()
				.collect(Collectors.groupingBy(a -> a.getSalary(),Collectors.counting()));
		System.out.println(map1);
	}

}

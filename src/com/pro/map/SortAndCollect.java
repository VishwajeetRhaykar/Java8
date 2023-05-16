package com.pro.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortAndCollect {

	public static void main(String[] args) {

		Person p1 = new Person(10, "Ram", "Pune");
		Person p2 = new Person(20, "Sham", "Mumbai");
		Person p3 = new Person(30, "Vishal", "Satar");
		Person p4 = new Person(40, "Hari", "Kolhapur");
		Person p5 = new Person(50, "Nilesh", "Sangli");

		List<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p4);
		list.add(p2);
		list.add(p5);
		list.add(p3);
		System.out.println("Converting list to map ");

		System.out.println(" taking key as id and value as name");

//		list.stream().sorted().forEach(System.out::println);
//		System.out.println(list);

//	by implementing Comparable in person class and then sorting 

//	Map<Integer, String> map = list.stream().sorted().collect(Collectors.toMap(
//			Person :: getId, Person :: getName,
//			(oldValue,newValue)-> oldValue,   // if same key, take the old key
//			LinkedHashMap::new ));             // if same key, take the old key

// without implementing Comparable in person class and then sorting 

//	
	Map<Integer, String> map = list.stream().sorted(Comparator.comparingLong(Person :: getId).reversed()).collect(Collectors.toMap(
			Person :: getId, Person :: getName,
			(oldValue,newValue)-> oldValue,   // if same key, take the old key
			LinkedHashMap::new ));             // if same key, take the old key
	System.out.println(map);
	}

}

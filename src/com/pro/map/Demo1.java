package com.pro.map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {

		Person p1 = new Person(10,"Ram","Pune");
		Person p2 = new Person(20,"Sham","Mumbai");
		Person p3 = new Person(10,"Vishal","Satar");
		Person p4 = new Person(40,"Hari","Kolhapur");
		Person p5 = new Person(50,"Nilesh","Sangli");
		
		List<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
	System.out.println("Converting list to map ");
	
	System.out.println(" taking key as id and value as name");

//	if Duplicate key present and we are using Collectors.toMap() we will get exception
//	 (oldValue,newValue)-> oldValue)  means if key is duplicate refer old value  for that key
//	 (oldValue,newValue)-> newValue)  means if key is duplicate refer new value for that key  
	
	Map<Integer, String> map = list.stream().collect(Collectors.toMap(Person :: getId, Person :: getName,(oldValue,newValue)-> oldValue));
	Map<Integer, String> map1 = list.stream().collect(Collectors.toMap(Person :: getId, Person :: getName,(oldValue,newValue)-> newValue));
	System.out.println(map);
	System.out.println(map1);
	
	Map<String,String> map2 = list.stream().collect(Collectors.toMap(Person :: getName, Person :: getAddress, (oldValue,newValue) -> oldValue,LinkedHashMap :: new));
	
	System.out.println(map2);
	
	
	}

}



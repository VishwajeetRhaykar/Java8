package com.pro.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortingObjectList {

	public static void main(String[] args) {

		Person p1 = new Person(10,"Ram","Pune");
		Person p2 = new Person(20,"Sham","Mumbai");
		Person p3 = new Person(30,"Vishal","Satar");
		Person p4 = new Person(40,"Hari","Kolhapur");
		Person p5 = new Person(50,"Nilesh","Sangli");
		
		List<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p4);
		list.add(p2);
		list.add(p5);
		list.add(p3);
		
		System.out.println("Sorting list by id ");
		List l1 = list.stream().sorted(Comparator.comparingInt(Person::getId)).collect(Collectors.toList());
	    System.out.println(l1);
		
	    System.out.println("Sorting list by name ");
		List l2 = list.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());
	    System.out.println(l2);
	    
	    List<String> list2 = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");

        /*
		List<String> sortedList = list.stream()
			.sorted((o1,o2)-> o2.compareTo(o1))
			.collect(Collectors.toList());
		*/
		
        List<String> sortedList = list2.stream()
			.sorted(Comparator.reverseOrder())
			.collect(Collectors.toList());
        List<String> sortedList1 = list2.stream()
    			.sorted(Comparator.naturalOrder())
    			.collect(Collectors.toList());
        List<String> sortedList2 = list2.stream()
    			.sorted()
    			.collect(Collectors.toList());

      System.out.println(sortedList);
      System.out.println(sortedList1);
      System.out.println(sortedList2);
      
      
	}

}

package com.pro.map;

import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {

//		 checking difference bet forEach() and ForEachOrdered
		
		Stream<String> s = Stream.of("a", "b", "c", "1", "2", "3");
		Stream<String> s1 = Stream.of("a", "b", "c", "1", "2", "3");
//		s.forEach(x -> System.out.println(x));  
		System.out.println(">>>>>>");
		s.parallel().forEach(x -> System.out.println(x));
		System.out.println(">>>>>>");
		s1.parallel().forEachOrdered(System.out :: println);
		
		  
	}

}

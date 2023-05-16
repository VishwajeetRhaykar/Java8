package com.pro.problems;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class WordOccurance {

	public static void main(String[] args) {

		String s = "Hellow World";
				
			Arrays.stream(s.split(" "))
			.collect(Collectors.groupingBy(a->a,LinkedHashMap::new,Collectors.counting()))
			.forEach((k,v) -> System.out.println(k+" "+v));
		
	}

}

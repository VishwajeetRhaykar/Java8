package com.pro.problems;

import java.util.Arrays;
import java.util.List;

public class FindFirst {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(15,16,75,84,56,41,31,56,89);
		
		Integer n =list.stream().findFirst().get();
		
		long count =list.stream().count();
		
		System.out.println(n);
		System.out.println(count);
	
		
		
	}

}

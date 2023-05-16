package com.pro.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(15,16,75,84,56,41,31,56,89);
		
		List<Integer> l = list.stream().filter(a -> a%2==0).collect(Collectors.toList());
		
		System.out.println(l);
	}

}

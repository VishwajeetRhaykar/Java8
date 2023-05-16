package com.pro.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseByJ8 {

	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(15,16,75,84,56,41,31,56,89);
		
		LinkedList<Integer> l = new LinkedList<>();
		list.stream().forEach(a -> l.addFirst(a));
		System.out.println(l);
	
//		
		List l1 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(l1);
		
		
		
	}

}

package com.pro.problems;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(15,16,75,16,56,75,31,56,89);
		
		Set<Integer> items = new HashSet();
//        Set set= list.stream()
//                .filter(n -> !items.add(n)) // Set.add() returns false if the element was already in the set.
//                .collect(Collectors.toSet());
//		Set set = list.stream().filter(a-> ! items.add(a)).collect(Collectors.toSet());
		
//		System.out.println(set);
		
//	By using collections.frequency()
		
		Set set =	list.stream().filter(a -> Collections.frequency(list,a)>1).collect(Collectors.toSet());
	  
		System.out.println(set);
	}

}

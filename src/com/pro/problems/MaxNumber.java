package com.pro.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxNumber {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(15,16,75,84,56,41,31,65,89);
		
//		By using Comparator.naturalOrder
		int maxNumber = list.stream().max(Comparator.naturalOrder()).get();
		
		System.out.println(maxNumber);
	
//		By using Comparator.naturalOrder() to get min Number
		
		int minN = list.stream().min(Comparator.naturalOrder()).get();
		System.out.println(minN);
		
//		By using integer's compare method
		
		int maxN = list.stream().max(Integer :: compare).get();
		
		int min2 = list.stream().min(Integer :: compare).get();
		System.out.println(maxN+"  "+min2);
	
//   by using comparoter.comparing and valueof
		maxN = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		
		 min2 = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(maxN+"  "+min2);
	}

}

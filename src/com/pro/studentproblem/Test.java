package com.pro.studentproblem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<String> list1 = list.stream().map(String :: valueOf)
		.collect(Collectors.toList());
		System.out.println(list1);
	}

}

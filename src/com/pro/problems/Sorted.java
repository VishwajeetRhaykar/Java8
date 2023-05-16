package com.pro.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(15, 16, 75, 84, 56, 41, 31, 56, 89);

//		sorting in a natural order
		list = list.stream().sorted().collect(Collectors.toList());

		System.out.println(list);

//		sorting in reverse order
		list = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		System.out.println(list);
	}

}

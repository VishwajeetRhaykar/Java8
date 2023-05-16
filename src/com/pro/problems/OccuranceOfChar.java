package com.pro.problems;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class OccuranceOfChar {

	public static void main(String[] args) {

		String s = "Hello world";

//		char[]  ch = s.toCharArray();

		Map<String, Integer> map = new LinkedHashMap();

		for (String word : s.split(" ")) {
			map.put(word, map.containsKey(word) ? map.get(word) + 1 : 1);
		}

		map.forEach((k, v) -> {
			if (k !=" ")
				System.out.println(k + " " + v);
		});

//		Second Way

		Map<String, Long> charCount = Arrays.stream(s.split(" ")).filter(X -> X!=" "&&X!="")
										.collect(Collectors.groupingBy(a -> a, LinkedHashMap::new,Collectors.counting()));
		System.out.println(charCount);
	}

};
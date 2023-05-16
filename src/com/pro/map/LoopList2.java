package com.pro.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class LoopList2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add(null);
		list.add("D");
		list.add("E");

		System.out.println("filtering null");

		list.forEach(k -> {
			if (k != null) {
				System.out.println(k);	
			}
		});
		System.out.println("by using filter()");

		list.stream().filter(k -> k != null).forEach(System.out::println);

		System.out.println("by using filter() & Objects class notNull()");

		list.stream().filter(Objects :: nonNull).forEach(System.out::println);
	}

}

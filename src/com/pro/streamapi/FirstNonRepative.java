package com.pro.streamapi;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepative {

	public static void main(String[] args) {

//		String s = "India is nice";
		String s = "Pranav";

//		  by using indexOf and lastIndexof

		for (char i : s.toLowerCase().toCharArray()) {
//			 if(s.indexOf(i)==s.lastIndexOf(i))
//			 {
//				 System.out.println(i);
//			 }

		}

//     above Program in java8

		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		for (Character i : s.toLowerCase().toCharArray()) {
			m.put(i, m.containsKey(i) ? m.get(i) + 1 : 1);
		}
		System.out.println(m);
		Character ch = m.entrySet().stream().filter(a -> a.getValue() == 1).findFirst().get().getKey();

		System.out.println(ch);

	}

}

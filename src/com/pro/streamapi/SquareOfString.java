package com.pro.streamapi;

import java.util.ArrayList;
import java.util.List;

public class SquareOfString {

	public static void main(String[] args) {
		List list = new ArrayList();
		String[] s = { "10", "20", "ab", "30", "50" };
		try {
			for (String n : s) {
				if (Character.isDigit(n.charAt(0))) {
					Integer i = Integer.parseInt(n);
					System.out.println(i);
				}
			}

		} catch (NumberFormatException e) {

		}
	}
}

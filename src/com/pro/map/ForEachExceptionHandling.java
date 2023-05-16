package com.pro.map;

import java.util.ArrayList;
import java.util.List;

public class ForEachExceptionHandling {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("10");
		list.add("30");
		list.add("AA");
		list.add("6");
		list.add("58");
		
		list.forEach(k ->{
			try {
			Integer i = Integer.parseInt(k);
			System.out.println("Value is "+i);
			}catch(Exception e)
			{
//				e.printStackTrace();
				System.out.println("Exception Occured ");
			}
		});
		
	}

}

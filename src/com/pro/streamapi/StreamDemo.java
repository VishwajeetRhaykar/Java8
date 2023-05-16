package com.pro.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String [] args)
	{
		
		ArrayList<Integer> al = new ArrayList();
		
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		al.add(30);
		al.add(35);
		al.add(40);
		al.add(45);
		al.add(50);
		
//	List<Integer> list = al.stream().filter(a -> a<25).collect(Collectors.toList());
		

		
//	al.stream().forEach(System.out :: println);
	
//	List<Integer> list = al.stream().sorted((a,b) -> -a.compareTo(b) ).collect(Collectors.toList());
//	System.out.println(list);
		

	}
	

}

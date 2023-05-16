package com.pro.map;

import java.util.HashMap;
import java.util.Map;

public class ForEachInMap {

	public static void main(String[] args) {

		
		  Map<String, Integer> map = new HashMap<>();
	      map.put("A", 10);
	      map.put("B", 20);
	      map.put("C", 30);
	      map.put("D", 40);
	      map.put("E", 50);
	      map.put("F", 60);
	      
//	     Map iterating 
	      for(Map.Entry<String, Integer> e : map.entrySet())
	      {
	    	  System.out.println("Key is :"+e.getKey()+"   value is  :"+e.getValue());
	      }
	      
//	      Using Java 8
	      
	    map.forEach((k,v) -> System.out.println("key :"+k+"  value :"+v));
	}

}

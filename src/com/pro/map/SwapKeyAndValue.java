package com.pro.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SwapKeyAndValue {
	
	public static void main(String[] args) {
		
		 Map<String, Integer> map = new HashMap<>();
	      map.put("A", 10);
	      map.put("B", 20);
	      map.put("C", 30);
	      map.put("D", 40);
	      map.put("E", 50);
	      map.put("F", 60);
	      
	      Map<Integer, String> swapedMap = new HashMap<>();
	      
	      map.forEach((k,v) ->{
	    	  
	    	  swapedMap.put(v,k);	  
	      }
	      );	      
	      System.out.println(map);
	      System.out.println("After swaping ");
	      System.out.println(swapedMap);
	      
	Map map1 = map.entrySet().stream().collect(Collectors.toMap(Map.Entry :: getValue, Map.Entry :: getKey,(oldValue,newValue)-> oldValue,LinkedHashMap :: new));
	   System.out.println("Second way ");   
	 System.out.println(map1);
	
	}

}

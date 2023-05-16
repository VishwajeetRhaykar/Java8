package com.pro.map;
import java.util.HashMap;
import java.util.Map;

public class LoopMap {

	public static void main(String[] args) {
		 Map<String, Integer> map = new HashMap<>();
	      map.put("A", 10);
	      map.put("B", 20);
	      map.put("C", 30);
	      map.put(null, 40);
	      map.put("E", null);
	      map.put("F", 60);
	      
	      if(map != null)
	      {
	    	  map.forEach((k,v) -> System.out.println(k+"  "+v));
	      }
	      
	      System.out.println("null checking in null");
	      
	      map.forEach((k,v) -> {
	    	  if(k != null && v != null)
	    	  {
	    		  System.out.println(k+"  "+v);
	    	  }
	      });
	}

}

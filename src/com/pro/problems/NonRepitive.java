package com.pro.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NonRepitive {
	
	
     public static void main(String[] args) {
    	 String s = "hello";
    		
         Map<Character, Integer> map = new LinkedHashMap();	
         
         for(Character ch : s.toLowerCase().toCharArray())
         {
        	 map.put(ch, map.containsKey(ch)? map.get(ch)+1:1);
         }
         
       Character ch =  map.entrySet().stream().filter(e -> e.getValue()==1).findFirst().get().getKey();
         
       System.out.println(ch);
   
//   By using Collections frequency method
       String f = Arrays.stream(s.split(""))
    		   .filter(a -> Collections.frequency(Arrays.asList(s.split("")),a)==1)
    		   .findFirst().get();
    		   	
       System.out.println(f);
       
// Finding Occurance Of Characters 
       
    Arrays.stream(s.split(""))
    		  .collect(Collectors.groupingBy(a->a,LinkedHashMap::new,Collectors.counting()))
    		  .forEach((k,v) -> System.out.println(k+" "+v));
    
    Map<String, Long> occ =  Arrays.stream(s.split(""))
  		  .collect(Collectors.groupingBy(a->a,LinkedHashMap::new,Collectors.counting()));
//      System.out.println(occ);
    
       
   String v= Arrays.stream(s.split("")).filter(a -> s.indexOf(a)==s.lastIndexOf(a)).findFirst().get();
    
   System.out.println(v);
   
	}
	
	
	

}

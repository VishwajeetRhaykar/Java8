package com.pro.map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LoopList {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<>();
	      list.add("A");
	      list.add("B");
	      list.add("D");
	      list.add("E");
	      list.add("C");
	      
	     List l= Collections.unmodifiableList(list);
//	     l.add(10);
	     list.remove("D");
	     System.out.println(l);
//
//	      System.out.println("noramal way of itorating ");
//	      for(String l : list)
//	      {System.out.println(l);}
//	
//	      System.out.println("using forEACH() by lambda ");
//	      
//	      list.forEach(k->System.out.println(k));
//	      
//	      System.out.println(">>><<<by using method reference >><<");
//	      
//	      list.forEach(System.out :: println);
//	      
//	      List l1 = list.stream().sorted().collect(Collectors.toList());
//	      List l2 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//	      List l3 = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
//	      System.out.println(l1);
//	      System.out.println(l2);
//	      System.out.println(l3);
	}

}

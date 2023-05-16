package com.pro.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListOfBooks {

	public static void main(String[] args) {

		Product p1 = new Product("RichDAD","Books",300);
		Product p2 = new Product("Car","Toy",250);
		Product p3 = new Product("soap","Baby",90);
		Product p5 = new Product("phone","Toy",240);
		Product p4 = new Product("Panipat","Books",450);
		Product p6 = new Product("Dhananjay","Books",600);
		Product p7 = new Product("powder","Baby",600);
		
		List<Product> list = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
		
		List<Product> l = list.stream().filter(x ->x.category=="Books"&&x.price<500).collect(Collectors.toList());
		
		System.out.println(l);
		
//		List by baby category
		
		List<Product> l1 = list.stream().filter(x ->x.category=="Baby").collect(Collectors.toList());
		System.out.println(l1);
		
//		List by Toy category and giving discount
		
		List<Product> l2 = list.stream().filter(x ->x.category=="Toy").map(x ->{x.setPrice(x.getPrice()-(x.getPrice()/10));return x;}).collect(Collectors.toList());
		System.out.println(l2);
		
		Product P = list.stream().filter(x ->x.category=="Books").min(Comparator.comparingInt(Product::getPrice)).get();
		System.out.println(P);
		
		Map<String,Optional<Product>> map = list.stream().collect(Collectors.groupingBy(Product::getCategory,Collectors.maxBy(Comparator.comparing(Product:: getPrice))));
		System.out.println(map);
		
		List<Product> l3 = list.stream().skip(list.size()-3).collect(Collectors.toList());
		System.out.println(l3);
		
	}
	

}

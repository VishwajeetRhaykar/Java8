package com.pro.studentproblem;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ExactName {

	public static void main(String[] args) {

		Student s1 = new Student("Ram","Pune",9096);
		Student s2 = new Student("Hari","Munbai",9090);
		Student s3 = new Student("Umesh","Kolhapur",9091);
		Student s4 = new Student("Prasad","Pune",9076);
		Student s5 = new Student("Pavan","Sangli",9097);
		Student s6 = new Student("Ram","Kolhapur",9086);
		Student s7 = new Student("Nikhil","Satara",9090);
		Student s8 = new Student("Aniket","Sangli",9023);
		Student s9 = new Student("Akshay","Pune",9029);
		
		List<Student> list = Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9);
		
//		Finding exact student who's name is ram
		
	List<Student> st = list.stream().filter(a -> a.getName()=="Ram")
			.collect(Collectors.toList());
		System.out.println(st);
//		Finding exact student who's adress is kolhapur	
		List<Student> stad = list.stream().filter(a -> a.getAddress()=="Kolhapur")
				.collect(Collectors.toList());
			System.out.println(stad);
			
//		Get all student having mobile numbers 9090.
			
			List<Student> sN = list.stream()
					.filter(a -> a.getMobileNo()==9090)
					.collect(Collectors.toList());
			System.out.println(sN);
//	 Get all student having mobile number 9090 and 9191
			List<Student> l = list.stream()
					.filter(a -> a.getMobileNo()==9090|| a.getMobileNo()==9091)
					.collect(Collectors.toList());
			System.out.println(l);
			
//		Convert List<Student> to List<String> of student name
	
			List<String> nm = list.stream()
					.map(a -> a.getName()).collect(Collectors.toList());
			
			Set<String> set = list.stream()
					.map(a -> a.getName())
					.collect(Collectors.toSet());
					
			System.out.println(nm);
			System.out.println(set);
			
//			Converting list to string
			
			String lis = list.toString();	
//			System.out.println(lis);
//			Converting list to string by using java8
			
			lis = list.stream()
					.map(a -> a.toString())
					.collect(Collectors.joining());
			System.out.println(lis);
					
	}

}

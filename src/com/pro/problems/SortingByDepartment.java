
package com.pro.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingByDepartment {

	public static void main(String[] args) {

		Student s1 = new Student(10,"Ram","IT");
		Student s2 = new Student(20,"Sham","Mech");
		Student s3 = new Student(50,"Hari","Auto");
		Student s4 = new Student(40,"Umesh","Civil");
		Student s5 = new Student(30,"Nilesh","ENTC");
		
		List<Student> list = Arrays.asList(s1,s2,s3,s4,s5);
// sorting by department
		List l = list.stream().sorted(Comparator.comparing(Student :: getDepartment)).collect(Collectors.toList());
		
		System.out.println(l);
	}

}

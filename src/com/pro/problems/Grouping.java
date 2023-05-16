
package com.pro.problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {

	public static void main(String[] args) {

		Student s1 = new Student(10,"Ram","IT");
		Student s2 = new Student(20,"Sham","Mech");
		Student s3 = new Student(50,"Hari","Auto");
		Student s4 = new Student(40,"Umesh","IT");
		Student s5 = new Student(30,"Nilesh","Mech");
		
		List<Student> list = Arrays.asList(s1,s2,s3,s4,s5);
// Grouping by departments
		Map<String, List<Student>> map = list.stream().collect(Collectors.groupingBy(Student :: getDepartment));
		
		System.out.println(map);
	}

}

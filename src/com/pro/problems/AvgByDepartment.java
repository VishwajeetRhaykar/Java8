package com.pro.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AvgByDepartment {

	public static void main(String[] args) {

		Employee e1 = new Employee("Ram","IT",50000);
		Employee e3 = new Employee("Hari","Prod",30000);
		Employee e2 = new Employee("Nilesh","Dev",40000);
		Employee e4 = new Employee("Vipul","Dev",20000);
		Employee e6 = new Employee("Pranav","HR",35000);
		Employee e5 = new Employee("Mayur","QA",30000);
		Employee e7 = new Employee("Hemant","IT",40000);
		
		List<Employee> list = Arrays.asList(e1,e3,e5,e2,e6,e4,e7);
		
		Map<String,Double> map = list.stream()
				.collect(Collectors.groupingBy(a -> a.getDepartment(),Collectors.averagingInt(Employee::getSalary)));
		
		System.out.println(map);
	}

}

package com.tampro.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsExample04 {
	//list sang map
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(1, "Tam", "C", 15,Role.DEVELOPER),
				new Employee(2, "Tam", "Nguyen", 25,Role.TESTER),
				new Employee(3, "Nguyen", "B", 15,Role.TESTER),
				new Employee(4, "Nguyen", "A", 35,Role.DEVELOPER),
				new Employee(5, "Tran", "D", 35,Role.DEVELOPER)
			);
		System.out.println("************* key = id, value = customer ************");
		Map<Long, Employee> map = 
							employees.stream()
							 .collect(Collectors.toMap(Employee::getId, Function.identity()));
														//key					//value
		map.forEach((key, value) -> System.out.println("Key : "+ key +" - Value : " + value));
	}

}

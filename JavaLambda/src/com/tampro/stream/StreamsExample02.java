package com.tampro.stream;

import java.util.Arrays;
import java.util.List;

public class StreamsExample02 {
	//https://stackjava.com/java8/stream-api-la-gi-stream-api-trong-java-8.html
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
					new Employee(1, "Tam", "C", 15,Role.DEVELOPER),
					new Employee(2, "Tam", "Nguyen", 25,Role.TESTER),
					new Employee(3, "Nguyen", "B", 15,Role.TESTER),
					new Employee(4, "Nguyen", "A", 35,Role.DEVELOPER),
					new Employee(5, "Tran", "D", 35,Role.DEVELOPER)
				);
		int total = employees.stream()
					.filter((item) -> item.getRole() == Role.DEVELOPER)
					.mapToInt((item) -> item.getPrice())//map ra int
					.sum();
		// in tong luon cua nhan vien co role la Developper
		System.out.println("Tổng lương là : "+total);
		System.out.println(employees.stream().count());
		System.out.println(employees.stream()
					.allMatch((item) -> item.getRole() == Role.DEVELOPER));
		//allMatch(): trả về true nếu tất cả các phần tử khớp với Predicate.

		System.out.println(employees.stream()
				.anyMatch((item) -> item.getRole() == Role.DEVELOPER));
		//anyMatch(): trả về true nếu có ít nhất 1 phần tử khớp với Predicate.
		System.out.println(employees.stream()
				.noneMatch((item) -> item.getRole() == Role.DEVELOPER));
		//noneMatch(): trả về true nếu không có phần tử nào khớp với Predicate.
		
		
		
	}

}

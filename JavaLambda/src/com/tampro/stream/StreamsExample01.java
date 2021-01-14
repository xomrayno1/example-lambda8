/**
 * 
 */
package com.tampro.stream;

import java.util.Arrays;
import java.util.List;

import com.tampro.unit1.Person;

/**
 * @author Admin
 *
 */
public class StreamsExample01 {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("Nguyen" , "C" , 19),
				new Person("Tran" , "D" , 15),
				new Person("Le" , "A" , 25),
				new Person("Phan" , "B" , 21)
				);
		persons.stream()
		.filter( (p) -> p.getLastName().startsWith("C"))
		.forEach(p->System.out.println(p.getLastName()));
		
		long count = persons.stream()
		.filter( (p) -> p.getLastName().startsWith("C"))
		.count();
		System.out.println(count);
		
	}

}

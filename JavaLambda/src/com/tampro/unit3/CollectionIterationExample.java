/**
 * 
 */
package com.tampro.unit3;

import java.util.Arrays;
import java.util.List;

import com.tampro.unit1.Person;

/**
 * @author TamNguyen
 *
 */
public class CollectionIterationExample {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("Nguyen" , "C" , 19),
				new Person("Tran" , "D" , 15),
				new Person("Le" , "A" , 25),
				new Person("Phan" , "B" , 21)
				);
	
		System.out.println("Using for loop");
		for(int i = 0  ; i< persons.size() ; i++) {
			System.out.println(persons.get(i));
		}
		System.out.println("Using for each loop");
		for(Person person : persons) {
			System.out.println(person);
		}
		 
		System.out.println("Using lambda for each loop");
		//persons.forEach(p -> System.out.println(p));
		persons.forEach(System.out::println);
	}
}

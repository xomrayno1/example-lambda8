package com.tampro.unit1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1Excercise {
	public static void main(String[] args) {
		List<Person> peoples = Arrays.asList(
				new Person("Nguyen" , "C" , 19),
				new Person("Tran" , "D" , 15),
				new Person("Le" , "A" , 25),
				new Person("Phan" , "B" , 21)
				);
		//Step 1 : Sort list by last name
		List<Person> newList = sortByLastName(peoples);
		//Step 2 : Create a method that prints all elements in the list
		showPerson(newList);
		//Step 3 : Create a method that prints all people that have last name begining with c
		printConditionally(newList, (p)-> p.getLastName().startsWith("C") );
		System.out.println("performConditionally p ->true");
		performConditionally(newList, p -> true, p -> System.out.println(p));
	}
 
	
	public	static List<Person> sortByLastName(List<Person> list){
//		list.sort(new Comparator<Person>() {
//
//			@Override
//			public int compare(Person o1, Person o2) {
//				// TODO Auto-generated method stub
//				return o1.getLastName().compareToIgnoreCase(o2.getLastName());
//			}
//		}); //java 7
		list.sort(
				( o1, o2)-> o1.getLastName().compareToIgnoreCase(o2.getLastName())
				); //java 8
		return list;
	}
	public static void showPerson(List<Person> list) {
		for(Person person : list) {
			System.out.println(person);
		}
	}
	public static void printConditionally(List<Person> list, Predicate<Person> predicate) {
//		for(Person person : list) {
//			if(person.getLastName().startsWith("C")) {
//				System.out.println(person);
//			}
//		} //java 7
		for(Person person : list) {
			if(predicate.test(person)) {
				System.out.println(person);
			}
		} //java 8
	}
	public static void performConditionally(List<Person> list, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person person : list) {
			if(predicate.test(person)) {
				consumer.accept(person);
			}
		} 
	}
	 
}

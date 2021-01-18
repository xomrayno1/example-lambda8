package com.tampro.unit5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.tampro.unit1.Person;

public class OptionalClassApp {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("Nguyen" , "C" , 19),
				new Person("Tran" , "D" , 15),
				new Person("Le" , "A" , 25),
				new Person("Phan" , "B" , 21)
				);
		Optional<Person> optional = Optional.ofNullable(null);
		//nếu value null in ra option.empty
		//Optional.of  không cho phép sử dụng value null
		Person person = null; // nếu in ra sẽ báo lỗi NullPointException
		System.out.println(optional);
		
		
		Optional<Person> optional2 = Optional.empty(); // value optionEmpty
		System.out.println(optional2);
		
		 
		
		Optional<Person> optional3 =
				Optional.ofNullable(new Person("Nguyen" , "C" , 19));
		
		Person newPerson = optional2.orElse(new Person("Nguyen" , "C" , 19));
		// trả về giá trị Person nếu optional2 == null
		System.out.println(newPerson);
		
		System.out.println(optional3.get());
		//trả về giá trị trong optional
		
		
		try {
			optional2.orElseThrow(()-> new Exception("clgt"));
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}

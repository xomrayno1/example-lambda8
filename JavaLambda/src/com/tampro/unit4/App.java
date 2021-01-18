package com.tampro.unit4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class App {
	public static void main(String[] args) {
//		DefaultInterface defaultInt = (a , b) -> {
//			return a + b;
//		};
//		int sumValue = defaultInt.sum(3, 5);
//		System.out.println(sumValue);
//		defaultInt.show();
		List<Customer> customers  = 
				Arrays.asList(	new Customer(1, "Tran", "A"),
						new Customer(1, "Nguyen", "A"),
						new Customer(2, "Le", "A"),
						new Customer(3, "Cr", "A"));
		
		showAllCustomers(customers,
				(item)-> item.getFirstName().equals("Tran"),
				(item)-> {
						 System.out.println(item.getFirstName() +" - "+ item.getLastName());
					}
				);
		
	}
	public static void showAllCustomers(List<Customer> customers, 
							Predicate<Customer> predicate,
							Consumer<Customer> consumer) {
		customers.forEach((item)->{
			if(predicate.test(item)) {
				consumer.accept(item);
			}
		});
	}
}

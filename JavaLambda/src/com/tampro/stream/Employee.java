package com.tampro.stream;

import java.util.Comparator;

public class Employee implements Comparator<Employee>{
	private long id;
	private String firstName;
	private String lastName;
	private int price;
	private Role role;
	
	
	public Employee() {
		 
	}
	public Employee(long id, String firstName, String lastName, int price,Role role) {
		 
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.price = price;
		this.role = role;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", price=" + price
				+ ", role=" + role + "]";
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getFirstName().compareTo(o2.getFirstName());
	}
	
	

}

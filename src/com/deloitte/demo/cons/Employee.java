package com.deloitte.demo.cons;

public class Employee {

	int eid;
	String firstName;
	double salary;

	public Employee() {
		System.out.println("constructor called");
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

}

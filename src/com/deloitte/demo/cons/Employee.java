package com.deloitte.demo.cons;

public class Employee {

	int eid;
	String firstName;
	double salary;

	public Employee() {
		System.out.println("default constructor");
	}

	public Employee(String firstName, double salary) {
		System.out.println("2 parameterized constructor");
		this.firstName = firstName;
		this.salary = salary;

	}

	public Employee(int eid, String firstName, double salary) {
		System.out.println("all parameterized constructor");
		this.eid = eid;
		this.firstName = firstName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

}

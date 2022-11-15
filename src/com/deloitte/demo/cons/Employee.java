package com.deloitte.demo.cons;

public class Employee {

	int eid;
	String firstName;
	double salary;

	public Employee() {
		System.out.println("default constructor");
	}

	public Employee(int eid, String firstName, double salary) {
		System.out.println("parameterized constructor");
		this.eid = eid;
		this.firstName = firstName;
		this.salary = salary;

	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

}
